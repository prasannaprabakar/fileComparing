import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;

class CountOfWordsInFile
{

    public CountOfWordsInFile(String data1,int NumberOfLines)
    {

        int CountOfWords = 0;
        try
        {
            String line;
            int count = 0;

            //Opens a file in read mode
            FileReader file = new FileReader(data1);
            BufferedReader br = new BufferedReader(file);

            //Gets each line till end of file is reached
            while((line = br.readLine()) != null) {
                //Splits each line into words
                String words[] = line.split(" ");
                //Counts each word
                count = count + words.length;
            }
            CreateJSONFile create = new CreateJSONFile(count);
            br.close();
        } catch (Exception exe)
        {
            exe.printStackTrace();
        }

    }
}
