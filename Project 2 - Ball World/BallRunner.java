
/**
 * Write a description of class BallRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BallRunner
{
    public static void run()
    { 
        BallWorld ballworld = new BallWorld(250,250);
        TGPoint tgpoint = new TGPoint (0,0); 
        BallBot ballbot = new BallBot (ballworld,tgpoint,0,10);
        double x;
        

        while (true){
            if (ballbot.canMoveForward(ballworld)){
                ballbot.moveForward();
            }else{
                x = Math.random()*360;
                ballbot.setHeading(x);

                }
        }
    }
    public int findFreeBallBotIndex(BallBot[] ballbotArray){
        int ballBotArray[];
        ballBotArray= new ballBotArray[10];
        for (w=0; w<ballBotArray.length; w++){
            
        }
        return
}
}

