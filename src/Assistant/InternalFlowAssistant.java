package Assistant;

import star.assistant.SimulationAssistant;
import star.assistant.Task;
import star.assistant.annotation.StarAssistant;

import java.util.ArrayList;
import java.util.List;

// Specifies the name of the Simulation Assistant in the GUI.
@StarAssistant(display = "Internal Flow Assistant")
public class InternalFlowAssistant extends SimulationAssistant {

    public InternalFlowAssistant() {
        // Creates a new array list for the list of tasks.
        List<Task> tasks = new ArrayList<Task>();
        // Contains the list of tasks.
        //tasks.add(new Task1Name());
        setOutline(tasks);
    }
}
