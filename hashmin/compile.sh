haloop com.sun.tools.javac.Main Hashmin.java

jar cf Hashmin.jar *.class

haloop jar Hashmin.jar Hashmin /yuzhen/toytest/ /yuzhen/output

haloop fs -rmr /yuzhen/output


haloop com.sun.tools.javac.Main Hashmin.java HashminLoopInputOutput.java HashminReduceCacheFilter.java HashminReduceCacheSwitch.java HashminStepHook.java
