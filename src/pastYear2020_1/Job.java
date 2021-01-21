package pastYear2020_1;

/**
 *
 * @author TING WEI JING
 */
public class Job {
    private String name;
    private int taskNum;
    private int memory;

    public Job(String name, int taskNum, int memory) {
        this.name = name;
        this.taskNum = taskNum;
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public int getTaskNum() {
        return taskNum;
    }

    public int getMemory() {
        return memory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTaskNum(int taskNum) {
        this.taskNum = taskNum;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return String.format("Job Name : %s Memory = %dGB Number Of Task = %d",
                             name,
                             memory,
                             taskNum);
    }
    
    
}
