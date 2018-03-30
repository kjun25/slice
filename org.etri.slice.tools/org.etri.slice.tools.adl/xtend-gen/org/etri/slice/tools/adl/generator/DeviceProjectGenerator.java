package org.etri.slice.tools.adl.generator;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.etri.slice.tools.adl.domainmodel.Action;
import org.etri.slice.tools.adl.domainmodel.AgentDeclaration;
import org.etri.slice.tools.adl.domainmodel.Behavior;
import org.etri.slice.tools.adl.domainmodel.Call;
import org.etri.slice.tools.adl.domainmodel.Context;
import org.etri.slice.tools.adl.domainmodel.DataType;
import org.etri.slice.tools.adl.generator.BehaviorGenerator;
import org.etri.slice.tools.adl.generator.OutputPathUtils;
import org.etri.slice.tools.adl.generator.compiler.LogbackCompiler;
import org.etri.slice.tools.adl.generator.compiler.MetaDataCompiler;
import org.etri.slice.tools.adl.generator.compiler.POMCompiler;

@SuppressWarnings("all")
public class DeviceProjectGenerator implements IGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  @Extension
  private BehaviorGenerator _behaviorGenerator;
  
  @Inject
  @Extension
  private MetaDataCompiler _metaDataCompiler;
  
  @Inject
  @Extension
  private POMCompiler _pOMCompiler;
  
  @Inject
  @Extension
  private LogbackCompiler _logbackCompiler;
  
  @Inject
  @Extension
  private OutputPathUtils _outputPathUtils;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<AgentDeclaration> _filter = Iterables.<AgentDeclaration>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), AgentDeclaration.class);
    for (final AgentDeclaration e : _filter) {
      {
        this.generateDevice(e, fsa);
        this.generateMavenProject(e, fsa);
        this.generateMetaData(e, fsa);
        this.generateLogback(e, fsa);
      }
    }
  }
  
  public void generateDevice(final AgentDeclaration it, final IFileSystemAccess fsa) {
    EList<Behavior> _behaviors = it.getBehaviorSet().getBehaviors();
    for (final Behavior b : _behaviors) {
      {
        EList<DataType> _types = b.getSituation().getTypes();
        for (final DataType t : _types) {
          {
            DataType type = t;
            if ((type instanceof Context)) {
              this._behaviorGenerator.generateSensor(((Context)type), it, fsa);
            }
          }
        }
        Action action = b.getAction();
        if ((action instanceof Call)) {
          this._behaviorGenerator.generateService(((Call)action).getControl(), it, fsa);
        }
      }
    }
  }
  
  public void generateMavenProject(final AgentDeclaration it, final IFileSystemAccess fsa) {
    String _deviceMavenHome = this._outputPathUtils.getDeviceMavenHome(it);
    String _plus = (_deviceMavenHome + "bundle.properties");
    fsa.generateFile(_plus, this.compileBundleProperties(it));
    String _deviceMavenHome_1 = this._outputPathUtils.getDeviceMavenHome(it);
    String _plus_1 = (_deviceMavenHome_1 + "pom.xml");
    fsa.generateFile(_plus_1, this._pOMCompiler.compileDevicePOM(it));
  }
  
  public void generateMetaData(final AgentDeclaration it, final IFileSystemAccess fsa) {
    String _deviceMavenResHome = this._outputPathUtils.getDeviceMavenResHome(it);
    String _plus = (_deviceMavenResHome + "metadata.xml");
    fsa.generateFile(_plus, this._metaDataCompiler.compileMetaData(it));
  }
  
  public void generateLogback(final AgentDeclaration it, final IFileSystemAccess fsa) {
    String _deviceMavenResHome = this._outputPathUtils.getDeviceMavenResHome(it);
    String _plus = (_deviceMavenResHome + "logback.xml");
    fsa.generateFile(_plus, this._logbackCompiler.compileLogback(it));
  }
  
  public CharSequence compileBundleProperties(final AgentDeclaration it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# Configure the created bundle");
    _builder.newLine();
    _builder.append("embed.dependency=;scope=!provided|test");
    _builder.newLine();
    _builder.append("embed.directory=lib");
    _builder.newLine();
    _builder.append("bundle.classpath=.,{maven-dependencies}\t\t");
    _builder.newLine();
    _builder.append("private.packages=org.etri.slice.devices.");
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(it.eContainer());
    _builder.append(_fullyQualifiedName);
    _builder.append(".");
    String _lowerCase = it.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.append(".*");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
