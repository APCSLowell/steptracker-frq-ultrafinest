import java.util.ArrayList;
public class StepTracker
{
  private int minSteps;
  private int totalDays;
  private int activeDays;
  private int totalSteps;
  public StepTracker(int nm){
   minSteps = nm;
   totalDays = 0;
   activeDays = 0;
   totalSteps = 0;
  }
 public void addDailySteps(int add){
  totalDays++;
  totalSteps += add;
  if(add >= minSteps){
   activeDays++;
  }
 }
 public int activeDays(){
  return activeDays;
 }
 public double averageSteps(){
  return (double)totalSteps / (double)totalDays;
 }
} 
