com.knewin.data.client
======================

API cliente em Java para efetuar consultas nos web services da [Knewin](http://knewin.com "Knewin Inteligência em Recuperação Informação").
  
  
  
  
Exemplo de como fazer consulta na API de notícias
-------------------------------------------------

		final NewsDataRequestInfo requestInfo = new NewsDataRequestInfo();
		requestInfo.setKey(key);
		requestInfo.setQuery(query);

		final NewsDataRequest newsDataRequest = new NewsDataRequest();
		final DataResponseInfo<NewsDataInfo> responseInfo = newsDataRequest.request(requestInfo, url);

		System.out.println("Número de notícias encontradas: " + responseInfo.getNumDocs());

		System.out.println("Títulos das notícias recuperadas");
		responseInfo.getHits().forEach(n -> System.out.println("   - " + n.getTitle()));
  
  
  
Exemplo de como fazer consulta na API de vídeos
-----------------------------------------------

		final String url = "URL-WEB-SERVICE?k=" + key + "&q=" + query;

		final VideoDataRequest videoDataRequest = new VideoDataRequest();
		final DataResponseInfo<VideoDataInfo> responseInfo = videoDataRequest.getVideos(url);

		System.out.println("Número de vídeos encontrados: " + responseInfo.getNumDocs());

		System.out.println("Títulos dos vídeos recuperados");
		responseInfo.getHits().forEach(v -> System.out.println("   - " + v.getTitle()));

  
Exemplo de como fazer consulta na API de TV
-----------------------------------------------

		final TvRequestInfo requestInfo = new TvRequestInfo();
		requestInfo.setKey(key);
		requestInfo.setQuery(query);

		final TvDataRequest dataRequest = new TvDataRequest();
		final DataResponseInfo<TvDataInfo> responseInfo = dataRequest.request(requestInfo, url);

		System.out.println("Número de notícias encontradas: " + responseInfo.getNumDocs());

		System.out.println("Conteúdo das notícias recuperadas para esta requisição");
		responseInfo.getHits().forEach(tv -> System.out.println("   - " + tv.getContent().replaceAll("\n+", " ")));

  
Exemplo de como fazer consulta na API de Rádio
-----------------------------------------------

		final RadioRequestInfo requestInfo = new RadioRequestInfo();
		requestInfo.setKey(key);
		requestInfo.setQuery(query);

		final RadioDataRequest dataRequest = new RadioDataRequest();
		final DataResponseInfo<RadioDataInfo> responseInfo = dataRequest.request(requestInfo, url);

		System.out.println("Número de notícias encontradas: " + responseInfo.getNumDocs());

		System.out.println("Conteúdo das notícias recuperadas para esta requisição");
		responseInfo.getHits().forEach(radio -> System.out.println("   - " + radio.getContent().replaceAll("\n+", " ")));
  
  
  
VERSÕES
============

VERSÃO 2.0.0
------------
- Adicionado opção de informar mais de uma localidade para busca de notícias.  

VERSÃO 1.7.0
------------
- Extraída a classe RestRequest a partir de DataRequest para externalizar métodos simples de requisições.  

VERSÃO 1.6.0
------------
- A resposta da consulta agora retorna a localidade (país/estado) da fonte.
- Atualizado algumas dependências para compilação.
- Removido dependências obsoletas.


VERSÃO 1.5.1
------------
- Adicionado filtro para busca por ids nas coleções de Rádio e TV.


VERSÃO 1.5.0
------------
- Adicionado suporte para busca através das coleções de Rádio e TV.


VERSÃO 1.4.1
------------
- Corrigida adição da exceção no DataRequestException.


VERSÃO 1.4.0
------------
- Adicinada a requisição completa na exceção DataRequestException.


VERSÃO 1.3.3
------------
- Atualizada a biblioteca HttpClient para a versão 4.5.1. 


VERSÃO 1.3.2
------------
- Alterado HttpClient para suportar GZIP. 


VERSÃO 1.3.1
------------
- Adicionado tratamento de exceção para retornar o erro e a mensagem de exceção. 


VERSÃO 1.3.0
------------
- Adicionada a possibilidade de informar o range (since, until) da data universal. 


VERSÃO 1.2.0
------------
- Adicionada a possibilidade de informar o operador default para busca de notícias. 


VERSÃO 1.1.0
------------

- Criado DataRequestException para identificar a exceção gerada.
- Adicionado objeto SourceLocality em NewsQueryFilter para filtro por localidade de fontes. 

VERSÃO 1.0.4
------------

- Adicionado campo showOriginalUrl em NewsDataRequestInfo.

VERSÃO 1.0.3
------------

- Corrigido groupId e url do projeto.

VERSÃO 1.0.2
------------

- Adicionado equals e hashcode no DataInfo.

VERSÃO 1.0.1
------------

- Corrigido os nomes usados para geração do arquivo JSON na classe de filtro NewsQueryFilter.



