import org.json.JSONException;
import org.json.JSONObject;
public class CreateJSONFile {
    JSONObject obj=new JSONObject();
    public CreateJSONFile(int countOfWords) throws JSONException
    {
        obj.put("No of Words in the file",countOfWords);
        System.out.println(obj);
    }
}