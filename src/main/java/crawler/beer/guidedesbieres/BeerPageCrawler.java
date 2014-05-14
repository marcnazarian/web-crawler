package crawler.beer.guidedesbieres;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class BeerPageCrawler {

	private String beerPageUrl;
	
	public BeerPageCrawler(String beerPageUrl) {
		this.beerPageUrl = beerPageUrl;
	}

	public Elements getBeerElements() throws IOException {
		Document document = Jsoup.connect(beerPageUrl).get();
		return document.select("div.description");
	}

}
