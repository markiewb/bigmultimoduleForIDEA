# bigmultimoduleForIDEA
A Maven multimodule with generated-sources and a long-running WAR-module. Tests the Maven support of IntellJ IDEA 2016.3.x

# How to import and detect generated sources
1. Load the project via File-> Open -> ... -> pom.xml (Let IDEA open it in a new window)
2. File -> Settings -> ... -> Maven Importing
  * Generated source folders: "subdirectories of target/generated sources"
  * Phase for folders update: "process-test-resources"
3. In the Maven Projects Window
  * Right click on the root module (named "aggregator (root)") and choose "Generate Sources and Update Folders" 
      * Do not click the toolbar button "Generate Sources and Update Folders For All Projects". It takes twice as long  https://youtrack.jetbrains.com/issue/IDEA-166132
      
EXPECTED:
* target/generated-resources
* target/generated-test-resources
* target/generated-sources
* target/generated-test-sources

are detected by IDEA in the correct build scope

# How to import and detect generated sources but skip the long running import of the war module
1. Uncheck the profile "includingBigWar" in the Maven Projects view
2. Same as above

