package mazesolver.logic;

import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

public class MazeTest {

    @Test
    public void labyrintinPolkuOnOikeanKokoinen() {
        Random random = new Random();
        int n = random.nextInt(100 - 2) + 2;
        Maze labyrintti = new Maze(n);
        labyrintti.luoLabyrintti();
        assertTrue(labyrintti.haePolku().koko() == 2 * n * n - 1);
    }
}
