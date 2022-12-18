package emailCollections;

import emailCollections.utils.DateUtils;

import java.text.ParseException;
import java.util.*;

import static emailCollections.CommonConstants.MAGIC_NUMBER_ZERO;

public class CorreioDeEmail extends MailMap implements MappingEmailCollections{
    public CorreioDeEmail() {
        super();
    }

    @Override
    public Integer countRecievedEmails() {
        return this.getEmails().entrySet().size();
    }

    @Override
    public Integer countByEmailAdress(String remetente) {
        if(getEmails().containsKey(remetente)){
            return getEmails().get(remetente).size();
        }
        return MAGIC_NUMBER_ZERO;
    }

    @Override
    public List<Email> removeEmailsBeforeDate(Date date) throws ParseException {
        Date formatedDate = DateUtils.formatedDate(date);
        List<Date> datesToRemove = new ArrayList<>();
        List<Email> emailsRemoved = new ArrayList<>();
        for(String emailsDates : getEmailsByReceivedDate().keySet()){
            Date dateFromEmail = DateUtils.retrieveDateByString(emailsDates);
            if(date.compareTo(dateFromEmail) == -1){
                datesToRemove.add(dateFromEmail);
                emailsRemoved.addAll(getEmailsByReceivedDate().get(dateFromEmail));
            }
        }
        for(Date removableDate : datesToRemove){
            getEmailsByReceivedDate().remove(removableDate);
        }
        return emailsRemoved;
    }

    @Override
    public List<Email> removeEmailByDate(String remetente, Date date) throws ParseException {
        Date formatedDate = DateUtils.formatedDate(date);
        List<Email> emailsRemoved = new ArrayList<>();

        LinkedList<Email> linkedList = getEmails().get(remetente);
        if( linkedList != null ){
            for(Email email : linkedList){
                Date dateFromEmail = DateUtils.retrieveDateByString(email.getDataDeEnvio());
                if(date.compareTo(dateFromEmail) == -1){
                    emailsRemoved.add(email);
                }
            }
            for(Email removableEmail : emailsRemoved){
                linkedList.remove(removableEmail);
            }
        }

        return emailsRemoved;
    }

    @Override
    public List<Email> hasSentEmailsToday() {
        String dateToday = DateUtils.formatedStringDate(new Date());
        if(getEmailsBySentDate().containsKey(dateToday)){
            return getEmailsBySentDate().get(dateToday);
        }
        return List.of();
    }

    @Override
    public Boolean removeEmailByWords(List<String> words) {
        arrayToLowerCase(words);
        List<Email> emailsToRemove = new ArrayList<>();
        List<String> emailsKeysToRemove = new ArrayList<>();
        for(String stringEmail : getEmails().keySet()) {
            LinkedList<Email> linkedList = getEmails().get(stringEmail);
            for(Email email : linkedList) {
                for(String word: words){
                    if(email.getTexto().contains(word)){
                        emailsToRemove.add(email);
                        break;
                    }
                }
            }
            for(Email removableEmail: emailsToRemove){
                linkedList.remove(removableEmail);
            }
            emailsToRemove.clear();
        }
        for(String stringEmail : getEmails().keySet()) {
            LinkedList<Email> linkedList = getEmails().get(stringEmail);
            if(linkedList.size()==0){
                emailsKeysToRemove.add(stringEmail);
            }
        }
        for(String key : emailsKeysToRemove){
            getEmails().remove(key);
        }
        return Boolean.TRUE;
    }

    private void arrayToLowerCase(List<String> words) {
        for(String word : words){
            word = word.toLowerCase(Locale.ROOT);
        }
    }

    @Override
    public List<Email> listOfMailsThatContainsWords(List<String> words) {
        arrayToLowerCase(words);
        List<Email> emailsThatContainsWord = new ArrayList<>();
        List<String> emailsKeysToRemove = new ArrayList<>();
        for(String stringEmail : getEmails().keySet()) {
            LinkedList<Email> linkedList = getEmails().get(stringEmail);
            for(Email email : linkedList) {
                for(String word: words){
                    if(email.getTexto().contains(word)){
                        emailsThatContainsWord.add(email);
                        break;
                    }
                }
            }
        }
        return emailsThatContainsWord;
    }

    @Override
    public Set<Email> setOfMailsThatContainsWords(List<String> words) {
        Set<Email> hashSet = new HashSet<Email>();
        for(Email email: listOfMailsThatContainsWords(words)){
            hashSet.add(email);
        }
        return hashSet;
    }

    @Override
    public List<Email> emailsByCountry(String country) {
        country.toLowerCase(Locale.ROOT);
        if(getEmailsByCountry().containsKey(country)){
            return getEmailsByCountry().get(country);
        }
        return List.of();
    }
}
