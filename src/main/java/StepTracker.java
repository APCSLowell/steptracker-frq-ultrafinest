import java.util.ArrayList;
public class StepTracker
{
  private int minSteps;
  private int totalDays;
  private int actDays;
  private int totalSteps;
  public StepTracker(int nm){
   minSteps = nm;
   totalDays = 0;
   actDays = 0;
   totalSteps = 0;
  }
 public void addDailySteps(int add){
  totalDays++;
  totalSteps += add;
  if(add >= minSteps){
   actDays++;
  }
 }
 public int activeDays(){
  return actDays;
 }
 public double averageSteps(){
  if(totalDays == 0){
    return 0.0;
  }
  return (double)totalSteps / (double)totalDays;
 }
} 
