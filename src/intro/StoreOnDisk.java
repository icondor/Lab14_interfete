package intro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class StoreOnDisk {

    public static void save(Object o) {

        if(o instanceof CanBeStored) {
            String content = o.toString() + System.lineSeparator();

            Path p = Paths.get(o.getClass().getSimpleName() + ".txt");
            try {
                Files.write(p, content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("gata, am salvat");
        }
        else
        {
            System.out.println("sorry,i cannot store such objects");
        }
    }
}
