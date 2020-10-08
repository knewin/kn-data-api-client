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

	final VideoRequest request = new VideoRequest();
	request.setKey(key);
	request.setQuery(query);
	
	final VideoClient client = new VideoClient();
	final DataResponseInfo<VideoDataInfo> response = client.request(request, url);
	
	System.out.println("Número de notícias encontradas: " + response.getNumDocs());
	
	System.out.println("Títulos das notícias recuperadas");
	response.getHits().forEach(n -> System.out.println("   - " + n.getTitle()));

  
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
  
  
Exemplo de como fazer consulta na API de Similaridade
-----------------------------------------------  

	final SimilarNewsDataRequestInfo request = SimilarNewsDataRequestInfo.builder()
                .withKey(session.getKey())
				.withTitle(title).withContent(content)
                .withOffset(offSet)
                .withSince(format.format(publishDate))
				.withGmt("-3").build();

	final DataResponseInfo<NewsDataInfo> response = new SimilarNewsDataRequest().request(request, url);

	System.out.println("Conteúdo das notícias recuperadas para esta requisição");
	response.getHits().forEach(news -> System.out.println("   - " + news.getTitle().replaceAll("\n+", " ")));  
