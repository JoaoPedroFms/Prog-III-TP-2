public class App {
    public static void main(String[] args) throws Exception {
        ListaEncadeada listaAlba = new ListaEncadeada<>();
        ListaEncadeada listaBosn = new ListaEncadeada<>();
        ListaEncadeada listaCroa = new ListaEncadeada<>();
        ListaEncadeada listaEngl = new ListaEncadeada<>();
        ListaEncadeada listaGerm = new ListaEncadeada<>();
        ListaEncadeada listaHung = new ListaEncadeada<>();
        ListaEncadeada listaPoli = new ListaEncadeada<>();
        ListaEncadeada listaPort = new ListaEncadeada<>();
        ListaEncadeada listaRuss = new ListaEncadeada<>();
        ListaEncadeada listaSerb = new ListaEncadeada<>();
        ListaEncadeada listaSlovak = new ListaEncadeada<>();
        ListaEncadeada listaSlovenian = new ListaEncadeada<>();
        ListaEncadeada listaSpan = new ListaEncadeada<>();
        ListaEncadeada listaSwed = new ListaEncadeada<>();
        
        //Chama os arquivos
        String arquivoAlba = "src\\datasetTwitters\\Albanian_Twitter_sentiment.csv";
        String arquivoBosn = "src\\datasetTwitters\\Bosnian_Twitter_sentiment.csv";
        String arquivoCroa = "src\\datasetTwitters\\Croatian_Twitter_sentiment.csv";
        String arquivoEngl = "src\\datasetTwitters\\English_Twitter_sentiment.csv";
        String arquivoGerm = "src\\datasetTwitters\\German_Twitter_sentiment.csv";
        String arquivoHung = "src\\datasetTwitters\\Hungarian_Twitter_sentiment.csv";
        String arquivoPoli = "src\\datasetTwitters\\Polish_Twitter_sentiment.csv";
        String arquivoPort = "src\\datasetTwitters\\Portuguese_Twitter_sentiment.csv";
        String arquivoRuss = "src\\datasetTwitters\\Russian_Twitter_sentiment.csv";
        String arquivoSerb = "src\\datasetTwitters\\Serbian_Twitter_sentiment.csv";
        String arquivoSlovak = "src\\datasetTwitters\\Slovak_Twitter_sentiment.csv";
        String arquivoSlovenian = "src\\datasetTwitters\\Slovenian_Twitter_sentiment.csv";
        String arquivoSpan = "src\\datasetTwitters\\Spanish_Twitter_sentiment.csv";
        String arquivoSwed = "src\\datasetTwitters\\Swedish_Twitter_sentiment.csv";

        System.out.println("--------------------Questão 1-------------------------------");

        
        //Chama o método tranformaArquivoParaLista
        listaAlba.tranformaArquivoParaLista(arquivoAlba, listaAlba);
        listaBosn.tranformaArquivoParaLista(arquivoBosn, listaBosn);
        listaCroa.tranformaArquivoParaLista(arquivoCroa, listaCroa);
        listaEngl.tranformaArquivoParaLista(arquivoEngl, listaEngl);
        listaGerm.tranformaArquivoParaLista(arquivoGerm, listaGerm);
        listaHung.tranformaArquivoParaLista(arquivoHung, listaHung);
        listaPoli.tranformaArquivoParaLista(arquivoPoli, listaPoli);
        listaPort.tranformaArquivoParaLista(arquivoPort, listaPort);
        listaRuss.tranformaArquivoParaLista(arquivoRuss, listaRuss);
        listaSerb.tranformaArquivoParaLista(arquivoSerb, listaSerb);
        listaSlovak.tranformaArquivoParaLista(arquivoSlovak, listaSlovak);
        listaSlovenian.tranformaArquivoParaLista(arquivoSlovenian, listaSlovenian);
        listaSpan.tranformaArquivoParaLista(arquivoSpan, listaSpan);
        listaSwed.tranformaArquivoParaLista(arquivoSwed, listaSwed);

        //Printa o volume de Tweets de cada idioma
        System.out.println("Volume de Tweets Albania: " + listaAlba.getTamanho());
        System.out.println("Volume de Tweets Bósnia: " + listaBosn.getTamanho());
        System.out.println("Volume de Tweets Croácia: " + listaCroa.getTamanho());
        System.out.println("Volume de Tweets Inglês: " + listaEngl.getTamanho());
        System.out.println("Volume de Tweets Alemão: " + listaGerm.getTamanho());
        System.out.println("Volume de Tweets Húngaro: " + listaHung.getTamanho());
        System.out.println("Volume de Tweets Polonês: " + listaPoli.getTamanho());
        System.out.println("Volume de Tweets Português: " + listaPort.getTamanho());
        System.out.println("Volume de Tweets Russo: " + listaRuss.getTamanho());
        System.out.println("Volume de Tweets Sérvio: " + listaSerb.getTamanho());
        System.out.println("Volume de Tweets Eslovaco: " + listaSlovak.getTamanho());
        System.out.println("Volume de Tweets Esloveno: " + listaSlovenian.getTamanho());
        System.out.println("Volume de Tweets Espanhol: " + listaSpan.getTamanho());
        System.out.println("Volume de Tweets Sueco: " + listaSwed.getTamanho());

        ListaEncadeada lista = new ListaEncadeada();
        System.out.println();
        System.out.println("--------------------Questão 2 e 3-------------------------------");
        System.out.println();
        lista.sentimento();
        System.out.println("----------------------Questão 4-------------------------");
    
        MultiplasLinguas TesteMultiplasLinguas = new MultiplasLinguas(listaAlba, listaBosn, listaCroa, listaEngl, listaGerm, listaHung, listaPoli, listaPort, listaRuss, listaSerb, listaSlovak, listaSlovenian, listaSpan, listaSwed);
        TesteMultiplasLinguas.testaMultiplasLinguagens();

    }
}
