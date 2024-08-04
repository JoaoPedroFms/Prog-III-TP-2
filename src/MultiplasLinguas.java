public class MultiplasLinguas {

    Container headContainer;
    String ids = "";
    int numID = 1;

    public MultiplasLinguas(ListaEncadeada Alba, ListaEncadeada Bosn, ListaEncadeada Croa, ListaEncadeada Engl, ListaEncadeada Germ, ListaEncadeada Hung, ListaEncadeada Poli, 
                            ListaEncadeada Port, ListaEncadeada Russ, ListaEncadeada Serb, ListaEncadeada Slovak, ListaEncadeada Slovenian, ListaEncadeada Span, ListaEncadeada Swed){
        
        Container Container14 = new Container(Swed, null);
        Container Container13 = new Container(Span, Container14);
        Container Container12 = new Container(Slovenian, Container13);
        Container Container11 = new Container(Slovak, Container12);
        Container Container10 = new Container(Serb, Container11);
        Container Container9 = new Container(Russ, Container10);
        Container Container8 = new Container(Port, Container9);
        Container Container7 = new Container(Poli, Container8);
        Container Container6 = new Container(Hung, Container7);
        Container Container5 = new Container(Germ, Container6);
        Container Container4 = new Container(Engl, Container5);
        Container Container3 = new Container(Croa, Container4);
        Container Container2 = new Container(Bosn, Container3);
        Container Container1 = new Container(Alba, Container2);
        headContainer = new Container(null, Container1);
    }

    public MultiplasLinguas(ListaEncadeada Alba, ListaEncadeada Bosn, ListaEncadeada Croa){
        
        Container Container3 = new Container(Croa, null);
        Container Container2 = new Container(Bosn, Container3);
        Container Container1 = new Container(Alba, Container2);
        headContainer = new Container(null, Container1);
    }

    public void testaMultiplasLinguagens(){

        for(Container aux1 = headContainer.getProximo(); aux1 != null; aux1 = aux1.getProximo()){
            String comparar;

            for(No aux1_i = aux1.getConteudo().buscaNo(0); aux1_i != null; aux1_i = aux1_i.getProximo()){
                comparar = (String)aux1_i.getAnnotatorID();

                for(Container aux2 = aux1.getProximo(); aux2 != null; aux2 = aux2.getProximo()){
                    String comparado;
                    
                    for(No aux2_i = aux2.getConteudo().buscaNo(0); aux2_i != null; aux2_i = aux2_i.getProximo()){
                        comparado = (String)aux2_i.getAnnotatorID();

                        if(comparar.equals(comparado)){
                            registraID(comparado);
                            break;
                        }

                    }

                }

            }

        }
        System.out.println(ids);

    }

    private void registraID(String ID){
        if(!ids.contains(ID)){
            ids = ids + "\n" + "ID " + numID++ + " - " + ID;
        }

    }

}

