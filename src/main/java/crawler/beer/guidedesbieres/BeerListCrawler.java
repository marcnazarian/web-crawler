package crawler.beer.guidedesbieres;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class BeerListCrawler {

	private String beerListUrl;
	
	public BeerListCrawler(String beerListUrl) {
		this.beerListUrl = beerListUrl;
	}
	
	public Elements getBeerLinks() throws IOException {
		Document document = Jsoup.connect(beerListUrl).get();
		return document.select("a[href~=(biere\\w+/\\w+)]");
	}
}
