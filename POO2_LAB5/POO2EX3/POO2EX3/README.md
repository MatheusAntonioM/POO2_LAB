Controle de Acesso a Arquivos Confidenciais

A ideia aqui é bem simples: temos um sistema onde alguns arquivos são públicos, e outros são confidenciais, que só podem ser vistos por quem tem autorização. Para controlar isso, usamos o padrão de projeto Proxy.

O Proxy funciona como um "porteiro virtual" para os arquivos confidenciais. Toda vez que alguém tenta acessar um desses arquivos, o Proxy dá aquela checada básica: "Esse usuário tem permissão pra isso?" Se tiver, ele libera o acesso tranquilamente. Se não, ele bloqueia o acesso.

Além disso, estamos usando bibliotecas Swing para criar a interface gráfica do sistema. Com o Swing, criamos janelas de cadastro, login e as mensagens que o sistema exibe. Estou usando-o para testar a implementação no trabalho final.
