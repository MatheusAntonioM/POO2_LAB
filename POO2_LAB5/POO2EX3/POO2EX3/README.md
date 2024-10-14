### Controle de Acesso a Arquivos Confidenciais 

A implementação tras um, sistema onde existem arquivos que podem ser públicos ou confidenciais. Os arquivos públicos são acessíveis a qualquer um, mas os confidenciais só podem ser vistos por usuários que têm a autorização necessária. 

Para garantir que apenas as pessoas certas tenham acesso aos arquivos confidenciais, vamos usar o padrão de projeto **Proxy**. Pense no Proxy como um "porteiro virtual" que fica na entrada dos arquivos confidenciais. Toda vez que alguém tenta acessar um desses arquivos, o Proxy verifica se a pessoa tem permissão. Se tiver, ele deixa a pessoa entrar e ver o conteúdo; se não, ele bloqueia o acesso com uma mensagem educada.

Esse mecanismo ajuda a controlar quem pode ver o quê, sem complicar a vida dos usuários ou dos desenvolvedores. Em resumo, o Proxy atua como um intermediário que protege os arquivos confidenciais, garantindo que somente usuários autorizados possam acessá-los.
