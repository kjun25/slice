package org.etri.slice.tools.adl.generator.compiler

import org.etri.slice.tools.adl.domainmodel.AgentDeclaration

class MetaDataCompiler {	
	
	def compileMetaData(AgentDeclaration it) '''
		<ipojo xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			xsi:schemaLocation="org.apache.felix.ipojo http://felix.apache.org/ipojo/schemas/CURRENT/core.xsd"
			xmlns="org.apache.felix.ipojo">
			<!--
				Declare your component types and instances here
			-->
		
			<!--
		
			<component classname="$YOUR_COMPONENT_CLASS">
		
			</component>
			<instance component="$YOUR_COMPONENT_CLASS" />
		
			-->
		</ipojo>		
	'''	
	

}
