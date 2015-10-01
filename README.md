com.knewin.data.client
======================

API cliente em Java para efetuar consultas nos web services da [Knewin](http://knewin.com "Knewin Inteligência em Recuperação Informação").
  
  
  
  
Exemplo de como fazer consulta na API de notícias
-------------------------------------------------

		final NewsDataRequestInfo requestInfo = new NewsDataRequestInfo();
		requestInfo.setKey(key);
		requestInfo.setQuery(query);

		final NewsDataRequest newsDataRequest = new NewsDataRequest();
		final DataResponseInfo<NewsDataInfo> responseInfo = newsDataRequest
			.getNews(requestInfo, "URL-WEB-SERVICE");

		System.out.println("Número de notícias encontradas: " + responseInfo.getNumDocs());

		System.out.println("Títulos das notícias recuperadas");
		responseInfo.getHits().forEach(newsDataInfo -> System.out.println("   - " + newsDataInfo.getTitle()));
  
  
  
  
  
Exemplo de como fazer consulta na API de vídeos
-----------------------------------------------

		final String url = "URL-WEB-SERVICE?k=" + key + "&q=" + query;

		final VideoDataRequest videoDataRequest = new VideoDataRequest();
		final DataResponseInfo<VideoDataInfo> responseInfo = videoDataRequest.getVideos(url);

		System.out.println("Número de vídeos encontrados: " + responseInfo.getNumDocs());

		System.out.println("Títulos dos vídeos recuperados");
		responseInfo.getHits().forEach(videoDataInfo -> System.out.println("   - " + videoDataInfo.getTitle()));

  
  
  
VERSÕES
============

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



