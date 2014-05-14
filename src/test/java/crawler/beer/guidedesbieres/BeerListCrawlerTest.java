package crawler.beer.guidedesbieres;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

import java.io.IOException;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class BeerListCrawlerTest {

	@Test
	public void iCanRetrievePageTitle() throws IOException {
		BeerListCrawler crawler = new BeerListCrawler("http://www.guidedesbieres.com/recherche.php");
		Elements beerLinks = crawler.getBeerLinks();
		
		for (Element link : beerLinks) {
			System.out.println(link.attr("href"));			
		}
		
		assertThat(beerLinks.size(), greaterThan(0));
	}
	
}
