package Week03.Labsheet05Exercise03;

public class Thermometer {
    private int currentTemp, maxTemp, minTemp;


    public Thermometer() {
        currentTemp = 0;
        maxTemp = Integer.MAX_VALUE;
        minTemp = Integer.MIN_VALUE;
    }

    public Thermometer(int currentTemp) {
        setCurrentTemp(currentTemp);
        setMaxTemp(currentTemp);
        setMinTemp(currentTemp);
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    private void UpdateMinMaxTemp(int currentTemp){

        if(currentTemp > maxTemp)
            maxTemp = currentTemp;
        if(currentTemp < minTemp)
            minTemp = currentTemp;

    }

    public String toString() {
        return "\nCurrent Temperature " + getCurrentTemp() + "\nMaximum temperature " + getMaxTemp() + "\nMinimum temperature " + getMinTemp();
    }


}
