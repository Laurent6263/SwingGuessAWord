/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.guessgame;

import id.co.indocyber.guessgame.model.WordModel;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class WordQuestionGenerator {
    
    public static WordModel[] createQuestion(){
        WordModel soal1 = new WordModel("Pondok Indah","Daerah di Jakarta Selatan");
        WordModel soal2 = new WordModel("Sudirman","Jalan utama di Jakarta");
        WordModel soal3 = new WordModel("Tugu Tani","Patung dekat Monas");
        WordModel soal4 = new WordModel("Citos","Mall di Selatan Jakarta");
        WordModel soal5 = new WordModel("Gandaria City","Mall anak muda");
        WordModel[] bankSoal = {soal1, soal2, soal3, soal4, soal5};
        return bankSoal;
    }
    
    /**
     *
     * @return
     */
    public static List<WordModel> CreateQuestionCollection(){
        WordModel soal1 = new WordModel("Pondok Indah","Daerah di Jakarta Selatan");
        WordModel soal2 = new WordModel("Sudirman","Jalan utama di Jakarta");
        WordModel soal3 = new WordModel("Tugu Tani","Patung dekat Monas");
        WordModel soal4 = new WordModel("Citos","Mall di Selatan Jakarta");
        WordModel soal5 = new WordModel("Gandaria City","Mall anak muda");
        List<WordModel> bankSoal = new ArrayList<>();
        bankSoal.add(soal1);
        bankSoal.add(soal2);
        bankSoal.add(soal3);
        bankSoal.add(soal4);
        bankSoal.add(soal5);
        return bankSoal;
    }
    
}
