package emailCollections;

import emailCollections.utils.DateUtils;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class Application {

    private static void printListOfEmails(List<Email> emails) {
        for(Email email: emails){
            System.out.println(email.getRemetente());
        }
    }

    public static void main(String[] args) throws ParseException {

        CorreioDeEmail yahoo = new CorreioDeEmail();
        Email rafaelFerreiraEmail = new Email();
        rafaelFerreiraEmail.setAssunto("De acordo release arsenal");
        rafaelFerreiraEmail.setDataDeEnvio(DateUtils.formatedStringDate(new Date()));
        rafaelFerreiraEmail.setPais("Brasil");
        rafaelFerreiraEmail.setRemetente("rafael.ferreira@f1rst.com.br");
        rafaelFerreiraEmail.setTexto("Solicito de acordo para release arsenal nada data de hoje");
        Email rafaelleSantosEmail = new Email();
        rafaelleSantosEmail.setAssunto("De acordo release camel");
        rafaelleSantosEmail.setDataDeEnvio(DateUtils.formatedStringDate(new Date()));
        rafaelleSantosEmail.setPais("Brasil");
        rafaelleSantosEmail.setRemetente("rafaelle.santos@f1rst.com.br");
        rafaelleSantosEmail.setTexto("Solicito de acordo para camel arsenal nada data de hoje");
        System.out.println("Guardando novos emails");

        //TODO b) Guardar um novo mail recebido;
        yahoo.addNewEmail(rafaelFerreiraEmail);
        yahoo.addNewEmail(rafaelleSantosEmail);

        //TODO a) Determinar o total de endereços a partir dos quais se recebeu mail;
        System.out.println("Total emails recebidos: "+yahoo.countRecievedEmails());

        //TODO c) Determinar quantos mails têm por origem um dado endereço;
        System.out.println("Quantidades de email recebidos de rafaelle.santos: "+yahoo.countByEmailAdress("rafaelle.santos@f1rst.com.br"));

        //TODO i) Eliminar todos os mails de um dado endereço anteriores a uma data dada;
        //yahoo.removeEmailByDate("rafael.ferreira@f1rst.com.br",new Date());

        //TODO g) Criar uma lista dos endereços que hoje enviaram mails;
        System.out.println("Lista de emails que mandaram email hoje");
        printListOfEmails(yahoo.hasSentEmailsToday());

        //TODO f) Eliminar todos os e-mails recebidos antes de uma data que é dada como parâmetro;
        //System.out.println("Lista de emails removidos antes de uma data");
        //printListOfEmails(yahoo.removeEmailsBeforeDate(new Date()));

        //TODO j) Criar uma listagem com todos os endereços de e-mail oriundos um país dado como parâmetro;
        printListOfEmails(yahoo.emailsByCountry("brasil"));

        //TODO d) Criar uma lista com todos os endereços que enviaram mails contendo no seu assunto uma lista de palavras dada como parâmetro;
        printListOfEmails(yahoo.listOfMailsThatContainsWords(List.of("De")));

        //TODO e) O mesmo que a questão anterior, mas criando um conjunto contendo os mails;
        yahoo.setOfMailsThatContainsWords(List.of("De"));

        //TODO h) Dada uma lista de palavras, eliminar todos os mails de um dado endereço que no seu assunto contenham uma qualquer destas (anti-spam);
        yahoo.removeEmailByWords(List.of("De", "acordo"));

    }


}
