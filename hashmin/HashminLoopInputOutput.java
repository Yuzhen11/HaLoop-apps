import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.iterative.LoopInputOutput;

public class HashminLoopInputOutput implements LoopInputOutput {

        @Override
        public List<String> getLoopInputs(JobConf conf, int iteration, int step) {
                List<String> paths = new ArrayList<String>();
                int currentPass = 2 * iteration + step;
                paths.add(conf.getOutputPath() + "/i" + (currentPass - 1));
                if (currentPass == 0) {
                        paths.add(conf.getInputPath());
                }
                
                //load the color table
                if (step == 1)
                {
                	paths.add(conf.getOutputPath() + "/i" + (currentPass - 2));
                }
                
                return paths;
        }

        @Override
        public String getLoopOutputs(JobConf conf, int iteration, int step) {
                int currentPass = 2 * iteration + step;
                return (conf.getOutputPath() + "/i" + currentPass);
        }

}

