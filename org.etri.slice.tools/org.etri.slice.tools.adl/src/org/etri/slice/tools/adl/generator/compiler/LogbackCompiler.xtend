package org.etri.slice.tools.adl.generator.compiler

import org.etri.slice.tools.adl.domainmodel.AgentDeclaration

class LogbackCompiler {	
	
	def compileLogback(AgentDeclaration it) '''
		<configuration>
			# Console appender
			<appender name="stdout" class="ch.qos.logback.core.ConsoleAppender">
				<layout class="ch.qos.logback.classic.PatternLayout">
					# Pattern of log message for console appender
					<Pattern>%d{HH:mm:ss.SSS} |-%-5level in %logger{32} - %msg%n
					</Pattern>
				</layout>
			</appender>
		
			# File appender
			<appender name="fout" class="ch.qos.logback.core.FileAppender">
				# Name of a log file
				<file>log/org.etri.slice.log</file>
				<append>false</append>
				<encoder>
					# Pattern of log message for file appender
					<pattern>%d{HH:mm:ss.SSS} |-%-5level in %logger{32} - %msg%n
					</pattern>
				</encoder>
			</appender>
		
			# Rolling appenders
			<appender name="roll-by-size"
				class="ch.qos.logback.core.rolling.RollingFileAppender">
				<file>log/roll-by-size/org.etri.slice.log</file>
				<rollingPolicy class="ch.qos.logback.core.rolling.FixedWindowRollingPolicy">
					<fileNamePattern>log/roll-by-size/org.etri.slice.%i.log.zip
					</fileNamePattern>
					<minIndex>1</minIndex>
					<maxIndex>3</maxIndex>
					<totalSizeCap>1MB</totalSizeCap>
				</rollingPolicy>
				<triggeringPolicy
					class="ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy">
					<maxFileSize>5KB</maxFileSize>
				</triggeringPolicy>
				<encoder>
					<pattern>%-4relative [%thread] %-5level %logger{35} - %msg%n
					</pattern>
				</encoder>
			</appender>
		
			<appender name="roll-by-time"
				class="ch.qos.logback.core.rolling.RollingFileAppender">
				<file>log/roll-by-time/org.etri.slice.log</file>
				<rollingPolicy class="ch.qos.logback.core.rolling.TimeBasedRollingPolicy">
					<fileNamePattern>log/roll-by-time/org.etri.slice.%d{yyyy-MM-dd-HH-mm}.log.zip
					</fileNamePattern>
					<maxHistory>20</maxHistory>
					<totalSizeCap>1MB</totalSizeCap>
				</rollingPolicy>
				<encoder>
					<pattern>%d{HH:mm:ss.SSS} |-%-5level in %logger{32} - %msg%n
					</pattern>
				</encoder>
			</appender>
		
			<appender name="roll-by-time-and-size"
				class="ch.qos.logback.core.rolling.RollingFileAppender">
				<file>log/roll-by-time-and-size/org.etri.slice.log</file>
				<rollingPolicy
					class="ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy">
					<fileNamePattern>log/roll-by-time-and-size/org.etri.slice.%d{yyyy-MM-dd-mm}.%i.log.zip
					</fileNamePattern>
					<maxFileSize>5KB</maxFileSize>
					<maxHistory>20</maxHistory>
					<totalSizeCap>1MB</totalSizeCap>
				</rollingPolicy>
				<encoder>
					<pattern>%d{HH:mm:ss.SSS} |-%-5level in %logger{32} - %msg%n
					</pattern>
				</encoder>
			</appender>
		
			# Override log level for specified package
		<!-- 	
			<logger name="org.etri.slice" level="TRACE">
				<appender-ref ref="roll-by-size" />
				<appender-ref ref="roll-by-time" />
				<appender-ref ref="roll-by-time-and-size" />
			</logger>
		-->
			<logger name="ch.qos.logback" level="warn" />
			<logger name="org.apache" level="warn" />
			<logger name="org.drools" level="info" />
		
			<logger name="org.etri.slice" level="debug" />
		
			<root level="info">
				<appender-ref ref="stdout" />
			</root>
		</configuration>
	'''	
}
