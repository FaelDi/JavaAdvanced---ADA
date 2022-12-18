package emailCollections;

import emailCollections.utils.DateUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

public abstract class MailMap {

    private HashMap<String, LinkedList<Email>> emails;
    private HashMap<String, LinkedList<Email>> emailsByReceivedDate;
    private HashMap<String, LinkedList<Email>> emailsBySentDate;
    private HashMap<String, LinkedList<Email>> emailsByCountry;

    public MailMap(){
        this.emails = new HashMap<>();
        this.emailsByCountry = new HashMap<>();
        this.emailsBySentDate = new HashMap<>();
        this.emailsByReceivedDate = new HashMap<>();
    }

    public HashMap<String, LinkedList<Email>> getEmailsByReceivedDate() {
        return emailsByReceivedDate;
    }

    public HashMap<String, LinkedList<Email>> getEmailsBySentDate() {
        return emailsBySentDate;
    }

    public HashMap<String, LinkedList<Email>> getEmailsByCountry() {
        return emailsByCountry;
    }

    public HashMap<String, LinkedList<Email>> getEmails() {
        return emails;
    }


    public Boolean addNewEmail(Email email) {
        if(email != null) {
            email.setDataRecebimento(DateUtils.formatedStringDate(new Date()));
            addByParameters(email,email.getRemetente(),getEmails());
            addByParameters(email,email.getDataRecebimento(),getEmailsByReceivedDate());
            addByParameters(email,email.getDataDeEnvio(),getEmailsBySentDate());
            addByParameters(email,email.getPais(),getEmailsByCountry());
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }



    private Boolean addByParameters(Email email, String chave, HashMap<String, LinkedList<Email>> hashMap) {
        if( email == null ){
            return Boolean.FALSE;
        }
        if( !hashMap.containsKey(chave) ) {
            LinkedList<Email> remetenteLinkedList = hashMap.get(chave);
            if(remetenteLinkedList != null) {
                remetenteLinkedList.add(email);
            }else{
                remetenteLinkedList = new LinkedList();
                remetenteLinkedList.add(email);
                hashMap.put(chave,remetenteLinkedList);
            }
        }else{
            hashMap.get(chave).add(email);
        }
        return Boolean.TRUE;
    }


}
