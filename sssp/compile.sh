haloop com.sun.tools.javac.Main SSSP.java

jar cf SSSP.jar *.class

haloop jar SSSP.jar SSSP /yuzhen/toytest/ /yuzhen/output 3

haloop fs -rmr /yuzhen/output


haloop com.sun.tools.javac.Main SSSP.java SSSPLoopInputOutput.java SSSPReduceCacheFilter.java SSSPReduceCacheSwitch.java SSSPStepHook.java
