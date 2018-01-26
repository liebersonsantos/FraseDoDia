package com.example.lieberson.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;
    private String[] frases = {
            "Se você traçar metas absurdamente altas e falhar, seu fracasso será muito melhor que o sucesso de todos",
            "O sucesso normalmente vem para quem está ocupado demais para procurar por ele",
            "Se você não está disposto a arriscar, esteja disposto a uma vida comum",
            "A vida é melhor para aqueles que fazem o possível para ter o melhor",
            "Os empreendedores falham, em média, 3,8 vezes antes do sucesso final. O que separa os bem-sucedidos dos outros é a persistência",
            "Escolha uma ideia. Faça dessa ideia a sua vida. Pense nela, sonhe com ela, viva pensando nela. Deixe cérebro, músculos, nervos, todas as partes do seu corpo serem preenchidas com essa ideia. Esse é o caminho para o sucesso",
            "Para de perseguir o dinheiro e comece a perseguir o sucesso",
            "Todos os seus sonhos podem se tornar realidade se você tem coragem para persegui-los",
            "Ter sucesso é falhar repetidamente, mas sem perder o entusiasmo",
            "Sempre que você vir uma pessoa de sucesso, você sempre verá as glórias, nunca os sacrifícios que os levaram até ali",
            "Sucesso? Eu não sei o que isso significa. Eu sou feliz. A definição de sucesso varia de pessoa para pessoa Para mim, sucesso é paz anterior",
            "Oportunidades não surgem. É você que as cria",
            "Não tente ser uma pessoa de sucesso. Em vez disso, seja uma pessoa de valor",
            "Não é o mais forte que sobrevive, nem o mais inteligente. Quem sobrevive é o mais disposto à mudança",
            "A melhor vingança é um sucesso estrondoso",
            "Eu não falhei. Só descobri 10 mil caminhos que não eram o certo",
            "Um homem de sucesso é aquele que cria uma parede com os tijolos que jogaram nele",
            "Ninguém pode fazer você se sentir inferior sem o seu consentimento",
            "O grande segredo de uma boa vida é encontrar qual é o seu destino. E realizá-lo",
            "Se você está atravessando um inferno, continue atravessando",
            "O que nos parece uma provação amarga pode ser uma bênção disfarçada",
            "A distância entre a insanidade e a genialidade é medida pelo sucesso",
            "Não tenha medo de desistir do bom para perseguir o ótimo",
            "A felicidade é uma borboleta que, sempre que perseguida, parecerá inatingível; no entanto, se você for paciente, ela pode pousar no seu ombro",
            "Se você não pode explicar algo de forma simples, então você não entendeu muito bem o que tem a dizer",
            "Há dois tipos de pessoas que vão te dizer que você não pode fazer a diferença neste mundo: as que têm medo de tentar e as que têm medo de que você se dê bem",
            "Comece de onde você está. Use o que você tiver. Faça o que você puder",
            "As pessoas me perguntam qual é o papel que mais gostei de interpretar. Eu sempre respondo: o próximo",
            "Descobri que, quanto mais eu trabalho, mais sorte eu pareço ter",
            "O ponto de partida de qualquer conquista é o desejo",
            "O sucesso é a soma de pequenos esforços repetidos dia após dia",
            "Todo progresso acontece fora da zona de conforto",
            "Coragem é a resistência e o domínio do medo, não a ausência dele",
            "Só evite fazer algo hoje se você quiser morrer e deixar assuntos inacabados",
            "O único lugar em que o sucesso vem antes do trabalho é no dicionário",
            "Não sei qual é a chave para o sucesso, mas a chave para o fracasso é tentar agradar a todos",
            "Embora ninguém possa voltar atrás e começar tudo de novo, qualquer um pode ter um ótimo fina",
            "Descobri que, se você tem vontade de viver e curiosidade, dormir não é a coisa mais importante",
            "Daqui a vinte anos, você não terá arrependimento das coisas que fez, mas das que deixou de fazer. Por isso, veleje longe do seu porto seguro. Pegue os ventos. Explore. Sonhe. Descubra",
            "O primeiro passo rumo ao sucesso é dado quando você se recusa ao ser um refém do ambiente em que se encontra",
            "Sempre que você se encontrar do lado da maioria, é hora de parar e refletir",
            "Continue andando. Haverá a chance de você ser barrado por um obstáculo, talvez por algo que você nem espere. Mas siga, até porque eu nunca ouvi falar de ninguém que foi barrado enquanto estava parado",
            "Se você realmente quer algo, não espere. Ensine você mesmo a ser impaciente",
            "Se você quer uma mudança permanente, pare de focar no tamanho de seus problemas e comece a focar no seu tamanho!",
            "Pessoas de sucesso fazem o que pessoas mal sucedidas não querem fazer. Não queira que a vida seja mais fácil. Deseje que você seja ainda melhor",
            "A primeira razão para o fracasso de alguém é escutar amigos, família e vizinhos",
            "O sucesso não consiste em não errar, mas não cometer os mesmos equívocos mais de uma vez",
            "A motivação é o que faz o empreendedor começar e o hábito é o que nos faz continuar",
            "Nosso maior medo não deve ser o fracasso, mas ser bem-sucedidos em algo que não importa",
            "Se você não traçou um plano para você mesmo, é possível que você caia no plano de outra pessoa. E adivinha o que ele planejou para você? Não muito",
            "Você deve lutar mais de uma batalha para se tornar um vencedor"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = findViewById(R.id.btnNovaFrase);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
               Random random = new Random();
                int numeroAleatorio = random.nextInt(frases.length);

                textoNovaFrase.setText(frases[numeroAleatorio]);

            }
        });






    }
}
