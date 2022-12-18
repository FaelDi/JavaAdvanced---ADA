package emailCollections;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Set;

public interface MappingEmailCollections {

    public Integer countRecievedEmails();

    public Integer countByEmailAdress(String remetente);

    public List<Email> removeEmailsBeforeDate(Date date) throws ParseException;

    public List<Email> removeEmailByDate(String remetente, Date date) throws ParseException;

    public List<Email> hasSentEmailsToday();

    public Boolean removeEmailByWords(List<String> words);

    public List<Email> listOfMailsThatContainsWords(List<String> words);

    public Set<Email> setOfMailsThatContainsWords(List<String> words);

    public List<Email> emailsByCountry(String country);

}
