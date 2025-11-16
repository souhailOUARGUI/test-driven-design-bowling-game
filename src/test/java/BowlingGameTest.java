import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class BowlingGameTest
{
    BowlingGame game ;
    @Test
    void canMakeGame(){
        BowlingGame bowlingGame = new BowlingGame();
    }

    @BeforeEach
    public void setUp(){
        game = new BowlingGame();
    }

    @Test
    public void canMakeGutterGame(){
        game.roll(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        assertThat(game.score()).isEqualTo(0);
    }

    @Test
    public void canScoreSpareFollowedByThree(){
//        game.roll(5);
//        game.roll(5);
//        game.roll(3);
//        roll(17, 0);
        game.roll(5,5,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        assertThat(game.score()).isEqualTo(16);
    }

    @Test
    public void canScoreStrikeFollowedByThreeThenThree(){
        game.roll(10,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        assertThat(game.score()).isEqualTo(22);
    }


}
