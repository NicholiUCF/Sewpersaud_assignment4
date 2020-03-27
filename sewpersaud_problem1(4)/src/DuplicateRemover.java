import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class DuplicateRemover {
		
		private String uniqueWords = "";
			void remove(String dataFile) throws IOException{
					Set<String> words = new HashSet<>();
					BufferedReader br = new BufferedReader(new FileReader(dataFile));
					String line; 
					while(null !=(line = br.readLine())) {
						words.addAll(Arrays.asList(line.split(""))));
					}
					for(String word : words) {
						uniqueWords = uniqueWords.concat(word).concat("/n");	
					}
					void write(String outputFile) throws IOException{
						new File(outputFile).createNewFile();
						FileWriter myWriter = new FileWriter(outputFile);
						myWriter.write(unqiueWords);
						myWriter.close();
					}
			}
}
