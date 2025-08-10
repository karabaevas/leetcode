package easy.okko.amount.of.people.in.library;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println();
    }

    public int getAmountOfPeopleAtTIme(List<Event> events, Long time){
        List<Long> entranceTimecodes = events.stream().map(event -> event.entranceTime).sorted().toList();
        List<Long> exitTimecodes = events.stream().map(event -> event.exitTime).sorted().toList();

        int i = 0;
        int amountOfPeopleInside = 0;
        while(i <= entranceTimecodes.size()-1 && entranceTimecodes.get(i) <= time && i <= exitTimecodes.size()-1 && exitTimecodes.get(i) <= time){

            if (i <= entranceTimecodes.size()-1 && entranceTimecodes.get(i) <= time){
                amountOfPeopleInside++;
            }
            if (i <= exitTimecodes.size()-1 && exitTimecodes.get(i) <= time){
                amountOfPeopleInside--;
            }

            i++;
        }

        return amountOfPeopleInside;
    }


    record Event(Long entranceTime, Long exitTime){}
}
