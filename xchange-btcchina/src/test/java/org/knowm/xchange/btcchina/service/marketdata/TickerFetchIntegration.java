package org.knowm.xchange.btcchina.service.marketdata;

import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Test;
import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeFactory;
import org.knowm.xchange.btcchina.BTCChinaExchange;
import org.knowm.xchange.currency.CurrencyPair;
import org.knowm.xchange.dto.marketdata.Ticker;
import org.knowm.xchange.service.polling.marketdata.PollingMarketDataService;

/**
 * @author timmolter
 */
public class TickerFetchIntegration {

  @Test
  public void tickerFetchTest() throws Exception {

    Exchange exchange = ExchangeFactory.INSTANCE.createExchange(BTCChinaExchange.class.getName());
    PollingMarketDataService marketDataService = exchange.getPollingMarketDataService();
    Ticker ticker = marketDataService.getTicker(new CurrencyPair("BTC", "CNY"));
    System.out.println(ticker.toString());
    assertThat(ticker).isNotNull();
  }

}