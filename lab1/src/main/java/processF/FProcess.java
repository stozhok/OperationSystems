package processF;

import comp.computation.ComputationClient;

import java.io.IOException;

public class FProcess {
    public static void main(String[] args) {
        try {
            System.out.println("Connected, starting F process...");

            ComputationClient f = new ComputationClient('F');

            f.compute(args[0]);

            System.out.println("FunctionF process completed successfully.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}