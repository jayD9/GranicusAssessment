package calculator;

import beans.RiceVolunteers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * author JD
 * created 1/14/21 10:05 AM
 */

/*
* Act as middleware between Data and Caller, calls all the business operation.
* */
public class RiceVolunteersCalculator {

    private List<RiceVolunteers> list = new ArrayList<>();
    String file;

    public RiceVolunteersCalculator(String file) {
        this.file = file;
    }

    public List<RiceVolunteers> getList() {
        return list;
    }

    public void setList(List<RiceVolunteers> list) {
        this.list = list;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public void processFile() {
        try {
            readFile();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        for(RiceVolunteers riceVolunteers : list){
            riceVolunteers.calculateBagsStillNeeded();
            riceVolunteers.calculateBagsStockedPerVolunteer();
            riceVolunteers.calculateVolunteersNeeded();
        }
    }

    public void readFile() throws IOException {
        FileReader fileReader = new FileReader(this.getFile());
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = bufferedReader.readLine();
        while ((line = bufferedReader.readLine()) != null) {
            if (line == "volunteers,goal_bags,actual_bags" || line == "days,volunteers,goal_bags,actual_bags")
                continue;
            RiceVolunteers riceVolunteers;
            String[] ch = line.split(",");
            if(ch.length == 4){
                riceVolunteers = new RiceVolunteers(Integer.parseInt(ch[1]),Integer.parseInt(ch[2]),Integer.parseInt(ch[3]),ch[0]);
            }else{
                riceVolunteers = new RiceVolunteers(Integer.parseInt(ch[0]),Integer.parseInt(ch[1]),Integer.parseInt(ch[2]));
            }
            this.list.add(riceVolunteers);
        }
        bufferedReader.close();
    }

    public void sortList(){
        Collections.sort(this.list, new Comparator<RiceVolunteers>() {
            public int compare(RiceVolunteers o1, RiceVolunteers o2) {
                return o2.getVolunteersNeeded().compareTo(o1.getVolunteersNeeded());
            }
        });
    }
}
