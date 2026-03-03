
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeek = {0, 2, 5, 3, 7, 8, 4};
        return lastWeek;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1] = birdsPerDay[birdsPerDay.length-1] + 1;
    }

    public boolean hasDayWithoutBirds() {
        boolean answer = false;
        for(int birds : birdsPerDay) {
            if(birds == 0) {
                answer = true;
            }
        }
        return answer;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        if(numberOfDays > birdsPerDay.length){
            numberOfDays = birdsPerDay.length;
        }
        for(int i = 0; i < numberOfDays; i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int counter =0;
        for(int birds : birdsPerDay) {
            counter += (birds >= 5) ? 1 : 0;
        }
        return counter;
    }
}
