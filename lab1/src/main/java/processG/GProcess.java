package processG;

import comp.computation.ComputationClient;

import java.io.IOException;


public class GProcess {
    public static void main(String[] args) {
        try {
            System.out.println("Connected, starting G process...");

            ComputationClient g = new ComputationClient('G');

            g.compute(args[0]);

            System.out.println("FunctionG process completed successfully.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

