In order to build the docker container using maved use the follwing plugin

Maven Spotify plugin
```
<!-- Docker -->
			<plugin>
				<groupId>com.spotify</groupId>
				<artifactId>dockerfile-maven-plugin</artifactId>
				<version>1.4.10</version>
				<executions>
					<execution>
						<id>default</id>
						<goals>
							<goal>build</goal>
							<!-- <goal>push</goal> -->
						</goals>
					</execution>
				</executions>
				<configuration>
					<repository>nitinkc/${project.name}</repository>
					<tag>${project.version}</tag>
					<skipDockerInfo>true</skipDockerInfo>
				</configuration>
			</plugin>
```

**For respository tag, use the dockerhub user id**
<repository>nitinkc/${project.name}</repository>


in the terminal, issue the following command
```shell script
mvn clean package
```

This will generate a conatiner in the end with logs ending like

```shell script
[INFO]  ---> 718406c5426d
[INFO] Successfully built 718406c5426d
[INFO] Successfully tagged nitin/conversion-service:0.0.1-SNAPSHOT
[INFO] 
[INFO] Detected build of image with id 718406c5426d
[INFO] Successfully built nitin/conversion-service:0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------

```

In order to test run on the machine, issue the following command

```shell script
 docker container run --publish 8000:8000 nitin/conversion-service:0.0.1-SNAPSHOT
```