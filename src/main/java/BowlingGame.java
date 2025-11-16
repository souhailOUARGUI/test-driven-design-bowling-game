public class BowlingGame {

    private int roll = 0;
    private int[] rolls = new int[20];

    public void roll( int...pinDowns){
        for (int pinDown : pinDowns){
            roll(pinDown);
        }
    }

    public void roll(int pinsDown){
    rolls[roll] = pinsDown;
    roll++;
    }

    public int score(){
        int score= 0;
        int pointer= 0;
        for (int frame = 0; frame < 10; frame++) {

            if (rolls[pointer]==10 ){
                score+= 10 + rolls[pointer+1] + rolls[pointer+2];
                pointer+=1;
            }else if (isSpare(pointer)){
            score+= 10 + rolls[pointer+2];
            pointer += 2;
            }else{
                score+= rolls[pointer] +rolls[pointer+1] ;
                pointer  += 2;
            }
        }
        return score;
    }
    private boolean isSpare(int pointer){
        return rolls[pointer] + rolls[pointer+1] ==10;
    }
}
