package crawler.beer.guidedesbieres;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

import java.io.IOException;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class BeerPageCrawlerTest {
	
	@Test
	public void iCanRetrieveBeerInfo() throws IOException {
		BeerPageCrawler crawler = new BeerPageCrawler("http://www.guidedesbieres.com/biere5294/punk-ipa.html");
		Elements beerElements = crawler.getBeerElements();
		
		for (Element beerElement : beerElements) {
			System.out.println(beerElement.html());			
		}
		
		assertThat(beerElements.size(), greaterThan(0));
	}
	
}
