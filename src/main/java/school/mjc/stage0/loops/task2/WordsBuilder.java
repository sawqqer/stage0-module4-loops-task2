package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        StringBuilder s = new StringBuilder();
        int i = 0;
        while(i < chars.length){
            s.append(chars[i]);
            i++;
        }
        System.out.println(s);
    }
}
