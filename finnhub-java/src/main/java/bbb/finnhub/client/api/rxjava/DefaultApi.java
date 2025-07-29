package bbb.finnhub.client.api.rxjava;

import bbb.finnhub.client.model.AIChatBody;
import bbb.finnhub.client.model.AIChatResponse;
import bbb.finnhub.client.model.AggregateIndicators;
import bbb.finnhub.client.model.AirlinePriceIndexData;
import bbb.finnhub.client.model.BankBranchRes;
import bbb.finnhub.client.model.BasicFinancials;
import bbb.finnhub.client.model.BondCandles;
import bbb.finnhub.client.model.BondProfile;
import bbb.finnhub.client.model.BondTickData;
import bbb.finnhub.client.model.BondYieldCurve;
import bbb.finnhub.client.model.CompanyESG;
import bbb.finnhub.client.model.CompanyEarningsQualityScore;
import bbb.finnhub.client.model.CompanyExecutive;
import bbb.finnhub.client.model.CompanyNews;
import bbb.finnhub.client.model.CompanyProfile;
import bbb.finnhub.client.model.CompanyProfile2;
import bbb.finnhub.client.model.CongressionalTrading;
import bbb.finnhub.client.model.CountryMetadata;
import bbb.finnhub.client.model.CovidInfo;
import bbb.finnhub.client.model.CryptoCandles;
import bbb.finnhub.client.model.CryptoProfile;
import bbb.finnhub.client.model.CryptoSymbol;
import bbb.finnhub.client.model.Dividends;
import bbb.finnhub.client.model.Dividends2;
import bbb.finnhub.client.model.ETFsCountryExposure;
import bbb.finnhub.client.model.ETFsHoldings;
import bbb.finnhub.client.model.ETFsProfile;
import bbb.finnhub.client.model.ETFsSectorExposure;
import bbb.finnhub.client.model.EarningResult;
import bbb.finnhub.client.model.EarningsCalendar;
import bbb.finnhub.client.model.EarningsCallLive;
import bbb.finnhub.client.model.EarningsCallTranscripts;
import bbb.finnhub.client.model.EarningsCallTranscriptsList;
import bbb.finnhub.client.model.EarningsEstimates;
import bbb.finnhub.client.model.EbitEstimates;
import bbb.finnhub.client.model.EbitdaEstimates;
import bbb.finnhub.client.model.EconomicCalendar;
import bbb.finnhub.client.model.EconomicCode;
import bbb.finnhub.client.model.EconomicData;
import bbb.finnhub.client.model.FDAComitteeMeeting;
import bbb.finnhub.client.model.Filing;
import bbb.finnhub.client.model.FinancialStatements;
import bbb.finnhub.client.model.FinancialsAsReported;
import bbb.finnhub.client.model.ForexCandles;
import bbb.finnhub.client.model.ForexSymbol;
import bbb.finnhub.client.model.Forexrates;
import bbb.finnhub.client.model.FundOwnership;
import bbb.finnhub.client.model.HistoricalCompanyESG;
import bbb.finnhub.client.model.HistoricalEmployeeCount;
import bbb.finnhub.client.model.HistoricalMarketCapData;
import bbb.finnhub.client.model.HistoricalNBBO;
import bbb.finnhub.client.model.IPOCalendar;
import bbb.finnhub.client.model.InFilingResponse;
import bbb.finnhub.client.model.InFilingSearchBody;
import bbb.finnhub.client.model.IndicesConstituents;
import bbb.finnhub.client.model.IndicesHistoricalConstituents;
import bbb.finnhub.client.model.InsiderSentiments;
import bbb.finnhub.client.model.InsiderTransactions;
import bbb.finnhub.client.model.InstitutionalOwnership;
import bbb.finnhub.client.model.InstitutionalPortfolio;
import bbb.finnhub.client.model.InstitutionalProfile;
import bbb.finnhub.client.model.InternationalFiling;
import bbb.finnhub.client.model.InvestmentThemes;
import bbb.finnhub.client.model.IsinChange;
import bbb.finnhub.client.model.LastBidAsk;
import bbb.finnhub.client.model.LobbyingResult;
import java.time.LocalDate;
import bbb.finnhub.client.model.MarketHoliday;
import bbb.finnhub.client.model.MarketNews;
import bbb.finnhub.client.model.MarketStatus;
import bbb.finnhub.client.model.MutualFundCountryExposure;
import bbb.finnhub.client.model.MutualFundEet;
import bbb.finnhub.client.model.MutualFundEetPai;
import bbb.finnhub.client.model.MutualFundHoldings;
import bbb.finnhub.client.model.MutualFundProfile;
import bbb.finnhub.client.model.MutualFundSectorExposure;
import bbb.finnhub.client.model.NewsSentiment;
import bbb.finnhub.client.model.Ownership;
import bbb.finnhub.client.model.PatternRecognition;
import bbb.finnhub.client.model.PressRelease;
import bbb.finnhub.client.model.PriceMetrics;
import bbb.finnhub.client.model.PriceTarget;
import bbb.finnhub.client.model.Quote;
import bbb.finnhub.client.model.RecommendationTrend;
import bbb.finnhub.client.model.RevenueBreakdown;
import bbb.finnhub.client.model.RevenueBreakdown2;
import bbb.finnhub.client.model.RevenueEstimates;
import bbb.finnhub.client.model.SECSentimentAnalysis;
import bbb.finnhub.client.model.SearchBody;
import bbb.finnhub.client.model.SearchFilter;
import bbb.finnhub.client.model.SearchResponse;
import bbb.finnhub.client.model.SectorMetric;
import bbb.finnhub.client.model.SimilarityIndex;
import bbb.finnhub.client.model.SocialSentiment;
import bbb.finnhub.client.model.Split;
import bbb.finnhub.client.model.StockCandles;
import bbb.finnhub.client.model.StockPresentation;
import bbb.finnhub.client.model.StockSymbol;
import bbb.finnhub.client.model.SupplyChainRelationships;
import bbb.finnhub.client.model.SupportResistance;
import bbb.finnhub.client.model.SymbolChange;
import bbb.finnhub.client.model.SymbolLookup;
import bbb.finnhub.client.model.TickData;
import bbb.finnhub.client.model.UpgradeDowngrade;
import bbb.finnhub.client.model.UsaSpendingResult;
import bbb.finnhub.client.model.UsptoPatentResult;
import bbb.finnhub.client.model.VisaApplicationResult;
import bbb.finnhub.client.ApiClient;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public class DefaultApi {

    private final bbb.finnhub.client.api.DefaultApi delegate;

    public DefaultApi(bbb.finnhub.client.api.DefaultApi delegate) {
        this.delegate = delegate;
    }

    public bbb.finnhub.client.api.DefaultApi getDelegate() {
        return delegate;
    }

    /**
    * Aggregate Indicators
    * Get aggregate signal of multiple technical indicators such as MACD, RSI, Moving Average v.v. A full list of indicators can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1MWuy0WuT2yVlxr1KbPdggVygMZtJfunDnhe-C0GEXYM/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol symbol (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void aggregateIndicator(String symbol, String resolution, Handler<AsyncResult<AggregateIndicators>> resultHandler) {
        delegate.aggregateIndicator(symbol, resolution, resultHandler);
    }

    /**
    * Aggregate Indicators
    * Get aggregate signal of multiple technical indicators such as MACD, RSI, Moving Average v.v. A full list of indicators can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1MWuy0WuT2yVlxr1KbPdggVygMZtJfunDnhe-C0GEXYM/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol symbol (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void aggregateIndicator(String symbol, String resolution, ApiClient.AuthInfo authInfo, Handler<AsyncResult<AggregateIndicators>> resultHandler) {
        delegate.aggregateIndicator(symbol, resolution, authInfo, resultHandler);
    }

    /**
    * Aggregate Indicators
    * Get aggregate signal of multiple technical indicators such as MACD, RSI, Moving Average v.v. A full list of indicators can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1MWuy0WuT2yVlxr1KbPdggVygMZtJfunDnhe-C0GEXYM/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol symbol (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<AggregateIndicators> rxAggregateIndicator(String symbol, String resolution) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.aggregateIndicator(symbol, resolution, fut)
        ));
    }

    /**
    * Aggregate Indicators
    * Get aggregate signal of multiple technical indicators such as MACD, RSI, Moving Average v.v. A full list of indicators can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1MWuy0WuT2yVlxr1KbPdggVygMZtJfunDnhe-C0GEXYM/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol symbol (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<AggregateIndicators> rxAggregateIndicator(String symbol, String resolution, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.aggregateIndicator(symbol, resolution, authInfo, fut)
        ));
    }
    /**
    * AI Copilot
    * &lt;p&gt;Chat with our AI copilot powered by Neyman AI trained on the extensive Finnhub&#39;s global data. You can ask it any finance-related questions just like with other LLM models and receive results in texts and widgets.&lt;/p&gt;
    * @param search Search body (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void aiChat(AIChatBody search, Handler<AsyncResult<AIChatResponse>> resultHandler) {
        delegate.aiChat(search, resultHandler);
    }

    /**
    * AI Copilot
    * &lt;p&gt;Chat with our AI copilot powered by Neyman AI trained on the extensive Finnhub&#39;s global data. You can ask it any finance-related questions just like with other LLM models and receive results in texts and widgets.&lt;/p&gt;
    * @param search Search body (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void aiChat(AIChatBody search, ApiClient.AuthInfo authInfo, Handler<AsyncResult<AIChatResponse>> resultHandler) {
        delegate.aiChat(search, authInfo, resultHandler);
    }

    /**
    * AI Copilot
    * &lt;p&gt;Chat with our AI copilot powered by Neyman AI trained on the extensive Finnhub&#39;s global data. You can ask it any finance-related questions just like with other LLM models and receive results in texts and widgets.&lt;/p&gt;
    * @param search Search body (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<AIChatResponse> rxAiChat(AIChatBody search) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.aiChat(search, fut)
        ));
    }

    /**
    * AI Copilot
    * &lt;p&gt;Chat with our AI copilot powered by Neyman AI trained on the extensive Finnhub&#39;s global data. You can ask it any finance-related questions just like with other LLM models and receive results in texts and widgets.&lt;/p&gt;
    * @param search Search body (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<AIChatResponse> rxAiChat(AIChatBody search, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.aiChat(search, authInfo, fut)
        ));
    }
    /**
    * Airline Price Index
    * &lt;p&gt;The Flight Ticket Price Index API provides comprehensive data on airline ticket prices, including the average daily ticket price and its percentage change (price index). This data, collected weekly and projected two weeks ahead, aggregates daily prices and indexes from the 50 busiest and largest airports across the USA. The dataset includes detailed information on airlines, dates, and average ticket prices, offering valuable insights for market analysis and pricing strategies.&lt;/p&gt;&lt;p&gt;The price index is calculated as percentage change of average daily ticket price from the previous weekly reading. Raw ticket prices data is available for Enterprise users. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact us&lt;/a&gt; to inquire about the raw price data.&lt;/p&gt;
    * @param airline Filter data by airline. Accepted values: &lt;code&gt;united&lt;/code&gt;,&lt;code&gt;delta&lt;/code&gt;,&lt;code&gt;american_airlines&lt;/code&gt;,&lt;code&gt;southwest&lt;/code&gt;,&lt;code&gt;southern_airways_express&lt;/code&gt;,&lt;code&gt;alaska_airlines&lt;/code&gt;,&lt;code&gt;frontier_airlines&lt;/code&gt;,&lt;code&gt;jetblue_airways&lt;/code&gt;,&lt;code&gt;spirit_airlines&lt;/code&gt;,&lt;code&gt;sun_country_airlines&lt;/code&gt;,&lt;code&gt;breeze_airways&lt;/code&gt;,&lt;code&gt;hawaiian_airlines&lt;/code&gt; (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void airlinePriceIndex(String airline, LocalDate from, LocalDate to, Handler<AsyncResult<AirlinePriceIndexData>> resultHandler) {
        delegate.airlinePriceIndex(airline, from, to, resultHandler);
    }

    /**
    * Airline Price Index
    * &lt;p&gt;The Flight Ticket Price Index API provides comprehensive data on airline ticket prices, including the average daily ticket price and its percentage change (price index). This data, collected weekly and projected two weeks ahead, aggregates daily prices and indexes from the 50 busiest and largest airports across the USA. The dataset includes detailed information on airlines, dates, and average ticket prices, offering valuable insights for market analysis and pricing strategies.&lt;/p&gt;&lt;p&gt;The price index is calculated as percentage change of average daily ticket price from the previous weekly reading. Raw ticket prices data is available for Enterprise users. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact us&lt;/a&gt; to inquire about the raw price data.&lt;/p&gt;
    * @param airline Filter data by airline. Accepted values: &lt;code&gt;united&lt;/code&gt;,&lt;code&gt;delta&lt;/code&gt;,&lt;code&gt;american_airlines&lt;/code&gt;,&lt;code&gt;southwest&lt;/code&gt;,&lt;code&gt;southern_airways_express&lt;/code&gt;,&lt;code&gt;alaska_airlines&lt;/code&gt;,&lt;code&gt;frontier_airlines&lt;/code&gt;,&lt;code&gt;jetblue_airways&lt;/code&gt;,&lt;code&gt;spirit_airlines&lt;/code&gt;,&lt;code&gt;sun_country_airlines&lt;/code&gt;,&lt;code&gt;breeze_airways&lt;/code&gt;,&lt;code&gt;hawaiian_airlines&lt;/code&gt; (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void airlinePriceIndex(String airline, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<AirlinePriceIndexData>> resultHandler) {
        delegate.airlinePriceIndex(airline, from, to, authInfo, resultHandler);
    }

    /**
    * Airline Price Index
    * &lt;p&gt;The Flight Ticket Price Index API provides comprehensive data on airline ticket prices, including the average daily ticket price and its percentage change (price index). This data, collected weekly and projected two weeks ahead, aggregates daily prices and indexes from the 50 busiest and largest airports across the USA. The dataset includes detailed information on airlines, dates, and average ticket prices, offering valuable insights for market analysis and pricing strategies.&lt;/p&gt;&lt;p&gt;The price index is calculated as percentage change of average daily ticket price from the previous weekly reading. Raw ticket prices data is available for Enterprise users. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact us&lt;/a&gt; to inquire about the raw price data.&lt;/p&gt;
    * @param airline Filter data by airline. Accepted values: &lt;code&gt;united&lt;/code&gt;,&lt;code&gt;delta&lt;/code&gt;,&lt;code&gt;american_airlines&lt;/code&gt;,&lt;code&gt;southwest&lt;/code&gt;,&lt;code&gt;southern_airways_express&lt;/code&gt;,&lt;code&gt;alaska_airlines&lt;/code&gt;,&lt;code&gt;frontier_airlines&lt;/code&gt;,&lt;code&gt;jetblue_airways&lt;/code&gt;,&lt;code&gt;spirit_airlines&lt;/code&gt;,&lt;code&gt;sun_country_airlines&lt;/code&gt;,&lt;code&gt;breeze_airways&lt;/code&gt;,&lt;code&gt;hawaiian_airlines&lt;/code&gt; (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<AirlinePriceIndexData> rxAirlinePriceIndex(String airline, LocalDate from, LocalDate to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.airlinePriceIndex(airline, from, to, fut)
        ));
    }

    /**
    * Airline Price Index
    * &lt;p&gt;The Flight Ticket Price Index API provides comprehensive data on airline ticket prices, including the average daily ticket price and its percentage change (price index). This data, collected weekly and projected two weeks ahead, aggregates daily prices and indexes from the 50 busiest and largest airports across the USA. The dataset includes detailed information on airlines, dates, and average ticket prices, offering valuable insights for market analysis and pricing strategies.&lt;/p&gt;&lt;p&gt;The price index is calculated as percentage change of average daily ticket price from the previous weekly reading. Raw ticket prices data is available for Enterprise users. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact us&lt;/a&gt; to inquire about the raw price data.&lt;/p&gt;
    * @param airline Filter data by airline. Accepted values: &lt;code&gt;united&lt;/code&gt;,&lt;code&gt;delta&lt;/code&gt;,&lt;code&gt;american_airlines&lt;/code&gt;,&lt;code&gt;southwest&lt;/code&gt;,&lt;code&gt;southern_airways_express&lt;/code&gt;,&lt;code&gt;alaska_airlines&lt;/code&gt;,&lt;code&gt;frontier_airlines&lt;/code&gt;,&lt;code&gt;jetblue_airways&lt;/code&gt;,&lt;code&gt;spirit_airlines&lt;/code&gt;,&lt;code&gt;sun_country_airlines&lt;/code&gt;,&lt;code&gt;breeze_airways&lt;/code&gt;,&lt;code&gt;hawaiian_airlines&lt;/code&gt; (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<AirlinePriceIndexData> rxAirlinePriceIndex(String airline, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.airlinePriceIndex(airline, from, to, authInfo, fut)
        ));
    }
    /**
    * Bank Branch List
    * Retrieve list of US bank branches information for a given symbol.
    * @param symbol Symbol. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void bankBranch(Object symbol, Handler<AsyncResult<BankBranchRes>> resultHandler) {
        delegate.bankBranch(symbol, resultHandler);
    }

    /**
    * Bank Branch List
    * Retrieve list of US bank branches information for a given symbol.
    * @param symbol Symbol. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void bankBranch(Object symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<BankBranchRes>> resultHandler) {
        delegate.bankBranch(symbol, authInfo, resultHandler);
    }

    /**
    * Bank Branch List
    * Retrieve list of US bank branches information for a given symbol.
    * @param symbol Symbol. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<BankBranchRes> rxBankBranch(Object symbol) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.bankBranch(symbol, fut)
        ));
    }

    /**
    * Bank Branch List
    * Retrieve list of US bank branches information for a given symbol.
    * @param symbol Symbol. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<BankBranchRes> rxBankBranch(Object symbol, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.bankBranch(symbol, authInfo, fut)
        ));
    }
    /**
    * Bond price data
    * &lt;p&gt;Get bond&#39;s price data. The following datasets are supported:&lt;/p&gt;&lt;table class&#x3D;\&quot;table table-hover\&quot;&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Exchange&lt;/th&gt;       &lt;th&gt;Segment&lt;/th&gt;       &lt;th&gt;Delay&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;   &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;US Government Bonds&lt;/th&gt;       &lt;td&gt;Government Bonds&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;BTDS: US Corporate Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;144A Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
    * @param isin ISIN. (required)
    * @param from UNIX timestamp. Interval initial value. (required)
    * @param to UNIX timestamp. Interval end value. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void bondPrice(String isin, Long from, Long to, Handler<AsyncResult<BondCandles>> resultHandler) {
        delegate.bondPrice(isin, from, to, resultHandler);
    }

    /**
    * Bond price data
    * &lt;p&gt;Get bond&#39;s price data. The following datasets are supported:&lt;/p&gt;&lt;table class&#x3D;\&quot;table table-hover\&quot;&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Exchange&lt;/th&gt;       &lt;th&gt;Segment&lt;/th&gt;       &lt;th&gt;Delay&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;   &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;US Government Bonds&lt;/th&gt;       &lt;td&gt;Government Bonds&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;BTDS: US Corporate Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;144A Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
    * @param isin ISIN. (required)
    * @param from UNIX timestamp. Interval initial value. (required)
    * @param to UNIX timestamp. Interval end value. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void bondPrice(String isin, Long from, Long to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<BondCandles>> resultHandler) {
        delegate.bondPrice(isin, from, to, authInfo, resultHandler);
    }

    /**
    * Bond price data
    * &lt;p&gt;Get bond&#39;s price data. The following datasets are supported:&lt;/p&gt;&lt;table class&#x3D;\&quot;table table-hover\&quot;&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Exchange&lt;/th&gt;       &lt;th&gt;Segment&lt;/th&gt;       &lt;th&gt;Delay&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;   &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;US Government Bonds&lt;/th&gt;       &lt;td&gt;Government Bonds&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;BTDS: US Corporate Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;144A Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
    * @param isin ISIN. (required)
    * @param from UNIX timestamp. Interval initial value. (required)
    * @param to UNIX timestamp. Interval end value. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<BondCandles> rxBondPrice(String isin, Long from, Long to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.bondPrice(isin, from, to, fut)
        ));
    }

    /**
    * Bond price data
    * &lt;p&gt;Get bond&#39;s price data. The following datasets are supported:&lt;/p&gt;&lt;table class&#x3D;\&quot;table table-hover\&quot;&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Exchange&lt;/th&gt;       &lt;th&gt;Segment&lt;/th&gt;       &lt;th&gt;Delay&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;   &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;US Government Bonds&lt;/th&gt;       &lt;td&gt;Government Bonds&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;BTDS: US Corporate Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;144A Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
    * @param isin ISIN. (required)
    * @param from UNIX timestamp. Interval initial value. (required)
    * @param to UNIX timestamp. Interval end value. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<BondCandles> rxBondPrice(String isin, Long from, Long to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.bondPrice(isin, from, to, authInfo, fut)
        ));
    }
    /**
    * Bond Profile
    * Get general information of a bond. You can query by FIGI, ISIN or CUSIP. A list of supported bonds can be found &lt;a href&#x3D;\&quot;/api/v1/bond/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param isin ISIN (optional)
    * @param cusip CUSIP (optional)
    * @param figi FIGI (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void bondProfile(String isin, String cusip, String figi, Handler<AsyncResult<BondProfile>> resultHandler) {
        delegate.bondProfile(isin, cusip, figi, resultHandler);
    }

    /**
    * Bond Profile
    * Get general information of a bond. You can query by FIGI, ISIN or CUSIP. A list of supported bonds can be found &lt;a href&#x3D;\&quot;/api/v1/bond/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param isin ISIN (optional)
    * @param cusip CUSIP (optional)
    * @param figi FIGI (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void bondProfile(String isin, String cusip, String figi, ApiClient.AuthInfo authInfo, Handler<AsyncResult<BondProfile>> resultHandler) {
        delegate.bondProfile(isin, cusip, figi, authInfo, resultHandler);
    }

    /**
    * Bond Profile
    * Get general information of a bond. You can query by FIGI, ISIN or CUSIP. A list of supported bonds can be found &lt;a href&#x3D;\&quot;/api/v1/bond/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param isin ISIN (optional)
    * @param cusip CUSIP (optional)
    * @param figi FIGI (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<BondProfile> rxBondProfile(String isin, String cusip, String figi) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.bondProfile(isin, cusip, figi, fut)
        ));
    }

    /**
    * Bond Profile
    * Get general information of a bond. You can query by FIGI, ISIN or CUSIP. A list of supported bonds can be found &lt;a href&#x3D;\&quot;/api/v1/bond/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param isin ISIN (optional)
    * @param cusip CUSIP (optional)
    * @param figi FIGI (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<BondProfile> rxBondProfile(String isin, String cusip, String figi, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.bondProfile(isin, cusip, figi, authInfo, fut)
        ));
    }
    /**
    * Bond Tick Data
    * &lt;p&gt;Get trade-level data for bonds. The following datasets are supported:&lt;/p&gt;&lt;table class&#x3D;\&quot;table table-hover\&quot;&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Exchange&lt;/th&gt;       &lt;th&gt;Segment&lt;/th&gt;       &lt;th&gt;Delay&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;BTDS: US Corporate Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;144A Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
    * @param isin ISIN. (required)
    * @param date Date: 2020-04-02. (required)
    * @param limit Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; (required)
    * @param skip Number of ticks to skip. Use this parameter to loop through the entire data. (required)
    * @param exchange Currently support the following values: &lt;code&gt;trace&lt;/code&gt;. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void bondTick(String isin, LocalDate date, Long limit, Long skip, String exchange, Handler<AsyncResult<BondTickData>> resultHandler) {
        delegate.bondTick(isin, date, limit, skip, exchange, resultHandler);
    }

    /**
    * Bond Tick Data
    * &lt;p&gt;Get trade-level data for bonds. The following datasets are supported:&lt;/p&gt;&lt;table class&#x3D;\&quot;table table-hover\&quot;&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Exchange&lt;/th&gt;       &lt;th&gt;Segment&lt;/th&gt;       &lt;th&gt;Delay&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;BTDS: US Corporate Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;144A Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
    * @param isin ISIN. (required)
    * @param date Date: 2020-04-02. (required)
    * @param limit Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; (required)
    * @param skip Number of ticks to skip. Use this parameter to loop through the entire data. (required)
    * @param exchange Currently support the following values: &lt;code&gt;trace&lt;/code&gt;. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void bondTick(String isin, LocalDate date, Long limit, Long skip, String exchange, ApiClient.AuthInfo authInfo, Handler<AsyncResult<BondTickData>> resultHandler) {
        delegate.bondTick(isin, date, limit, skip, exchange, authInfo, resultHandler);
    }

    /**
    * Bond Tick Data
    * &lt;p&gt;Get trade-level data for bonds. The following datasets are supported:&lt;/p&gt;&lt;table class&#x3D;\&quot;table table-hover\&quot;&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Exchange&lt;/th&gt;       &lt;th&gt;Segment&lt;/th&gt;       &lt;th&gt;Delay&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;BTDS: US Corporate Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;144A Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
    * @param isin ISIN. (required)
    * @param date Date: 2020-04-02. (required)
    * @param limit Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; (required)
    * @param skip Number of ticks to skip. Use this parameter to loop through the entire data. (required)
    * @param exchange Currently support the following values: &lt;code&gt;trace&lt;/code&gt;. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<BondTickData> rxBondTick(String isin, LocalDate date, Long limit, Long skip, String exchange) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.bondTick(isin, date, limit, skip, exchange, fut)
        ));
    }

    /**
    * Bond Tick Data
    * &lt;p&gt;Get trade-level data for bonds. The following datasets are supported:&lt;/p&gt;&lt;table class&#x3D;\&quot;table table-hover\&quot;&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Exchange&lt;/th&gt;       &lt;th&gt;Segment&lt;/th&gt;       &lt;th&gt;Delay&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;BTDS: US Corporate Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;144A Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
    * @param isin ISIN. (required)
    * @param date Date: 2020-04-02. (required)
    * @param limit Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; (required)
    * @param skip Number of ticks to skip. Use this parameter to loop through the entire data. (required)
    * @param exchange Currently support the following values: &lt;code&gt;trace&lt;/code&gt;. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<BondTickData> rxBondTick(String isin, LocalDate date, Long limit, Long skip, String exchange, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.bondTick(isin, date, limit, skip, exchange, authInfo, fut)
        ));
    }
    /**
    * Bond Yield Curve
    * Get yield curve data for Treasury bonds.
    * @param code Bond&#39;s code. You can find the list of supported code &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1iA-lM0Kht7lsQZ7Uu_s6r2i1BbQNUNO9eGkO5-zglHg/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener\&quot;&gt;here&lt;/a&gt;. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void bondYieldCurve(String code, Handler<AsyncResult<BondYieldCurve>> resultHandler) {
        delegate.bondYieldCurve(code, resultHandler);
    }

    /**
    * Bond Yield Curve
    * Get yield curve data for Treasury bonds.
    * @param code Bond&#39;s code. You can find the list of supported code &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1iA-lM0Kht7lsQZ7Uu_s6r2i1BbQNUNO9eGkO5-zglHg/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener\&quot;&gt;here&lt;/a&gt;. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void bondYieldCurve(String code, ApiClient.AuthInfo authInfo, Handler<AsyncResult<BondYieldCurve>> resultHandler) {
        delegate.bondYieldCurve(code, authInfo, resultHandler);
    }

    /**
    * Bond Yield Curve
    * Get yield curve data for Treasury bonds.
    * @param code Bond&#39;s code. You can find the list of supported code &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1iA-lM0Kht7lsQZ7Uu_s6r2i1BbQNUNO9eGkO5-zglHg/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener\&quot;&gt;here&lt;/a&gt;. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<BondYieldCurve> rxBondYieldCurve(String code) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.bondYieldCurve(code, fut)
        ));
    }

    /**
    * Bond Yield Curve
    * Get yield curve data for Treasury bonds.
    * @param code Bond&#39;s code. You can find the list of supported code &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1iA-lM0Kht7lsQZ7Uu_s6r2i1BbQNUNO9eGkO5-zglHg/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener\&quot;&gt;here&lt;/a&gt;. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<BondYieldCurve> rxBondYieldCurve(String code, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.bondYieldCurve(code, authInfo, fut)
        ));
    }
    /**
    * Basic Financials
    * Get company basic financials such as margin, P/E ratio, 52-week high/low etc.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param metric Metric type. Can be 1 of the following values &lt;code&gt;all&lt;/code&gt; (required)
    * @param resultHandler Asynchronous result handler
    */
    public void companyBasicFinancials(String symbol, String metric, Handler<AsyncResult<BasicFinancials>> resultHandler) {
        delegate.companyBasicFinancials(symbol, metric, resultHandler);
    }

    /**
    * Basic Financials
    * Get company basic financials such as margin, P/E ratio, 52-week high/low etc.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param metric Metric type. Can be 1 of the following values &lt;code&gt;all&lt;/code&gt; (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void companyBasicFinancials(String symbol, String metric, ApiClient.AuthInfo authInfo, Handler<AsyncResult<BasicFinancials>> resultHandler) {
        delegate.companyBasicFinancials(symbol, metric, authInfo, resultHandler);
    }

    /**
    * Basic Financials
    * Get company basic financials such as margin, P/E ratio, 52-week high/low etc.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param metric Metric type. Can be 1 of the following values &lt;code&gt;all&lt;/code&gt; (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<BasicFinancials> rxCompanyBasicFinancials(String symbol, String metric) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyBasicFinancials(symbol, metric, fut)
        ));
    }

    /**
    * Basic Financials
    * Get company basic financials such as margin, P/E ratio, 52-week high/low etc.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param metric Metric type. Can be 1 of the following values &lt;code&gt;all&lt;/code&gt; (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<BasicFinancials> rxCompanyBasicFinancials(String symbol, String metric, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyBasicFinancials(symbol, metric, authInfo, fut)
        ));
    }
    /**
    * Earnings Surprises
    * Get company historical quarterly earnings surprise going back to 2000.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param limit Limit number of period returned. Leave blank to get the full history. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void companyEarnings(String symbol, Long limit, Handler<AsyncResult<List<EarningResult>>> resultHandler) {
        delegate.companyEarnings(symbol, limit, resultHandler);
    }

    /**
    * Earnings Surprises
    * Get company historical quarterly earnings surprise going back to 2000.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param limit Limit number of period returned. Leave blank to get the full history. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void companyEarnings(String symbol, Long limit, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<EarningResult>>> resultHandler) {
        delegate.companyEarnings(symbol, limit, authInfo, resultHandler);
    }

    /**
    * Earnings Surprises
    * Get company historical quarterly earnings surprise going back to 2000.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param limit Limit number of period returned. Leave blank to get the full history. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<EarningResult>> rxCompanyEarnings(String symbol, Long limit) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyEarnings(symbol, limit, fut)
        ));
    }

    /**
    * Earnings Surprises
    * Get company historical quarterly earnings surprise going back to 2000.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param limit Limit number of period returned. Leave blank to get the full history. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<EarningResult>> rxCompanyEarnings(String symbol, Long limit, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyEarnings(symbol, limit, authInfo, fut)
        ));
    }
    /**
    * Company Earnings Quality Score
    * &lt;p&gt;This endpoint provides Earnings Quality Score for global companies.&lt;/p&gt;&lt;p&gt; Earnings quality refers to the extent to which current earnings predict future earnings. \&quot;High-quality\&quot; earnings are expected to persist, while \&quot;low-quality\&quot; earnings do not. A higher score means a higher earnings quality&lt;/p&gt;&lt;p&gt;Finnhub uses a proprietary model which takes into consideration 4 criteria:&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: unset; margin-left: 30px;\&quot;&gt;&lt;li&gt;Profitability&lt;/li&gt;&lt;li&gt;Growth&lt;/li&gt;&lt;li&gt;Cash Generation &amp; Capital Allocation&lt;/li&gt;&lt;li&gt;Leverage&lt;/li&gt;&lt;/ul&gt;&lt;br/&gt;&lt;p&gt;We then compare the metrics of each company in each category against its peers in the same industry to gauge how quality its earnings is.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param freq Frequency. Currently support &lt;code&gt;annual&lt;/code&gt; and &lt;code&gt;quarterly&lt;/code&gt; (required)
    * @param resultHandler Asynchronous result handler
    */
    public void companyEarningsQualityScore(String symbol, String freq, Handler<AsyncResult<CompanyEarningsQualityScore>> resultHandler) {
        delegate.companyEarningsQualityScore(symbol, freq, resultHandler);
    }

    /**
    * Company Earnings Quality Score
    * &lt;p&gt;This endpoint provides Earnings Quality Score for global companies.&lt;/p&gt;&lt;p&gt; Earnings quality refers to the extent to which current earnings predict future earnings. \&quot;High-quality\&quot; earnings are expected to persist, while \&quot;low-quality\&quot; earnings do not. A higher score means a higher earnings quality&lt;/p&gt;&lt;p&gt;Finnhub uses a proprietary model which takes into consideration 4 criteria:&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: unset; margin-left: 30px;\&quot;&gt;&lt;li&gt;Profitability&lt;/li&gt;&lt;li&gt;Growth&lt;/li&gt;&lt;li&gt;Cash Generation &amp; Capital Allocation&lt;/li&gt;&lt;li&gt;Leverage&lt;/li&gt;&lt;/ul&gt;&lt;br/&gt;&lt;p&gt;We then compare the metrics of each company in each category against its peers in the same industry to gauge how quality its earnings is.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param freq Frequency. Currently support &lt;code&gt;annual&lt;/code&gt; and &lt;code&gt;quarterly&lt;/code&gt; (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void companyEarningsQualityScore(String symbol, String freq, ApiClient.AuthInfo authInfo, Handler<AsyncResult<CompanyEarningsQualityScore>> resultHandler) {
        delegate.companyEarningsQualityScore(symbol, freq, authInfo, resultHandler);
    }

    /**
    * Company Earnings Quality Score
    * &lt;p&gt;This endpoint provides Earnings Quality Score for global companies.&lt;/p&gt;&lt;p&gt; Earnings quality refers to the extent to which current earnings predict future earnings. \&quot;High-quality\&quot; earnings are expected to persist, while \&quot;low-quality\&quot; earnings do not. A higher score means a higher earnings quality&lt;/p&gt;&lt;p&gt;Finnhub uses a proprietary model which takes into consideration 4 criteria:&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: unset; margin-left: 30px;\&quot;&gt;&lt;li&gt;Profitability&lt;/li&gt;&lt;li&gt;Growth&lt;/li&gt;&lt;li&gt;Cash Generation &amp; Capital Allocation&lt;/li&gt;&lt;li&gt;Leverage&lt;/li&gt;&lt;/ul&gt;&lt;br/&gt;&lt;p&gt;We then compare the metrics of each company in each category against its peers in the same industry to gauge how quality its earnings is.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param freq Frequency. Currently support &lt;code&gt;annual&lt;/code&gt; and &lt;code&gt;quarterly&lt;/code&gt; (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<CompanyEarningsQualityScore> rxCompanyEarningsQualityScore(String symbol, String freq) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyEarningsQualityScore(symbol, freq, fut)
        ));
    }

    /**
    * Company Earnings Quality Score
    * &lt;p&gt;This endpoint provides Earnings Quality Score for global companies.&lt;/p&gt;&lt;p&gt; Earnings quality refers to the extent to which current earnings predict future earnings. \&quot;High-quality\&quot; earnings are expected to persist, while \&quot;low-quality\&quot; earnings do not. A higher score means a higher earnings quality&lt;/p&gt;&lt;p&gt;Finnhub uses a proprietary model which takes into consideration 4 criteria:&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: unset; margin-left: 30px;\&quot;&gt;&lt;li&gt;Profitability&lt;/li&gt;&lt;li&gt;Growth&lt;/li&gt;&lt;li&gt;Cash Generation &amp; Capital Allocation&lt;/li&gt;&lt;li&gt;Leverage&lt;/li&gt;&lt;/ul&gt;&lt;br/&gt;&lt;p&gt;We then compare the metrics of each company in each category against its peers in the same industry to gauge how quality its earnings is.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param freq Frequency. Currently support &lt;code&gt;annual&lt;/code&gt; and &lt;code&gt;quarterly&lt;/code&gt; (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<CompanyEarningsQualityScore> rxCompanyEarningsQualityScore(String symbol, String freq, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyEarningsQualityScore(symbol, freq, authInfo, fut)
        ));
    }
    /**
    * EBIT Estimates
    * Get company&#39;s ebit estimates.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param freq Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void companyEbitEstimates(String symbol, String freq, Handler<AsyncResult<EbitEstimates>> resultHandler) {
        delegate.companyEbitEstimates(symbol, freq, resultHandler);
    }

    /**
    * EBIT Estimates
    * Get company&#39;s ebit estimates.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param freq Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void companyEbitEstimates(String symbol, String freq, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EbitEstimates>> resultHandler) {
        delegate.companyEbitEstimates(symbol, freq, authInfo, resultHandler);
    }

    /**
    * EBIT Estimates
    * Get company&#39;s ebit estimates.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param freq Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<EbitEstimates> rxCompanyEbitEstimates(String symbol, String freq) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyEbitEstimates(symbol, freq, fut)
        ));
    }

    /**
    * EBIT Estimates
    * Get company&#39;s ebit estimates.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param freq Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<EbitEstimates> rxCompanyEbitEstimates(String symbol, String freq, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyEbitEstimates(symbol, freq, authInfo, fut)
        ));
    }
    /**
    * EBITDA Estimates
    * Get company&#39;s ebitda estimates.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param freq Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void companyEbitdaEstimates(String symbol, String freq, Handler<AsyncResult<EbitdaEstimates>> resultHandler) {
        delegate.companyEbitdaEstimates(symbol, freq, resultHandler);
    }

    /**
    * EBITDA Estimates
    * Get company&#39;s ebitda estimates.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param freq Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void companyEbitdaEstimates(String symbol, String freq, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EbitdaEstimates>> resultHandler) {
        delegate.companyEbitdaEstimates(symbol, freq, authInfo, resultHandler);
    }

    /**
    * EBITDA Estimates
    * Get company&#39;s ebitda estimates.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param freq Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<EbitdaEstimates> rxCompanyEbitdaEstimates(String symbol, String freq) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyEbitdaEstimates(symbol, freq, fut)
        ));
    }

    /**
    * EBITDA Estimates
    * Get company&#39;s ebitda estimates.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param freq Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<EbitdaEstimates> rxCompanyEbitdaEstimates(String symbol, String freq, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyEbitdaEstimates(symbol, freq, authInfo, fut)
        ));
    }
    /**
    * Earnings Estimates
    * Get company&#39;s EPS estimates.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param freq Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void companyEpsEstimates(String symbol, String freq, Handler<AsyncResult<EarningsEstimates>> resultHandler) {
        delegate.companyEpsEstimates(symbol, freq, resultHandler);
    }

    /**
    * Earnings Estimates
    * Get company&#39;s EPS estimates.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param freq Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void companyEpsEstimates(String symbol, String freq, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EarningsEstimates>> resultHandler) {
        delegate.companyEpsEstimates(symbol, freq, authInfo, resultHandler);
    }

    /**
    * Earnings Estimates
    * Get company&#39;s EPS estimates.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param freq Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<EarningsEstimates> rxCompanyEpsEstimates(String symbol, String freq) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyEpsEstimates(symbol, freq, fut)
        ));
    }

    /**
    * Earnings Estimates
    * Get company&#39;s EPS estimates.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param freq Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<EarningsEstimates> rxCompanyEpsEstimates(String symbol, String freq, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyEpsEstimates(symbol, freq, authInfo, fut)
        ));
    }
    /**
    * Company ESG Scores
    * &lt;p&gt;This endpoint provides the latest ESG scores and important indicators for 7000+ global companies. The data is collected through company&#39;s public ESG disclosure and public sources.&lt;/p&gt;&lt;p&gt;Our ESG scoring models takes into account more than 150 different inputs to calculate the level of ESG risks and how well a company is managing them. A higher score means lower ESG risk or better ESG management. ESG scores are in the the range of 0-100. Some key indicators might contain letter-grade score from C- to A+ with C- is the lowest score and A+ is the highest score.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void companyEsgScore(String symbol, Handler<AsyncResult<CompanyESG>> resultHandler) {
        delegate.companyEsgScore(symbol, resultHandler);
    }

    /**
    * Company ESG Scores
    * &lt;p&gt;This endpoint provides the latest ESG scores and important indicators for 7000+ global companies. The data is collected through company&#39;s public ESG disclosure and public sources.&lt;/p&gt;&lt;p&gt;Our ESG scoring models takes into account more than 150 different inputs to calculate the level of ESG risks and how well a company is managing them. A higher score means lower ESG risk or better ESG management. ESG scores are in the the range of 0-100. Some key indicators might contain letter-grade score from C- to A+ with C- is the lowest score and A+ is the highest score.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void companyEsgScore(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<CompanyESG>> resultHandler) {
        delegate.companyEsgScore(symbol, authInfo, resultHandler);
    }

    /**
    * Company ESG Scores
    * &lt;p&gt;This endpoint provides the latest ESG scores and important indicators for 7000+ global companies. The data is collected through company&#39;s public ESG disclosure and public sources.&lt;/p&gt;&lt;p&gt;Our ESG scoring models takes into account more than 150 different inputs to calculate the level of ESG risks and how well a company is managing them. A higher score means lower ESG risk or better ESG management. ESG scores are in the the range of 0-100. Some key indicators might contain letter-grade score from C- to A+ with C- is the lowest score and A+ is the highest score.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<CompanyESG> rxCompanyEsgScore(String symbol) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyEsgScore(symbol, fut)
        ));
    }

    /**
    * Company ESG Scores
    * &lt;p&gt;This endpoint provides the latest ESG scores and important indicators for 7000+ global companies. The data is collected through company&#39;s public ESG disclosure and public sources.&lt;/p&gt;&lt;p&gt;Our ESG scoring models takes into account more than 150 different inputs to calculate the level of ESG risks and how well a company is managing them. A higher score means lower ESG risk or better ESG management. ESG scores are in the the range of 0-100. Some key indicators might contain letter-grade score from C- to A+ with C- is the lowest score and A+ is the highest score.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<CompanyESG> rxCompanyEsgScore(String symbol, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyEsgScore(symbol, authInfo, fut)
        ));
    }
    /**
    * Company Executive
    * Get a list of company&#39;s executives and members of the Board.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void companyExecutive(String symbol, Handler<AsyncResult<CompanyExecutive>> resultHandler) {
        delegate.companyExecutive(symbol, resultHandler);
    }

    /**
    * Company Executive
    * Get a list of company&#39;s executives and members of the Board.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void companyExecutive(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<CompanyExecutive>> resultHandler) {
        delegate.companyExecutive(symbol, authInfo, resultHandler);
    }

    /**
    * Company Executive
    * Get a list of company&#39;s executives and members of the Board.
    * @param symbol Symbol of the company: AAPL. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<CompanyExecutive> rxCompanyExecutive(String symbol) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyExecutive(symbol, fut)
        ));
    }

    /**
    * Company Executive
    * Get a list of company&#39;s executives and members of the Board.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<CompanyExecutive> rxCompanyExecutive(String symbol, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyExecutive(symbol, authInfo, fut)
        ));
    }
    /**
    * Historical ESG Scores
    * &lt;p&gt;This endpoint provides historical ESG scores and important indicators for 7000+ global companies. The data is collected through company&#39;s public ESG disclosure and public sources.&lt;/p&gt;&lt;p&gt;Our ESG scoring models takes into account more than 150 different inputs to calculate the level of ESG risks and how well a company is managing them. A higher score means lower ESG risk or better ESG management. ESG scores are in the the range of 0-100. Some key indicators might contain letter-grade score from C- to A+ with C- is the lowest score and A+ is the highest score.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void companyHistoricalEsgScore(String symbol, Handler<AsyncResult<HistoricalCompanyESG>> resultHandler) {
        delegate.companyHistoricalEsgScore(symbol, resultHandler);
    }

    /**
    * Historical ESG Scores
    * &lt;p&gt;This endpoint provides historical ESG scores and important indicators for 7000+ global companies. The data is collected through company&#39;s public ESG disclosure and public sources.&lt;/p&gt;&lt;p&gt;Our ESG scoring models takes into account more than 150 different inputs to calculate the level of ESG risks and how well a company is managing them. A higher score means lower ESG risk or better ESG management. ESG scores are in the the range of 0-100. Some key indicators might contain letter-grade score from C- to A+ with C- is the lowest score and A+ is the highest score.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void companyHistoricalEsgScore(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<HistoricalCompanyESG>> resultHandler) {
        delegate.companyHistoricalEsgScore(symbol, authInfo, resultHandler);
    }

    /**
    * Historical ESG Scores
    * &lt;p&gt;This endpoint provides historical ESG scores and important indicators for 7000+ global companies. The data is collected through company&#39;s public ESG disclosure and public sources.&lt;/p&gt;&lt;p&gt;Our ESG scoring models takes into account more than 150 different inputs to calculate the level of ESG risks and how well a company is managing them. A higher score means lower ESG risk or better ESG management. ESG scores are in the the range of 0-100. Some key indicators might contain letter-grade score from C- to A+ with C- is the lowest score and A+ is the highest score.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<HistoricalCompanyESG> rxCompanyHistoricalEsgScore(String symbol) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyHistoricalEsgScore(symbol, fut)
        ));
    }

    /**
    * Historical ESG Scores
    * &lt;p&gt;This endpoint provides historical ESG scores and important indicators for 7000+ global companies. The data is collected through company&#39;s public ESG disclosure and public sources.&lt;/p&gt;&lt;p&gt;Our ESG scoring models takes into account more than 150 different inputs to calculate the level of ESG risks and how well a company is managing them. A higher score means lower ESG risk or better ESG management. ESG scores are in the the range of 0-100. Some key indicators might contain letter-grade score from C- to A+ with C- is the lowest score and A+ is the highest score.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<HistoricalCompanyESG> rxCompanyHistoricalEsgScore(String symbol, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyHistoricalEsgScore(symbol, authInfo, fut)
        ));
    }
    /**
    * Company News
    * List latest company news by symbol. This endpoint is only available for North American companies.
    * @param symbol Company symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void companyNews(String symbol, LocalDate from, LocalDate to, Handler<AsyncResult<List<CompanyNews>>> resultHandler) {
        delegate.companyNews(symbol, from, to, resultHandler);
    }

    /**
    * Company News
    * List latest company news by symbol. This endpoint is only available for North American companies.
    * @param symbol Company symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void companyNews(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<CompanyNews>>> resultHandler) {
        delegate.companyNews(symbol, from, to, authInfo, resultHandler);
    }

    /**
    * Company News
    * List latest company news by symbol. This endpoint is only available for North American companies.
    * @param symbol Company symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<CompanyNews>> rxCompanyNews(String symbol, LocalDate from, LocalDate to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyNews(symbol, from, to, fut)
        ));
    }

    /**
    * Company News
    * List latest company news by symbol. This endpoint is only available for North American companies.
    * @param symbol Company symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<CompanyNews>> rxCompanyNews(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyNews(symbol, from, to, authInfo, fut)
        ));
    }
    /**
    * Peers
    * Get company peers. Return a list of peers operating in the same country and sector/industry.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param grouping Specify the grouping criteria for choosing peers.Supporter values: &lt;code&gt;sector&lt;/code&gt;, &lt;code&gt;industry&lt;/code&gt;, &lt;code&gt;subIndustry&lt;/code&gt;. Default to &lt;code&gt;subIndustry&lt;/code&gt;. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void companyPeers(String symbol, String grouping, Handler<AsyncResult<List<String>>> resultHandler) {
        delegate.companyPeers(symbol, grouping, resultHandler);
    }

    /**
    * Peers
    * Get company peers. Return a list of peers operating in the same country and sector/industry.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param grouping Specify the grouping criteria for choosing peers.Supporter values: &lt;code&gt;sector&lt;/code&gt;, &lt;code&gt;industry&lt;/code&gt;, &lt;code&gt;subIndustry&lt;/code&gt;. Default to &lt;code&gt;subIndustry&lt;/code&gt;. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void companyPeers(String symbol, String grouping, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<String>>> resultHandler) {
        delegate.companyPeers(symbol, grouping, authInfo, resultHandler);
    }

    /**
    * Peers
    * Get company peers. Return a list of peers operating in the same country and sector/industry.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param grouping Specify the grouping criteria for choosing peers.Supporter values: &lt;code&gt;sector&lt;/code&gt;, &lt;code&gt;industry&lt;/code&gt;, &lt;code&gt;subIndustry&lt;/code&gt;. Default to &lt;code&gt;subIndustry&lt;/code&gt;. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<String>> rxCompanyPeers(String symbol, String grouping) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyPeers(symbol, grouping, fut)
        ));
    }

    /**
    * Peers
    * Get company peers. Return a list of peers operating in the same country and sector/industry.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param grouping Specify the grouping criteria for choosing peers.Supporter values: &lt;code&gt;sector&lt;/code&gt;, &lt;code&gt;industry&lt;/code&gt;, &lt;code&gt;subIndustry&lt;/code&gt;. Default to &lt;code&gt;subIndustry&lt;/code&gt;. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<String>> rxCompanyPeers(String symbol, String grouping, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyPeers(symbol, grouping, authInfo, fut)
        ));
    }
    /**
    * Company Profile
    * Get general information of a company. You can query by symbol, ISIN or CUSIP
    * @param symbol Symbol of the company: AAPL e.g. (optional)
    * @param isin ISIN (optional)
    * @param cusip CUSIP (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void companyProfile(String symbol, String isin, String cusip, Handler<AsyncResult<CompanyProfile>> resultHandler) {
        delegate.companyProfile(symbol, isin, cusip, resultHandler);
    }

    /**
    * Company Profile
    * Get general information of a company. You can query by symbol, ISIN or CUSIP
    * @param symbol Symbol of the company: AAPL e.g. (optional)
    * @param isin ISIN (optional)
    * @param cusip CUSIP (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void companyProfile(String symbol, String isin, String cusip, ApiClient.AuthInfo authInfo, Handler<AsyncResult<CompanyProfile>> resultHandler) {
        delegate.companyProfile(symbol, isin, cusip, authInfo, resultHandler);
    }

    /**
    * Company Profile
    * Get general information of a company. You can query by symbol, ISIN or CUSIP
    * @param symbol Symbol of the company: AAPL e.g. (optional)
    * @param isin ISIN (optional)
    * @param cusip CUSIP (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<CompanyProfile> rxCompanyProfile(String symbol, String isin, String cusip) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyProfile(symbol, isin, cusip, fut)
        ));
    }

    /**
    * Company Profile
    * Get general information of a company. You can query by symbol, ISIN or CUSIP
    * @param symbol Symbol of the company: AAPL e.g. (optional)
    * @param isin ISIN (optional)
    * @param cusip CUSIP (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<CompanyProfile> rxCompanyProfile(String symbol, String isin, String cusip, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyProfile(symbol, isin, cusip, authInfo, fut)
        ));
    }
    /**
    * Company Profile 2
    * Get general information of a company. You can query by symbol, ISIN or CUSIP. This is the free version of &lt;a href&#x3D;\&quot;#company-profile\&quot;&gt;Company Profile&lt;/a&gt;.
    * @param symbol Symbol of the company: AAPL e.g. (optional)
    * @param isin ISIN (optional)
    * @param cusip CUSIP (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void companyProfile2(String symbol, String isin, String cusip, Handler<AsyncResult<CompanyProfile2>> resultHandler) {
        delegate.companyProfile2(symbol, isin, cusip, resultHandler);
    }

    /**
    * Company Profile 2
    * Get general information of a company. You can query by symbol, ISIN or CUSIP. This is the free version of &lt;a href&#x3D;\&quot;#company-profile\&quot;&gt;Company Profile&lt;/a&gt;.
    * @param symbol Symbol of the company: AAPL e.g. (optional)
    * @param isin ISIN (optional)
    * @param cusip CUSIP (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void companyProfile2(String symbol, String isin, String cusip, ApiClient.AuthInfo authInfo, Handler<AsyncResult<CompanyProfile2>> resultHandler) {
        delegate.companyProfile2(symbol, isin, cusip, authInfo, resultHandler);
    }

    /**
    * Company Profile 2
    * Get general information of a company. You can query by symbol, ISIN or CUSIP. This is the free version of &lt;a href&#x3D;\&quot;#company-profile\&quot;&gt;Company Profile&lt;/a&gt;.
    * @param symbol Symbol of the company: AAPL e.g. (optional)
    * @param isin ISIN (optional)
    * @param cusip CUSIP (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<CompanyProfile2> rxCompanyProfile2(String symbol, String isin, String cusip) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyProfile2(symbol, isin, cusip, fut)
        ));
    }

    /**
    * Company Profile 2
    * Get general information of a company. You can query by symbol, ISIN or CUSIP. This is the free version of &lt;a href&#x3D;\&quot;#company-profile\&quot;&gt;Company Profile&lt;/a&gt;.
    * @param symbol Symbol of the company: AAPL e.g. (optional)
    * @param isin ISIN (optional)
    * @param cusip CUSIP (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<CompanyProfile2> rxCompanyProfile2(String symbol, String isin, String cusip, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyProfile2(symbol, isin, cusip, authInfo, fut)
        ));
    }
    /**
    * Revenue Estimates
    * Get company&#39;s revenue estimates.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param freq Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void companyRevenueEstimates(String symbol, String freq, Handler<AsyncResult<RevenueEstimates>> resultHandler) {
        delegate.companyRevenueEstimates(symbol, freq, resultHandler);
    }

    /**
    * Revenue Estimates
    * Get company&#39;s revenue estimates.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param freq Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void companyRevenueEstimates(String symbol, String freq, ApiClient.AuthInfo authInfo, Handler<AsyncResult<RevenueEstimates>> resultHandler) {
        delegate.companyRevenueEstimates(symbol, freq, authInfo, resultHandler);
    }

    /**
    * Revenue Estimates
    * Get company&#39;s revenue estimates.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param freq Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<RevenueEstimates> rxCompanyRevenueEstimates(String symbol, String freq) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyRevenueEstimates(symbol, freq, fut)
        ));
    }

    /**
    * Revenue Estimates
    * Get company&#39;s revenue estimates.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param freq Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<RevenueEstimates> rxCompanyRevenueEstimates(String symbol, String freq, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.companyRevenueEstimates(symbol, freq, authInfo, fut)
        ));
    }
    /**
    * Congressional Trading
    * Get stock trades data disclosed by members of congress.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void congressionalTrading(String symbol, LocalDate from, LocalDate to, Handler<AsyncResult<CongressionalTrading>> resultHandler) {
        delegate.congressionalTrading(symbol, from, to, resultHandler);
    }

    /**
    * Congressional Trading
    * Get stock trades data disclosed by members of congress.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void congressionalTrading(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<CongressionalTrading>> resultHandler) {
        delegate.congressionalTrading(symbol, from, to, authInfo, resultHandler);
    }

    /**
    * Congressional Trading
    * Get stock trades data disclosed by members of congress.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<CongressionalTrading> rxCongressionalTrading(String symbol, LocalDate from, LocalDate to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.congressionalTrading(symbol, from, to, fut)
        ));
    }

    /**
    * Congressional Trading
    * Get stock trades data disclosed by members of congress.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<CongressionalTrading> rxCongressionalTrading(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.congressionalTrading(symbol, from, to, authInfo, fut)
        ));
    }
    /**
    * Country Metadata
    * List all countries and metadata.
    * @param resultHandler Asynchronous result handler
    */
    public void country(Handler<AsyncResult<List<CountryMetadata>>> resultHandler) {
        delegate.country(resultHandler);
    }

    /**
    * Country Metadata
    * List all countries and metadata.
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void country(ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<CountryMetadata>>> resultHandler) {
        delegate.country(authInfo, resultHandler);
    }

    /**
    * Country Metadata
    * List all countries and metadata.
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<CountryMetadata>> rxCountry() {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.country(fut)
        ));
    }

    /**
    * Country Metadata
    * List all countries and metadata.
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<CountryMetadata>> rxCountry(ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.country(authInfo, fut)
        ));
    }
    /**
    * COVID-19
    * Get real-time updates on the number of COVID-19 (Corona virus) cases in the US with a state-by-state breakdown. Data is sourced from CDC and reputable sources. You can also access this API &lt;a href&#x3D;\&quot;https://rapidapi.com/Finnhub/api/finnhub-real-time-covid-19\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;nofollow\&quot;&gt;here&lt;/a&gt;
    * @param resultHandler Asynchronous result handler
    */
    public void covid19(Handler<AsyncResult<List<CovidInfo>>> resultHandler) {
        delegate.covid19(resultHandler);
    }

    /**
    * COVID-19
    * Get real-time updates on the number of COVID-19 (Corona virus) cases in the US with a state-by-state breakdown. Data is sourced from CDC and reputable sources. You can also access this API &lt;a href&#x3D;\&quot;https://rapidapi.com/Finnhub/api/finnhub-real-time-covid-19\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;nofollow\&quot;&gt;here&lt;/a&gt;
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void covid19(ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<CovidInfo>>> resultHandler) {
        delegate.covid19(authInfo, resultHandler);
    }

    /**
    * COVID-19
    * Get real-time updates on the number of COVID-19 (Corona virus) cases in the US with a state-by-state breakdown. Data is sourced from CDC and reputable sources. You can also access this API &lt;a href&#x3D;\&quot;https://rapidapi.com/Finnhub/api/finnhub-real-time-covid-19\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;nofollow\&quot;&gt;here&lt;/a&gt;
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<CovidInfo>> rxCovid19() {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.covid19(fut)
        ));
    }

    /**
    * COVID-19
    * Get real-time updates on the number of COVID-19 (Corona virus) cases in the US with a state-by-state breakdown. Data is sourced from CDC and reputable sources. You can also access this API &lt;a href&#x3D;\&quot;https://rapidapi.com/Finnhub/api/finnhub-real-time-covid-19\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;nofollow\&quot;&gt;here&lt;/a&gt;
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<CovidInfo>> rxCovid19(ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.covid19(authInfo, fut)
        ));
    }
    /**
    * Crypto Candles
    * Get candlestick data for crypto symbols.
    * @param symbol Use symbol returned in &lt;code&gt;/crypto/symbol&lt;/code&gt; endpoint for this field. (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param from UNIX timestamp. Interval initial value. (required)
    * @param to UNIX timestamp. Interval end value. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void cryptoCandles(String symbol, String resolution, Long from, Long to, Handler<AsyncResult<CryptoCandles>> resultHandler) {
        delegate.cryptoCandles(symbol, resolution, from, to, resultHandler);
    }

    /**
    * Crypto Candles
    * Get candlestick data for crypto symbols.
    * @param symbol Use symbol returned in &lt;code&gt;/crypto/symbol&lt;/code&gt; endpoint for this field. (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param from UNIX timestamp. Interval initial value. (required)
    * @param to UNIX timestamp. Interval end value. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void cryptoCandles(String symbol, String resolution, Long from, Long to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<CryptoCandles>> resultHandler) {
        delegate.cryptoCandles(symbol, resolution, from, to, authInfo, resultHandler);
    }

    /**
    * Crypto Candles
    * Get candlestick data for crypto symbols.
    * @param symbol Use symbol returned in &lt;code&gt;/crypto/symbol&lt;/code&gt; endpoint for this field. (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param from UNIX timestamp. Interval initial value. (required)
    * @param to UNIX timestamp. Interval end value. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<CryptoCandles> rxCryptoCandles(String symbol, String resolution, Long from, Long to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.cryptoCandles(symbol, resolution, from, to, fut)
        ));
    }

    /**
    * Crypto Candles
    * Get candlestick data for crypto symbols.
    * @param symbol Use symbol returned in &lt;code&gt;/crypto/symbol&lt;/code&gt; endpoint for this field. (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param from UNIX timestamp. Interval initial value. (required)
    * @param to UNIX timestamp. Interval end value. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<CryptoCandles> rxCryptoCandles(String symbol, String resolution, Long from, Long to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.cryptoCandles(symbol, resolution, from, to, authInfo, fut)
        ));
    }
    /**
    * Crypto Exchanges
    * List supported crypto exchanges
    * @param resultHandler Asynchronous result handler
    */
    public void cryptoExchanges(Handler<AsyncResult<List<String>>> resultHandler) {
        delegate.cryptoExchanges(resultHandler);
    }

    /**
    * Crypto Exchanges
    * List supported crypto exchanges
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void cryptoExchanges(ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<String>>> resultHandler) {
        delegate.cryptoExchanges(authInfo, resultHandler);
    }

    /**
    * Crypto Exchanges
    * List supported crypto exchanges
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<String>> rxCryptoExchanges() {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.cryptoExchanges(fut)
        ));
    }

    /**
    * Crypto Exchanges
    * List supported crypto exchanges
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<String>> rxCryptoExchanges(ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.cryptoExchanges(authInfo, fut)
        ));
    }
    /**
    * Crypto Profile
    * Get crypto&#39;s profile.
    * @param symbol Crypto symbol such as BTC or ETH. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void cryptoProfile(String symbol, Handler<AsyncResult<CryptoProfile>> resultHandler) {
        delegate.cryptoProfile(symbol, resultHandler);
    }

    /**
    * Crypto Profile
    * Get crypto&#39;s profile.
    * @param symbol Crypto symbol such as BTC or ETH. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void cryptoProfile(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<CryptoProfile>> resultHandler) {
        delegate.cryptoProfile(symbol, authInfo, resultHandler);
    }

    /**
    * Crypto Profile
    * Get crypto&#39;s profile.
    * @param symbol Crypto symbol such as BTC or ETH. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<CryptoProfile> rxCryptoProfile(String symbol) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.cryptoProfile(symbol, fut)
        ));
    }

    /**
    * Crypto Profile
    * Get crypto&#39;s profile.
    * @param symbol Crypto symbol such as BTC or ETH. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<CryptoProfile> rxCryptoProfile(String symbol, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.cryptoProfile(symbol, authInfo, fut)
        ));
    }
    /**
    * Crypto Symbol
    * List supported crypto symbols by exchange
    * @param exchange Exchange you want to get the list of symbols from. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void cryptoSymbols(String exchange, Handler<AsyncResult<List<CryptoSymbol>>> resultHandler) {
        delegate.cryptoSymbols(exchange, resultHandler);
    }

    /**
    * Crypto Symbol
    * List supported crypto symbols by exchange
    * @param exchange Exchange you want to get the list of symbols from. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void cryptoSymbols(String exchange, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<CryptoSymbol>>> resultHandler) {
        delegate.cryptoSymbols(exchange, authInfo, resultHandler);
    }

    /**
    * Crypto Symbol
    * List supported crypto symbols by exchange
    * @param exchange Exchange you want to get the list of symbols from. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<CryptoSymbol>> rxCryptoSymbols(String exchange) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.cryptoSymbols(exchange, fut)
        ));
    }

    /**
    * Crypto Symbol
    * List supported crypto symbols by exchange
    * @param exchange Exchange you want to get the list of symbols from. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<CryptoSymbol>> rxCryptoSymbols(String exchange, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.cryptoSymbols(exchange, authInfo, fut)
        ));
    }
    /**
    * Earnings Calendar
    * Get historical and coming earnings release. EPS and Revenue in this endpoint are non-GAAP, which means they are adjusted to exclude some one-time or unusual items. This is the same data investors usually react to and talked about on the media. Estimates are sourced from both sell-side and buy-side analysts.
    * @param from From date: 2020-03-15. (optional)
    * @param to To date: 2020-03-16. (optional)
    * @param symbol Filter by symbol: AAPL. (optional)
    * @param international Set to &lt;code&gt;true&lt;/code&gt; to include international markets. Default value is &lt;code&gt;false&lt;/code&gt; (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void earningsCalendar(LocalDate from, LocalDate to, String symbol, Boolean international, Handler<AsyncResult<EarningsCalendar>> resultHandler) {
        delegate.earningsCalendar(from, to, symbol, international, resultHandler);
    }

    /**
    * Earnings Calendar
    * Get historical and coming earnings release. EPS and Revenue in this endpoint are non-GAAP, which means they are adjusted to exclude some one-time or unusual items. This is the same data investors usually react to and talked about on the media. Estimates are sourced from both sell-side and buy-side analysts.
    * @param from From date: 2020-03-15. (optional)
    * @param to To date: 2020-03-16. (optional)
    * @param symbol Filter by symbol: AAPL. (optional)
    * @param international Set to &lt;code&gt;true&lt;/code&gt; to include international markets. Default value is &lt;code&gt;false&lt;/code&gt; (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void earningsCalendar(LocalDate from, LocalDate to, String symbol, Boolean international, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EarningsCalendar>> resultHandler) {
        delegate.earningsCalendar(from, to, symbol, international, authInfo, resultHandler);
    }

    /**
    * Earnings Calendar
    * Get historical and coming earnings release. EPS and Revenue in this endpoint are non-GAAP, which means they are adjusted to exclude some one-time or unusual items. This is the same data investors usually react to and talked about on the media. Estimates are sourced from both sell-side and buy-side analysts.
    * @param from From date: 2020-03-15. (optional)
    * @param to To date: 2020-03-16. (optional)
    * @param symbol Filter by symbol: AAPL. (optional)
    * @param international Set to &lt;code&gt;true&lt;/code&gt; to include international markets. Default value is &lt;code&gt;false&lt;/code&gt; (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<EarningsCalendar> rxEarningsCalendar(LocalDate from, LocalDate to, String symbol, Boolean international) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.earningsCalendar(from, to, symbol, international, fut)
        ));
    }

    /**
    * Earnings Calendar
    * Get historical and coming earnings release. EPS and Revenue in this endpoint are non-GAAP, which means they are adjusted to exclude some one-time or unusual items. This is the same data investors usually react to and talked about on the media. Estimates are sourced from both sell-side and buy-side analysts.
    * @param from From date: 2020-03-15. (optional)
    * @param to To date: 2020-03-16. (optional)
    * @param symbol Filter by symbol: AAPL. (optional)
    * @param international Set to &lt;code&gt;true&lt;/code&gt; to include international markets. Default value is &lt;code&gt;false&lt;/code&gt; (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<EarningsCalendar> rxEarningsCalendar(LocalDate from, LocalDate to, String symbol, Boolean international, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.earningsCalendar(from, to, symbol, international, authInfo, fut)
        ));
    }
    /**
    * Earnings Call Audio Live
    * &lt;p&gt;Stream live earnings calls with data provided in the calendar. The data will be available in m3u8 format. mp3 files will be available once the calls finish in the &lt;code&gt;recording&lt;/code&gt; field.&lt;/p&gt;
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param symbol Filter by symbol: AAPL. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void earningsCallLive(LocalDate from, LocalDate to, String symbol, Handler<AsyncResult<EarningsCallLive>> resultHandler) {
        delegate.earningsCallLive(from, to, symbol, resultHandler);
    }

    /**
    * Earnings Call Audio Live
    * &lt;p&gt;Stream live earnings calls with data provided in the calendar. The data will be available in m3u8 format. mp3 files will be available once the calls finish in the &lt;code&gt;recording&lt;/code&gt; field.&lt;/p&gt;
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param symbol Filter by symbol: AAPL. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void earningsCallLive(LocalDate from, LocalDate to, String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EarningsCallLive>> resultHandler) {
        delegate.earningsCallLive(from, to, symbol, authInfo, resultHandler);
    }

    /**
    * Earnings Call Audio Live
    * &lt;p&gt;Stream live earnings calls with data provided in the calendar. The data will be available in m3u8 format. mp3 files will be available once the calls finish in the &lt;code&gt;recording&lt;/code&gt; field.&lt;/p&gt;
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param symbol Filter by symbol: AAPL. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<EarningsCallLive> rxEarningsCallLive(LocalDate from, LocalDate to, String symbol) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.earningsCallLive(from, to, symbol, fut)
        ));
    }

    /**
    * Earnings Call Audio Live
    * &lt;p&gt;Stream live earnings calls with data provided in the calendar. The data will be available in m3u8 format. mp3 files will be available once the calls finish in the &lt;code&gt;recording&lt;/code&gt; field.&lt;/p&gt;
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param symbol Filter by symbol: AAPL. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<EarningsCallLive> rxEarningsCallLive(LocalDate from, LocalDate to, String symbol, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.earningsCallLive(from, to, symbol, authInfo, fut)
        ));
    }
    /**
    * Economic Calendar
    * &lt;p&gt;Get recent and upcoming economic releases.&lt;/p&gt;&lt;p&gt;Historical events and surprises are available for Enterprise clients.&lt;/p&gt;
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void economicCalendar(LocalDate from, LocalDate to, Handler<AsyncResult<EconomicCalendar>> resultHandler) {
        delegate.economicCalendar(from, to, resultHandler);
    }

    /**
    * Economic Calendar
    * &lt;p&gt;Get recent and upcoming economic releases.&lt;/p&gt;&lt;p&gt;Historical events and surprises are available for Enterprise clients.&lt;/p&gt;
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void economicCalendar(LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EconomicCalendar>> resultHandler) {
        delegate.economicCalendar(from, to, authInfo, resultHandler);
    }

    /**
    * Economic Calendar
    * &lt;p&gt;Get recent and upcoming economic releases.&lt;/p&gt;&lt;p&gt;Historical events and surprises are available for Enterprise clients.&lt;/p&gt;
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<EconomicCalendar> rxEconomicCalendar(LocalDate from, LocalDate to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.economicCalendar(from, to, fut)
        ));
    }

    /**
    * Economic Calendar
    * &lt;p&gt;Get recent and upcoming economic releases.&lt;/p&gt;&lt;p&gt;Historical events and surprises are available for Enterprise clients.&lt;/p&gt;
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<EconomicCalendar> rxEconomicCalendar(LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.economicCalendar(from, to, authInfo, fut)
        ));
    }
    /**
    * Economic Code
    * List codes of supported economic data.
    * @param resultHandler Asynchronous result handler
    */
    public void economicCode(Handler<AsyncResult<List<EconomicCode>>> resultHandler) {
        delegate.economicCode(resultHandler);
    }

    /**
    * Economic Code
    * List codes of supported economic data.
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void economicCode(ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<EconomicCode>>> resultHandler) {
        delegate.economicCode(authInfo, resultHandler);
    }

    /**
    * Economic Code
    * List codes of supported economic data.
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<EconomicCode>> rxEconomicCode() {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.economicCode(fut)
        ));
    }

    /**
    * Economic Code
    * List codes of supported economic data.
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<EconomicCode>> rxEconomicCode(ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.economicCode(authInfo, fut)
        ));
    }
    /**
    * Economic Data
    * Get economic data.
    * @param code Economic code. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void economicData(String code, Handler<AsyncResult<EconomicData>> resultHandler) {
        delegate.economicData(code, resultHandler);
    }

    /**
    * Economic Data
    * Get economic data.
    * @param code Economic code. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void economicData(String code, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EconomicData>> resultHandler) {
        delegate.economicData(code, authInfo, resultHandler);
    }

    /**
    * Economic Data
    * Get economic data.
    * @param code Economic code. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<EconomicData> rxEconomicData(String code) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.economicData(code, fut)
        ));
    }

    /**
    * Economic Data
    * Get economic data.
    * @param code Economic code. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<EconomicData> rxEconomicData(String code, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.economicData(code, authInfo, fut)
        ));
    }
    /**
    * ETFs Country Exposure
    * Get ETF country exposure data.
    * @param symbol ETF symbol. (optional)
    * @param isin ETF isin. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void etfsCountryExposure(String symbol, String isin, Handler<AsyncResult<ETFsCountryExposure>> resultHandler) {
        delegate.etfsCountryExposure(symbol, isin, resultHandler);
    }

    /**
    * ETFs Country Exposure
    * Get ETF country exposure data.
    * @param symbol ETF symbol. (optional)
    * @param isin ETF isin. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void etfsCountryExposure(String symbol, String isin, ApiClient.AuthInfo authInfo, Handler<AsyncResult<ETFsCountryExposure>> resultHandler) {
        delegate.etfsCountryExposure(symbol, isin, authInfo, resultHandler);
    }

    /**
    * ETFs Country Exposure
    * Get ETF country exposure data.
    * @param symbol ETF symbol. (optional)
    * @param isin ETF isin. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<ETFsCountryExposure> rxEtfsCountryExposure(String symbol, String isin) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.etfsCountryExposure(symbol, isin, fut)
        ));
    }

    /**
    * ETFs Country Exposure
    * Get ETF country exposure data.
    * @param symbol ETF symbol. (optional)
    * @param isin ETF isin. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<ETFsCountryExposure> rxEtfsCountryExposure(String symbol, String isin, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.etfsCountryExposure(symbol, isin, authInfo, fut)
        ));
    }
    /**
    * ETFs Holdings
    * Get full ETF holdings/constituents. This endpoint has global coverage. Widget only shows top 10 holdings. A list of supported ETFs can be found &lt;a href&#x3D;\&quot;/api/v1/etf/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol ETF symbol. (optional)
    * @param isin ETF isin. (optional)
    * @param skip Skip the first n results. You can use this parameter to query historical constituents data. The latest result is returned if skip&#x3D;0 or not set. (optional)
    * @param date Query holdings by date. You can use either this param or &lt;code&gt;skip&lt;/code&gt; param, not both. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void etfsHoldings(String symbol, String isin, Long skip, String date, Handler<AsyncResult<ETFsHoldings>> resultHandler) {
        delegate.etfsHoldings(symbol, isin, skip, date, resultHandler);
    }

    /**
    * ETFs Holdings
    * Get full ETF holdings/constituents. This endpoint has global coverage. Widget only shows top 10 holdings. A list of supported ETFs can be found &lt;a href&#x3D;\&quot;/api/v1/etf/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol ETF symbol. (optional)
    * @param isin ETF isin. (optional)
    * @param skip Skip the first n results. You can use this parameter to query historical constituents data. The latest result is returned if skip&#x3D;0 or not set. (optional)
    * @param date Query holdings by date. You can use either this param or &lt;code&gt;skip&lt;/code&gt; param, not both. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void etfsHoldings(String symbol, String isin, Long skip, String date, ApiClient.AuthInfo authInfo, Handler<AsyncResult<ETFsHoldings>> resultHandler) {
        delegate.etfsHoldings(symbol, isin, skip, date, authInfo, resultHandler);
    }

    /**
    * ETFs Holdings
    * Get full ETF holdings/constituents. This endpoint has global coverage. Widget only shows top 10 holdings. A list of supported ETFs can be found &lt;a href&#x3D;\&quot;/api/v1/etf/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol ETF symbol. (optional)
    * @param isin ETF isin. (optional)
    * @param skip Skip the first n results. You can use this parameter to query historical constituents data. The latest result is returned if skip&#x3D;0 or not set. (optional)
    * @param date Query holdings by date. You can use either this param or &lt;code&gt;skip&lt;/code&gt; param, not both. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<ETFsHoldings> rxEtfsHoldings(String symbol, String isin, Long skip, String date) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.etfsHoldings(symbol, isin, skip, date, fut)
        ));
    }

    /**
    * ETFs Holdings
    * Get full ETF holdings/constituents. This endpoint has global coverage. Widget only shows top 10 holdings. A list of supported ETFs can be found &lt;a href&#x3D;\&quot;/api/v1/etf/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol ETF symbol. (optional)
    * @param isin ETF isin. (optional)
    * @param skip Skip the first n results. You can use this parameter to query historical constituents data. The latest result is returned if skip&#x3D;0 or not set. (optional)
    * @param date Query holdings by date. You can use either this param or &lt;code&gt;skip&lt;/code&gt; param, not both. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<ETFsHoldings> rxEtfsHoldings(String symbol, String isin, Long skip, String date, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.etfsHoldings(symbol, isin, skip, date, authInfo, fut)
        ));
    }
    /**
    * ETFs Profile
    * Get ETF profile information. This endpoint has global coverage. A list of supported ETFs can be found &lt;a href&#x3D;\&quot;/api/v1/etf/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol ETF symbol. (optional)
    * @param isin ETF isin. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void etfsProfile(String symbol, String isin, Handler<AsyncResult<ETFsProfile>> resultHandler) {
        delegate.etfsProfile(symbol, isin, resultHandler);
    }

    /**
    * ETFs Profile
    * Get ETF profile information. This endpoint has global coverage. A list of supported ETFs can be found &lt;a href&#x3D;\&quot;/api/v1/etf/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol ETF symbol. (optional)
    * @param isin ETF isin. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void etfsProfile(String symbol, String isin, ApiClient.AuthInfo authInfo, Handler<AsyncResult<ETFsProfile>> resultHandler) {
        delegate.etfsProfile(symbol, isin, authInfo, resultHandler);
    }

    /**
    * ETFs Profile
    * Get ETF profile information. This endpoint has global coverage. A list of supported ETFs can be found &lt;a href&#x3D;\&quot;/api/v1/etf/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol ETF symbol. (optional)
    * @param isin ETF isin. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<ETFsProfile> rxEtfsProfile(String symbol, String isin) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.etfsProfile(symbol, isin, fut)
        ));
    }

    /**
    * ETFs Profile
    * Get ETF profile information. This endpoint has global coverage. A list of supported ETFs can be found &lt;a href&#x3D;\&quot;/api/v1/etf/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol ETF symbol. (optional)
    * @param isin ETF isin. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<ETFsProfile> rxEtfsProfile(String symbol, String isin, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.etfsProfile(symbol, isin, authInfo, fut)
        ));
    }
    /**
    * ETFs Sector Exposure
    * Get ETF sector exposure data.
    * @param symbol ETF symbol. (optional)
    * @param isin ETF isin. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void etfsSectorExposure(String symbol, String isin, Handler<AsyncResult<ETFsSectorExposure>> resultHandler) {
        delegate.etfsSectorExposure(symbol, isin, resultHandler);
    }

    /**
    * ETFs Sector Exposure
    * Get ETF sector exposure data.
    * @param symbol ETF symbol. (optional)
    * @param isin ETF isin. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void etfsSectorExposure(String symbol, String isin, ApiClient.AuthInfo authInfo, Handler<AsyncResult<ETFsSectorExposure>> resultHandler) {
        delegate.etfsSectorExposure(symbol, isin, authInfo, resultHandler);
    }

    /**
    * ETFs Sector Exposure
    * Get ETF sector exposure data.
    * @param symbol ETF symbol. (optional)
    * @param isin ETF isin. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<ETFsSectorExposure> rxEtfsSectorExposure(String symbol, String isin) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.etfsSectorExposure(symbol, isin, fut)
        ));
    }

    /**
    * ETFs Sector Exposure
    * Get ETF sector exposure data.
    * @param symbol ETF symbol. (optional)
    * @param isin ETF isin. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<ETFsSectorExposure> rxEtfsSectorExposure(String symbol, String isin, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.etfsSectorExposure(symbol, isin, authInfo, fut)
        ));
    }
    /**
    * FDA Committee Meeting Calendar
    * FDA&#39;s advisory committees are established to provide functions which support the agency&#39;s mission of protecting and promoting the public health, while meeting the requirements set forth in the Federal Advisory Committee Act. Committees are either mandated by statute or established at the discretion of the Department of Health and Human Services. Each committee is subject to renewal at two-year intervals unless the committee charter states otherwise.
    * @param resultHandler Asynchronous result handler
    */
    public void fdaCommitteeMeetingCalendar(Handler<AsyncResult<List<FDAComitteeMeeting>>> resultHandler) {
        delegate.fdaCommitteeMeetingCalendar(resultHandler);
    }

    /**
    * FDA Committee Meeting Calendar
    * FDA&#39;s advisory committees are established to provide functions which support the agency&#39;s mission of protecting and promoting the public health, while meeting the requirements set forth in the Federal Advisory Committee Act. Committees are either mandated by statute or established at the discretion of the Department of Health and Human Services. Each committee is subject to renewal at two-year intervals unless the committee charter states otherwise.
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void fdaCommitteeMeetingCalendar(ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<FDAComitteeMeeting>>> resultHandler) {
        delegate.fdaCommitteeMeetingCalendar(authInfo, resultHandler);
    }

    /**
    * FDA Committee Meeting Calendar
    * FDA&#39;s advisory committees are established to provide functions which support the agency&#39;s mission of protecting and promoting the public health, while meeting the requirements set forth in the Federal Advisory Committee Act. Committees are either mandated by statute or established at the discretion of the Department of Health and Human Services. Each committee is subject to renewal at two-year intervals unless the committee charter states otherwise.
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<FDAComitteeMeeting>> rxFdaCommitteeMeetingCalendar() {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.fdaCommitteeMeetingCalendar(fut)
        ));
    }

    /**
    * FDA Committee Meeting Calendar
    * FDA&#39;s advisory committees are established to provide functions which support the agency&#39;s mission of protecting and promoting the public health, while meeting the requirements set forth in the Federal Advisory Committee Act. Committees are either mandated by statute or established at the discretion of the Department of Health and Human Services. Each committee is subject to renewal at two-year intervals unless the committee charter states otherwise.
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<FDAComitteeMeeting>> rxFdaCommitteeMeetingCalendar(ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.fdaCommitteeMeetingCalendar(authInfo, fut)
        ));
    }
    /**
    * SEC Filings
    * List company&#39;s filing. Limit to 250 documents at a time. This data is available for bulk download on &lt;a href&#x3D;\&quot;https://www.kaggle.com/finnhub/sec-filings\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Kaggle SEC Filings database&lt;/a&gt;.
    * @param symbol Symbol. Leave &lt;code&gt;symbol&lt;/code&gt;,&lt;code&gt;cik&lt;/code&gt; and &lt;code&gt;accessNumber&lt;/code&gt; empty to list latest filings. (optional)
    * @param cik CIK. (optional)
    * @param accessNumber Access number of a specific report you want to retrieve data from. (optional)
    * @param form Filter by form. You can use this value &lt;code&gt;NT 10-K&lt;/code&gt; to find non-timely filings for a company. (optional)
    * @param from From date: 2023-03-15. (optional)
    * @param to To date: 2023-03-16. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void filings(String symbol, String cik, String accessNumber, String form, LocalDate from, LocalDate to, Handler<AsyncResult<List<Filing>>> resultHandler) {
        delegate.filings(symbol, cik, accessNumber, form, from, to, resultHandler);
    }

    /**
    * SEC Filings
    * List company&#39;s filing. Limit to 250 documents at a time. This data is available for bulk download on &lt;a href&#x3D;\&quot;https://www.kaggle.com/finnhub/sec-filings\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Kaggle SEC Filings database&lt;/a&gt;.
    * @param symbol Symbol. Leave &lt;code&gt;symbol&lt;/code&gt;,&lt;code&gt;cik&lt;/code&gt; and &lt;code&gt;accessNumber&lt;/code&gt; empty to list latest filings. (optional)
    * @param cik CIK. (optional)
    * @param accessNumber Access number of a specific report you want to retrieve data from. (optional)
    * @param form Filter by form. You can use this value &lt;code&gt;NT 10-K&lt;/code&gt; to find non-timely filings for a company. (optional)
    * @param from From date: 2023-03-15. (optional)
    * @param to To date: 2023-03-16. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void filings(String symbol, String cik, String accessNumber, String form, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<Filing>>> resultHandler) {
        delegate.filings(symbol, cik, accessNumber, form, from, to, authInfo, resultHandler);
    }

    /**
    * SEC Filings
    * List company&#39;s filing. Limit to 250 documents at a time. This data is available for bulk download on &lt;a href&#x3D;\&quot;https://www.kaggle.com/finnhub/sec-filings\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Kaggle SEC Filings database&lt;/a&gt;.
    * @param symbol Symbol. Leave &lt;code&gt;symbol&lt;/code&gt;,&lt;code&gt;cik&lt;/code&gt; and &lt;code&gt;accessNumber&lt;/code&gt; empty to list latest filings. (optional)
    * @param cik CIK. (optional)
    * @param accessNumber Access number of a specific report you want to retrieve data from. (optional)
    * @param form Filter by form. You can use this value &lt;code&gt;NT 10-K&lt;/code&gt; to find non-timely filings for a company. (optional)
    * @param from From date: 2023-03-15. (optional)
    * @param to To date: 2023-03-16. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<Filing>> rxFilings(String symbol, String cik, String accessNumber, String form, LocalDate from, LocalDate to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.filings(symbol, cik, accessNumber, form, from, to, fut)
        ));
    }

    /**
    * SEC Filings
    * List company&#39;s filing. Limit to 250 documents at a time. This data is available for bulk download on &lt;a href&#x3D;\&quot;https://www.kaggle.com/finnhub/sec-filings\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Kaggle SEC Filings database&lt;/a&gt;.
    * @param symbol Symbol. Leave &lt;code&gt;symbol&lt;/code&gt;,&lt;code&gt;cik&lt;/code&gt; and &lt;code&gt;accessNumber&lt;/code&gt; empty to list latest filings. (optional)
    * @param cik CIK. (optional)
    * @param accessNumber Access number of a specific report you want to retrieve data from. (optional)
    * @param form Filter by form. You can use this value &lt;code&gt;NT 10-K&lt;/code&gt; to find non-timely filings for a company. (optional)
    * @param from From date: 2023-03-15. (optional)
    * @param to To date: 2023-03-16. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<Filing>> rxFilings(String symbol, String cik, String accessNumber, String form, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.filings(symbol, cik, accessNumber, form, from, to, authInfo, fut)
        ));
    }
    /**
    * SEC Sentiment Analysis
    * Get sentiment analysis of 10-K and 10-Q filings from SEC. An abnormal increase in the number of positive/negative words in filings can signal a significant change in the company&#39;s stock price in the upcoming 4 quarters. We make use of &lt;a href&#x3D; \&quot;https://sraf.nd.edu/textual-analysis/resources/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Loughran and McDonald Sentiment Word Lists&lt;/a&gt; to calculate the sentiment for each filing.
    * @param accessNumber Access number of a specific report you want to retrieve data from. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void filingsSentiment(String accessNumber, Handler<AsyncResult<SECSentimentAnalysis>> resultHandler) {
        delegate.filingsSentiment(accessNumber, resultHandler);
    }

    /**
    * SEC Sentiment Analysis
    * Get sentiment analysis of 10-K and 10-Q filings from SEC. An abnormal increase in the number of positive/negative words in filings can signal a significant change in the company&#39;s stock price in the upcoming 4 quarters. We make use of &lt;a href&#x3D; \&quot;https://sraf.nd.edu/textual-analysis/resources/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Loughran and McDonald Sentiment Word Lists&lt;/a&gt; to calculate the sentiment for each filing.
    * @param accessNumber Access number of a specific report you want to retrieve data from. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void filingsSentiment(String accessNumber, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SECSentimentAnalysis>> resultHandler) {
        delegate.filingsSentiment(accessNumber, authInfo, resultHandler);
    }

    /**
    * SEC Sentiment Analysis
    * Get sentiment analysis of 10-K and 10-Q filings from SEC. An abnormal increase in the number of positive/negative words in filings can signal a significant change in the company&#39;s stock price in the upcoming 4 quarters. We make use of &lt;a href&#x3D; \&quot;https://sraf.nd.edu/textual-analysis/resources/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Loughran and McDonald Sentiment Word Lists&lt;/a&gt; to calculate the sentiment for each filing.
    * @param accessNumber Access number of a specific report you want to retrieve data from. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<SECSentimentAnalysis> rxFilingsSentiment(String accessNumber) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.filingsSentiment(accessNumber, fut)
        ));
    }

    /**
    * SEC Sentiment Analysis
    * Get sentiment analysis of 10-K and 10-Q filings from SEC. An abnormal increase in the number of positive/negative words in filings can signal a significant change in the company&#39;s stock price in the upcoming 4 quarters. We make use of &lt;a href&#x3D; \&quot;https://sraf.nd.edu/textual-analysis/resources/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Loughran and McDonald Sentiment Word Lists&lt;/a&gt; to calculate the sentiment for each filing.
    * @param accessNumber Access number of a specific report you want to retrieve data from. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<SECSentimentAnalysis> rxFilingsSentiment(String accessNumber, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.filingsSentiment(accessNumber, authInfo, fut)
        ));
    }
    /**
    * Financial Statements
    * &lt;p&gt;Get standardized balance sheet, income statement and cash flow for global companies going back 30+ years. Data is sourced from original filings most of which made available through &lt;a href&#x3D;\&quot;#filings\&quot;&gt;SEC Filings&lt;/a&gt; and &lt;a href&#x3D;\&quot;#international-filings\&quot;&gt;International Filings&lt;/a&gt; endpoints.&lt;/p&gt;&lt;p&gt;&lt;i&gt;Wondering why our standardized data is different from Bloomberg, Reuters, Factset, S&amp;P or Yahoo Finance ? Check out our &lt;a href&#x3D;\&quot;/faq\&quot;&gt;FAQ page&lt;/a&gt; to learn more&lt;/i&gt;&lt;/p&gt;
    * @param symbol Symbol of the company: AAPL. (required)
    * @param statement Statement can take 1 of these values &lt;code&gt;bs, ic, cf&lt;/code&gt; for Balance Sheet, Income Statement, Cash Flow respectively. (required)
    * @param freq Frequency can take 1 of these values &lt;code&gt;annual, quarterly, ttm, ytd&lt;/code&gt;.  TTM (Trailing Twelve Months) option is available for Income Statement and Cash Flow. YTD (Year To Date) option is only available for Cash Flow. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void financials(String symbol, String statement, String freq, Handler<AsyncResult<FinancialStatements>> resultHandler) {
        delegate.financials(symbol, statement, freq, resultHandler);
    }

    /**
    * Financial Statements
    * &lt;p&gt;Get standardized balance sheet, income statement and cash flow for global companies going back 30+ years. Data is sourced from original filings most of which made available through &lt;a href&#x3D;\&quot;#filings\&quot;&gt;SEC Filings&lt;/a&gt; and &lt;a href&#x3D;\&quot;#international-filings\&quot;&gt;International Filings&lt;/a&gt; endpoints.&lt;/p&gt;&lt;p&gt;&lt;i&gt;Wondering why our standardized data is different from Bloomberg, Reuters, Factset, S&amp;P or Yahoo Finance ? Check out our &lt;a href&#x3D;\&quot;/faq\&quot;&gt;FAQ page&lt;/a&gt; to learn more&lt;/i&gt;&lt;/p&gt;
    * @param symbol Symbol of the company: AAPL. (required)
    * @param statement Statement can take 1 of these values &lt;code&gt;bs, ic, cf&lt;/code&gt; for Balance Sheet, Income Statement, Cash Flow respectively. (required)
    * @param freq Frequency can take 1 of these values &lt;code&gt;annual, quarterly, ttm, ytd&lt;/code&gt;.  TTM (Trailing Twelve Months) option is available for Income Statement and Cash Flow. YTD (Year To Date) option is only available for Cash Flow. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void financials(String symbol, String statement, String freq, ApiClient.AuthInfo authInfo, Handler<AsyncResult<FinancialStatements>> resultHandler) {
        delegate.financials(symbol, statement, freq, authInfo, resultHandler);
    }

    /**
    * Financial Statements
    * &lt;p&gt;Get standardized balance sheet, income statement and cash flow for global companies going back 30+ years. Data is sourced from original filings most of which made available through &lt;a href&#x3D;\&quot;#filings\&quot;&gt;SEC Filings&lt;/a&gt; and &lt;a href&#x3D;\&quot;#international-filings\&quot;&gt;International Filings&lt;/a&gt; endpoints.&lt;/p&gt;&lt;p&gt;&lt;i&gt;Wondering why our standardized data is different from Bloomberg, Reuters, Factset, S&amp;P or Yahoo Finance ? Check out our &lt;a href&#x3D;\&quot;/faq\&quot;&gt;FAQ page&lt;/a&gt; to learn more&lt;/i&gt;&lt;/p&gt;
    * @param symbol Symbol of the company: AAPL. (required)
    * @param statement Statement can take 1 of these values &lt;code&gt;bs, ic, cf&lt;/code&gt; for Balance Sheet, Income Statement, Cash Flow respectively. (required)
    * @param freq Frequency can take 1 of these values &lt;code&gt;annual, quarterly, ttm, ytd&lt;/code&gt;.  TTM (Trailing Twelve Months) option is available for Income Statement and Cash Flow. YTD (Year To Date) option is only available for Cash Flow. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<FinancialStatements> rxFinancials(String symbol, String statement, String freq) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.financials(symbol, statement, freq, fut)
        ));
    }

    /**
    * Financial Statements
    * &lt;p&gt;Get standardized balance sheet, income statement and cash flow for global companies going back 30+ years. Data is sourced from original filings most of which made available through &lt;a href&#x3D;\&quot;#filings\&quot;&gt;SEC Filings&lt;/a&gt; and &lt;a href&#x3D;\&quot;#international-filings\&quot;&gt;International Filings&lt;/a&gt; endpoints.&lt;/p&gt;&lt;p&gt;&lt;i&gt;Wondering why our standardized data is different from Bloomberg, Reuters, Factset, S&amp;P or Yahoo Finance ? Check out our &lt;a href&#x3D;\&quot;/faq\&quot;&gt;FAQ page&lt;/a&gt; to learn more&lt;/i&gt;&lt;/p&gt;
    * @param symbol Symbol of the company: AAPL. (required)
    * @param statement Statement can take 1 of these values &lt;code&gt;bs, ic, cf&lt;/code&gt; for Balance Sheet, Income Statement, Cash Flow respectively. (required)
    * @param freq Frequency can take 1 of these values &lt;code&gt;annual, quarterly, ttm, ytd&lt;/code&gt;.  TTM (Trailing Twelve Months) option is available for Income Statement and Cash Flow. YTD (Year To Date) option is only available for Cash Flow. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<FinancialStatements> rxFinancials(String symbol, String statement, String freq, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.financials(symbol, statement, freq, authInfo, fut)
        ));
    }
    /**
    * Financials As Reported
    * Get financials as reported. This data is available for bulk download on &lt;a href&#x3D;\&quot;https://www.kaggle.com/finnhub/reported-financials\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Kaggle SEC Financials database&lt;/a&gt;.
    * @param symbol Symbol. (optional)
    * @param cik CIK. (optional)
    * @param accessNumber Access number of a specific report you want to retrieve financials from. (optional)
    * @param freq Frequency. Can be either &lt;code&gt;annual&lt;/code&gt; or &lt;code&gt;quarterly&lt;/code&gt;. Default to &lt;code&gt;annual&lt;/code&gt;. (optional)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for endDate. (optional)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for endDate. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void financialsReported(String symbol, String cik, String accessNumber, String freq, LocalDate from, LocalDate to, Handler<AsyncResult<FinancialsAsReported>> resultHandler) {
        delegate.financialsReported(symbol, cik, accessNumber, freq, from, to, resultHandler);
    }

    /**
    * Financials As Reported
    * Get financials as reported. This data is available for bulk download on &lt;a href&#x3D;\&quot;https://www.kaggle.com/finnhub/reported-financials\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Kaggle SEC Financials database&lt;/a&gt;.
    * @param symbol Symbol. (optional)
    * @param cik CIK. (optional)
    * @param accessNumber Access number of a specific report you want to retrieve financials from. (optional)
    * @param freq Frequency. Can be either &lt;code&gt;annual&lt;/code&gt; or &lt;code&gt;quarterly&lt;/code&gt;. Default to &lt;code&gt;annual&lt;/code&gt;. (optional)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for endDate. (optional)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for endDate. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void financialsReported(String symbol, String cik, String accessNumber, String freq, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<FinancialsAsReported>> resultHandler) {
        delegate.financialsReported(symbol, cik, accessNumber, freq, from, to, authInfo, resultHandler);
    }

    /**
    * Financials As Reported
    * Get financials as reported. This data is available for bulk download on &lt;a href&#x3D;\&quot;https://www.kaggle.com/finnhub/reported-financials\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Kaggle SEC Financials database&lt;/a&gt;.
    * @param symbol Symbol. (optional)
    * @param cik CIK. (optional)
    * @param accessNumber Access number of a specific report you want to retrieve financials from. (optional)
    * @param freq Frequency. Can be either &lt;code&gt;annual&lt;/code&gt; or &lt;code&gt;quarterly&lt;/code&gt;. Default to &lt;code&gt;annual&lt;/code&gt;. (optional)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for endDate. (optional)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for endDate. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<FinancialsAsReported> rxFinancialsReported(String symbol, String cik, String accessNumber, String freq, LocalDate from, LocalDate to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.financialsReported(symbol, cik, accessNumber, freq, from, to, fut)
        ));
    }

    /**
    * Financials As Reported
    * Get financials as reported. This data is available for bulk download on &lt;a href&#x3D;\&quot;https://www.kaggle.com/finnhub/reported-financials\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Kaggle SEC Financials database&lt;/a&gt;.
    * @param symbol Symbol. (optional)
    * @param cik CIK. (optional)
    * @param accessNumber Access number of a specific report you want to retrieve financials from. (optional)
    * @param freq Frequency. Can be either &lt;code&gt;annual&lt;/code&gt; or &lt;code&gt;quarterly&lt;/code&gt;. Default to &lt;code&gt;annual&lt;/code&gt;. (optional)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for endDate. (optional)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for endDate. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<FinancialsAsReported> rxFinancialsReported(String symbol, String cik, String accessNumber, String freq, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.financialsReported(symbol, cik, accessNumber, freq, from, to, authInfo, fut)
        ));
    }
    /**
    * Forex Candles
    * Get candlestick data for forex symbols.
    * @param symbol Use symbol returned in &lt;code&gt;/forex/symbol&lt;/code&gt; endpoint for this field. (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param from UNIX timestamp. Interval initial value. (required)
    * @param to UNIX timestamp. Interval end value. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void forexCandles(String symbol, String resolution, Long from, Long to, Handler<AsyncResult<ForexCandles>> resultHandler) {
        delegate.forexCandles(symbol, resolution, from, to, resultHandler);
    }

    /**
    * Forex Candles
    * Get candlestick data for forex symbols.
    * @param symbol Use symbol returned in &lt;code&gt;/forex/symbol&lt;/code&gt; endpoint for this field. (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param from UNIX timestamp. Interval initial value. (required)
    * @param to UNIX timestamp. Interval end value. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void forexCandles(String symbol, String resolution, Long from, Long to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<ForexCandles>> resultHandler) {
        delegate.forexCandles(symbol, resolution, from, to, authInfo, resultHandler);
    }

    /**
    * Forex Candles
    * Get candlestick data for forex symbols.
    * @param symbol Use symbol returned in &lt;code&gt;/forex/symbol&lt;/code&gt; endpoint for this field. (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param from UNIX timestamp. Interval initial value. (required)
    * @param to UNIX timestamp. Interval end value. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<ForexCandles> rxForexCandles(String symbol, String resolution, Long from, Long to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.forexCandles(symbol, resolution, from, to, fut)
        ));
    }

    /**
    * Forex Candles
    * Get candlestick data for forex symbols.
    * @param symbol Use symbol returned in &lt;code&gt;/forex/symbol&lt;/code&gt; endpoint for this field. (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param from UNIX timestamp. Interval initial value. (required)
    * @param to UNIX timestamp. Interval end value. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<ForexCandles> rxForexCandles(String symbol, String resolution, Long from, Long to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.forexCandles(symbol, resolution, from, to, authInfo, fut)
        ));
    }
    /**
    * Forex Exchanges
    * List supported forex exchanges
    * @param resultHandler Asynchronous result handler
    */
    public void forexExchanges(Handler<AsyncResult<List<String>>> resultHandler) {
        delegate.forexExchanges(resultHandler);
    }

    /**
    * Forex Exchanges
    * List supported forex exchanges
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void forexExchanges(ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<String>>> resultHandler) {
        delegate.forexExchanges(authInfo, resultHandler);
    }

    /**
    * Forex Exchanges
    * List supported forex exchanges
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<String>> rxForexExchanges() {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.forexExchanges(fut)
        ));
    }

    /**
    * Forex Exchanges
    * List supported forex exchanges
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<String>> rxForexExchanges(ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.forexExchanges(authInfo, fut)
        ));
    }
    /**
    * Forex rates
    * Get rates for all forex pairs. Ideal for currency conversion
    * @param base Base currency. Default to EUR. (optional)
    * @param date Date. Leave blank to get the latest data. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void forexRates(String base, String date, Handler<AsyncResult<Forexrates>> resultHandler) {
        delegate.forexRates(base, date, resultHandler);
    }

    /**
    * Forex rates
    * Get rates for all forex pairs. Ideal for currency conversion
    * @param base Base currency. Default to EUR. (optional)
    * @param date Date. Leave blank to get the latest data. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void forexRates(String base, String date, ApiClient.AuthInfo authInfo, Handler<AsyncResult<Forexrates>> resultHandler) {
        delegate.forexRates(base, date, authInfo, resultHandler);
    }

    /**
    * Forex rates
    * Get rates for all forex pairs. Ideal for currency conversion
    * @param base Base currency. Default to EUR. (optional)
    * @param date Date. Leave blank to get the latest data. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<Forexrates> rxForexRates(String base, String date) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.forexRates(base, date, fut)
        ));
    }

    /**
    * Forex rates
    * Get rates for all forex pairs. Ideal for currency conversion
    * @param base Base currency. Default to EUR. (optional)
    * @param date Date. Leave blank to get the latest data. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<Forexrates> rxForexRates(String base, String date, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.forexRates(base, date, authInfo, fut)
        ));
    }
    /**
    * Forex Symbol
    * List supported forex symbols.
    * @param exchange Exchange you want to get the list of symbols from. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void forexSymbols(String exchange, Handler<AsyncResult<List<ForexSymbol>>> resultHandler) {
        delegate.forexSymbols(exchange, resultHandler);
    }

    /**
    * Forex Symbol
    * List supported forex symbols.
    * @param exchange Exchange you want to get the list of symbols from. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void forexSymbols(String exchange, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<ForexSymbol>>> resultHandler) {
        delegate.forexSymbols(exchange, authInfo, resultHandler);
    }

    /**
    * Forex Symbol
    * List supported forex symbols.
    * @param exchange Exchange you want to get the list of symbols from. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<ForexSymbol>> rxForexSymbols(String exchange) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.forexSymbols(exchange, fut)
        ));
    }

    /**
    * Forex Symbol
    * List supported forex symbols.
    * @param exchange Exchange you want to get the list of symbols from. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<ForexSymbol>> rxForexSymbols(String exchange, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.forexSymbols(exchange, authInfo, fut)
        ));
    }
    /**
    * Fund Ownership
    * Get a full list fund and institutional investors of a company in descending order of the number of shares held. Data is sourced from &lt;code&gt;13F form&lt;/code&gt;, &lt;code&gt;Schedule 13D&lt;/code&gt; and &lt;code&gt;13G&lt;/code&gt; for US market, &lt;code&gt;UK Share Register&lt;/code&gt; for UK market, &lt;code&gt;SEDI&lt;/code&gt; for Canadian market and equivalent filings for other international markets.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param limit Limit number of results. Leave empty to get the full list. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void fundOwnership(String symbol, Long limit, Handler<AsyncResult<FundOwnership>> resultHandler) {
        delegate.fundOwnership(symbol, limit, resultHandler);
    }

    /**
    * Fund Ownership
    * Get a full list fund and institutional investors of a company in descending order of the number of shares held. Data is sourced from &lt;code&gt;13F form&lt;/code&gt;, &lt;code&gt;Schedule 13D&lt;/code&gt; and &lt;code&gt;13G&lt;/code&gt; for US market, &lt;code&gt;UK Share Register&lt;/code&gt; for UK market, &lt;code&gt;SEDI&lt;/code&gt; for Canadian market and equivalent filings for other international markets.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param limit Limit number of results. Leave empty to get the full list. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void fundOwnership(String symbol, Long limit, ApiClient.AuthInfo authInfo, Handler<AsyncResult<FundOwnership>> resultHandler) {
        delegate.fundOwnership(symbol, limit, authInfo, resultHandler);
    }

    /**
    * Fund Ownership
    * Get a full list fund and institutional investors of a company in descending order of the number of shares held. Data is sourced from &lt;code&gt;13F form&lt;/code&gt;, &lt;code&gt;Schedule 13D&lt;/code&gt; and &lt;code&gt;13G&lt;/code&gt; for US market, &lt;code&gt;UK Share Register&lt;/code&gt; for UK market, &lt;code&gt;SEDI&lt;/code&gt; for Canadian market and equivalent filings for other international markets.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param limit Limit number of results. Leave empty to get the full list. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<FundOwnership> rxFundOwnership(String symbol, Long limit) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.fundOwnership(symbol, limit, fut)
        ));
    }

    /**
    * Fund Ownership
    * Get a full list fund and institutional investors of a company in descending order of the number of shares held. Data is sourced from &lt;code&gt;13F form&lt;/code&gt;, &lt;code&gt;Schedule 13D&lt;/code&gt; and &lt;code&gt;13G&lt;/code&gt; for US market, &lt;code&gt;UK Share Register&lt;/code&gt; for UK market, &lt;code&gt;SEDI&lt;/code&gt; for Canadian market and equivalent filings for other international markets.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param limit Limit number of results. Leave empty to get the full list. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<FundOwnership> rxFundOwnership(String symbol, Long limit, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.fundOwnership(symbol, limit, authInfo, fut)
        ));
    }
    /**
    * Download Filings
    * &lt;p&gt;Download filings using document ids.&lt;/p&gt;
    * @param documentId Document&#39;s id. Note that this is different from filingId as 1 filing can contain multiple documents. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void globalFilingsDownload(String documentId, Handler<AsyncResult<Void>> resultHandler) {
        delegate.globalFilingsDownload(documentId, resultHandler);
    }

    /**
    * Download Filings
    * &lt;p&gt;Download filings using document ids.&lt;/p&gt;
    * @param documentId Document&#39;s id. Note that this is different from filingId as 1 filing can contain multiple documents. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void globalFilingsDownload(String documentId, ApiClient.AuthInfo authInfo, Handler<AsyncResult<Void>> resultHandler) {
        delegate.globalFilingsDownload(documentId, authInfo, resultHandler);
    }

    /**
    * Download Filings
    * &lt;p&gt;Download filings using document ids.&lt;/p&gt;
    * @param documentId Document&#39;s id. Note that this is different from filingId as 1 filing can contain multiple documents. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<Void> rxGlobalFilingsDownload(String documentId) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.globalFilingsDownload(documentId, fut)
        ));
    }

    /**
    * Download Filings
    * &lt;p&gt;Download filings using document ids.&lt;/p&gt;
    * @param documentId Document&#39;s id. Note that this is different from filingId as 1 filing can contain multiple documents. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<Void> rxGlobalFilingsDownload(String documentId, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.globalFilingsDownload(documentId, authInfo, fut)
        ));
    }
    /**
    * Global Filings Search
    * &lt;p&gt;Search for best-matched filings across global companies&#39; filings, transcripts and press releases. You can filter by anything from symbol, ISIN to form type, and document sources.&lt;/p&gt;&lt;p&gt;This endpoint will return a list of documents that match your search criteria. If you would like to get the excerpts as well, please set &lt;code&gt;highlighted&lt;/code&gt; to &lt;code&gt;true&lt;/code&gt;. Once you have the list of documents, you can get a list of excerpts and positions to highlight the document using the &lt;code&gt;/search-in-filing&lt;/code&gt; endpoint&lt;/p&gt;
    * @param search Search body (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void globalFilingsSearch(SearchBody search, Handler<AsyncResult<SearchResponse>> resultHandler) {
        delegate.globalFilingsSearch(search, resultHandler);
    }

    /**
    * Global Filings Search
    * &lt;p&gt;Search for best-matched filings across global companies&#39; filings, transcripts and press releases. You can filter by anything from symbol, ISIN to form type, and document sources.&lt;/p&gt;&lt;p&gt;This endpoint will return a list of documents that match your search criteria. If you would like to get the excerpts as well, please set &lt;code&gt;highlighted&lt;/code&gt; to &lt;code&gt;true&lt;/code&gt;. Once you have the list of documents, you can get a list of excerpts and positions to highlight the document using the &lt;code&gt;/search-in-filing&lt;/code&gt; endpoint&lt;/p&gt;
    * @param search Search body (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void globalFilingsSearch(SearchBody search, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SearchResponse>> resultHandler) {
        delegate.globalFilingsSearch(search, authInfo, resultHandler);
    }

    /**
    * Global Filings Search
    * &lt;p&gt;Search for best-matched filings across global companies&#39; filings, transcripts and press releases. You can filter by anything from symbol, ISIN to form type, and document sources.&lt;/p&gt;&lt;p&gt;This endpoint will return a list of documents that match your search criteria. If you would like to get the excerpts as well, please set &lt;code&gt;highlighted&lt;/code&gt; to &lt;code&gt;true&lt;/code&gt;. Once you have the list of documents, you can get a list of excerpts and positions to highlight the document using the &lt;code&gt;/search-in-filing&lt;/code&gt; endpoint&lt;/p&gt;
    * @param search Search body (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<SearchResponse> rxGlobalFilingsSearch(SearchBody search) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.globalFilingsSearch(search, fut)
        ));
    }

    /**
    * Global Filings Search
    * &lt;p&gt;Search for best-matched filings across global companies&#39; filings, transcripts and press releases. You can filter by anything from symbol, ISIN to form type, and document sources.&lt;/p&gt;&lt;p&gt;This endpoint will return a list of documents that match your search criteria. If you would like to get the excerpts as well, please set &lt;code&gt;highlighted&lt;/code&gt; to &lt;code&gt;true&lt;/code&gt;. Once you have the list of documents, you can get a list of excerpts and positions to highlight the document using the &lt;code&gt;/search-in-filing&lt;/code&gt; endpoint&lt;/p&gt;
    * @param search Search body (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<SearchResponse> rxGlobalFilingsSearch(SearchBody search, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.globalFilingsSearch(search, authInfo, fut)
        ));
    }
    /**
    * Search Filter
    * &lt;p&gt;Get available values for each filter in search body.&lt;/p&gt;
    * @param field Field to get available filters. Available filters are \&quot;countries\&quot;, \&quot;exchanges\&quot;, \&quot;exhibits\&quot;, \&quot;forms\&quot;, \&quot;gics\&quot;, \&quot;naics\&quot;, \&quot;caps\&quot;, \&quot;acts\&quot;, and \&quot;sort\&quot;. (required)
    * @param source Get available forms for each source. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void globalFilingsSearchFilter(String field, String source, Handler<AsyncResult<SearchFilter>> resultHandler) {
        delegate.globalFilingsSearchFilter(field, source, resultHandler);
    }

    /**
    * Search Filter
    * &lt;p&gt;Get available values for each filter in search body.&lt;/p&gt;
    * @param field Field to get available filters. Available filters are \&quot;countries\&quot;, \&quot;exchanges\&quot;, \&quot;exhibits\&quot;, \&quot;forms\&quot;, \&quot;gics\&quot;, \&quot;naics\&quot;, \&quot;caps\&quot;, \&quot;acts\&quot;, and \&quot;sort\&quot;. (required)
    * @param source Get available forms for each source. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void globalFilingsSearchFilter(String field, String source, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SearchFilter>> resultHandler) {
        delegate.globalFilingsSearchFilter(field, source, authInfo, resultHandler);
    }

    /**
    * Search Filter
    * &lt;p&gt;Get available values for each filter in search body.&lt;/p&gt;
    * @param field Field to get available filters. Available filters are \&quot;countries\&quot;, \&quot;exchanges\&quot;, \&quot;exhibits\&quot;, \&quot;forms\&quot;, \&quot;gics\&quot;, \&quot;naics\&quot;, \&quot;caps\&quot;, \&quot;acts\&quot;, and \&quot;sort\&quot;. (required)
    * @param source Get available forms for each source. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<SearchFilter> rxGlobalFilingsSearchFilter(String field, String source) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.globalFilingsSearchFilter(field, source, fut)
        ));
    }

    /**
    * Search Filter
    * &lt;p&gt;Get available values for each filter in search body.&lt;/p&gt;
    * @param field Field to get available filters. Available filters are \&quot;countries\&quot;, \&quot;exchanges\&quot;, \&quot;exhibits\&quot;, \&quot;forms\&quot;, \&quot;gics\&quot;, \&quot;naics\&quot;, \&quot;caps\&quot;, \&quot;acts\&quot;, and \&quot;sort\&quot;. (required)
    * @param source Get available forms for each source. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<SearchFilter> rxGlobalFilingsSearchFilter(String field, String source, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.globalFilingsSearchFilter(field, source, authInfo, fut)
        ));
    }
    /**
    * Historical Employee Count
    * Get historical employee count for global companies.
    * @param symbol Company symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void historicalEmployeeCount(String symbol, LocalDate from, LocalDate to, Handler<AsyncResult<HistoricalEmployeeCount>> resultHandler) {
        delegate.historicalEmployeeCount(symbol, from, to, resultHandler);
    }

    /**
    * Historical Employee Count
    * Get historical employee count for global companies.
    * @param symbol Company symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void historicalEmployeeCount(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<HistoricalEmployeeCount>> resultHandler) {
        delegate.historicalEmployeeCount(symbol, from, to, authInfo, resultHandler);
    }

    /**
    * Historical Employee Count
    * Get historical employee count for global companies.
    * @param symbol Company symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<HistoricalEmployeeCount> rxHistoricalEmployeeCount(String symbol, LocalDate from, LocalDate to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.historicalEmployeeCount(symbol, from, to, fut)
        ));
    }

    /**
    * Historical Employee Count
    * Get historical employee count for global companies.
    * @param symbol Company symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<HistoricalEmployeeCount> rxHistoricalEmployeeCount(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.historicalEmployeeCount(symbol, from, to, authInfo, fut)
        ));
    }
    /**
    * Historical Market Cap
    * Get historical market cap data for global companies.
    * @param symbol Company symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void historicalMarketCap(String symbol, LocalDate from, LocalDate to, Handler<AsyncResult<HistoricalMarketCapData>> resultHandler) {
        delegate.historicalMarketCap(symbol, from, to, resultHandler);
    }

    /**
    * Historical Market Cap
    * Get historical market cap data for global companies.
    * @param symbol Company symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void historicalMarketCap(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<HistoricalMarketCapData>> resultHandler) {
        delegate.historicalMarketCap(symbol, from, to, authInfo, resultHandler);
    }

    /**
    * Historical Market Cap
    * Get historical market cap data for global companies.
    * @param symbol Company symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<HistoricalMarketCapData> rxHistoricalMarketCap(String symbol, LocalDate from, LocalDate to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.historicalMarketCap(symbol, from, to, fut)
        ));
    }

    /**
    * Historical Market Cap
    * Get historical market cap data for global companies.
    * @param symbol Company symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<HistoricalMarketCapData> rxHistoricalMarketCap(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.historicalMarketCap(symbol, from, to, authInfo, fut)
        ));
    }
    /**
    * Indices Constituents
    * Get a list of index&#39;s constituents. A list of supported indices for this endpoint can be found &lt;a href&#x3D;\&quot;/api/v1/index/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol symbol (required)
    * @param resultHandler Asynchronous result handler
    */
    public void indicesConstituents(String symbol, Handler<AsyncResult<IndicesConstituents>> resultHandler) {
        delegate.indicesConstituents(symbol, resultHandler);
    }

    /**
    * Indices Constituents
    * Get a list of index&#39;s constituents. A list of supported indices for this endpoint can be found &lt;a href&#x3D;\&quot;/api/v1/index/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol symbol (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void indicesConstituents(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<IndicesConstituents>> resultHandler) {
        delegate.indicesConstituents(symbol, authInfo, resultHandler);
    }

    /**
    * Indices Constituents
    * Get a list of index&#39;s constituents. A list of supported indices for this endpoint can be found &lt;a href&#x3D;\&quot;/api/v1/index/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol symbol (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<IndicesConstituents> rxIndicesConstituents(String symbol) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.indicesConstituents(symbol, fut)
        ));
    }

    /**
    * Indices Constituents
    * Get a list of index&#39;s constituents. A list of supported indices for this endpoint can be found &lt;a href&#x3D;\&quot;/api/v1/index/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol symbol (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<IndicesConstituents> rxIndicesConstituents(String symbol, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.indicesConstituents(symbol, authInfo, fut)
        ));
    }
    /**
    * Indices Historical Constituents
    * Get full history of index&#39;s constituents including symbols and dates of joining and leaving the Index. Currently support &lt;code&gt;^GSPC&lt;/code&gt;, &lt;code&gt;^NDX&lt;/code&gt;, &lt;code&gt;^DJI&lt;/code&gt;
    * @param symbol symbol (required)
    * @param resultHandler Asynchronous result handler
    */
    public void indicesHistoricalConstituents(String symbol, Handler<AsyncResult<IndicesHistoricalConstituents>> resultHandler) {
        delegate.indicesHistoricalConstituents(symbol, resultHandler);
    }

    /**
    * Indices Historical Constituents
    * Get full history of index&#39;s constituents including symbols and dates of joining and leaving the Index. Currently support &lt;code&gt;^GSPC&lt;/code&gt;, &lt;code&gt;^NDX&lt;/code&gt;, &lt;code&gt;^DJI&lt;/code&gt;
    * @param symbol symbol (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void indicesHistoricalConstituents(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<IndicesHistoricalConstituents>> resultHandler) {
        delegate.indicesHistoricalConstituents(symbol, authInfo, resultHandler);
    }

    /**
    * Indices Historical Constituents
    * Get full history of index&#39;s constituents including symbols and dates of joining and leaving the Index. Currently support &lt;code&gt;^GSPC&lt;/code&gt;, &lt;code&gt;^NDX&lt;/code&gt;, &lt;code&gt;^DJI&lt;/code&gt;
    * @param symbol symbol (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<IndicesHistoricalConstituents> rxIndicesHistoricalConstituents(String symbol) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.indicesHistoricalConstituents(symbol, fut)
        ));
    }

    /**
    * Indices Historical Constituents
    * Get full history of index&#39;s constituents including symbols and dates of joining and leaving the Index. Currently support &lt;code&gt;^GSPC&lt;/code&gt;, &lt;code&gt;^NDX&lt;/code&gt;, &lt;code&gt;^DJI&lt;/code&gt;
    * @param symbol symbol (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<IndicesHistoricalConstituents> rxIndicesHistoricalConstituents(String symbol, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.indicesHistoricalConstituents(symbol, authInfo, fut)
        ));
    }
    /**
    * Insider Sentiment
    * Get insider sentiment data for US companies calculated using method discussed &lt;a href&#x3D;\&quot;https://medium.com/@stock-api/finnhub-insiders-sentiment-analysis-cc43f9f64b3a\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. The MSPR ranges from -100 for the most negative to 100 for the most positive which can signal price changes in the coming 30-90 days.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param from From date: 2020-03-15. (required)
    * @param to To date: 2020-03-16. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void insiderSentiment(String symbol, LocalDate from, LocalDate to, Handler<AsyncResult<InsiderSentiments>> resultHandler) {
        delegate.insiderSentiment(symbol, from, to, resultHandler);
    }

    /**
    * Insider Sentiment
    * Get insider sentiment data for US companies calculated using method discussed &lt;a href&#x3D;\&quot;https://medium.com/@stock-api/finnhub-insiders-sentiment-analysis-cc43f9f64b3a\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. The MSPR ranges from -100 for the most negative to 100 for the most positive which can signal price changes in the coming 30-90 days.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param from From date: 2020-03-15. (required)
    * @param to To date: 2020-03-16. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void insiderSentiment(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<InsiderSentiments>> resultHandler) {
        delegate.insiderSentiment(symbol, from, to, authInfo, resultHandler);
    }

    /**
    * Insider Sentiment
    * Get insider sentiment data for US companies calculated using method discussed &lt;a href&#x3D;\&quot;https://medium.com/@stock-api/finnhub-insiders-sentiment-analysis-cc43f9f64b3a\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. The MSPR ranges from -100 for the most negative to 100 for the most positive which can signal price changes in the coming 30-90 days.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param from From date: 2020-03-15. (required)
    * @param to To date: 2020-03-16. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<InsiderSentiments> rxInsiderSentiment(String symbol, LocalDate from, LocalDate to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.insiderSentiment(symbol, from, to, fut)
        ));
    }

    /**
    * Insider Sentiment
    * Get insider sentiment data for US companies calculated using method discussed &lt;a href&#x3D;\&quot;https://medium.com/@stock-api/finnhub-insiders-sentiment-analysis-cc43f9f64b3a\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. The MSPR ranges from -100 for the most negative to 100 for the most positive which can signal price changes in the coming 30-90 days.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param from From date: 2020-03-15. (required)
    * @param to To date: 2020-03-16. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<InsiderSentiments> rxInsiderSentiment(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.insiderSentiment(symbol, from, to, authInfo, fut)
        ));
    }
    /**
    * Insider Transactions
    * Company insider transactions data sourced from &lt;code&gt;Form 3,4,5&lt;/code&gt;, SEDI and relevant companies&#39; filings. This endpoint covers US, UK, Canada, Australia, India, and all major EU markets. Limit to 100 transactions per API call.
    * @param symbol Symbol of the company: AAPL. Leave this param blank to get the latest transactions. (required)
    * @param from From date: 2020-03-15. (optional)
    * @param to To date: 2020-03-16. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void insiderTransactions(String symbol, LocalDate from, LocalDate to, Handler<AsyncResult<InsiderTransactions>> resultHandler) {
        delegate.insiderTransactions(symbol, from, to, resultHandler);
    }

    /**
    * Insider Transactions
    * Company insider transactions data sourced from &lt;code&gt;Form 3,4,5&lt;/code&gt;, SEDI and relevant companies&#39; filings. This endpoint covers US, UK, Canada, Australia, India, and all major EU markets. Limit to 100 transactions per API call.
    * @param symbol Symbol of the company: AAPL. Leave this param blank to get the latest transactions. (required)
    * @param from From date: 2020-03-15. (optional)
    * @param to To date: 2020-03-16. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void insiderTransactions(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<InsiderTransactions>> resultHandler) {
        delegate.insiderTransactions(symbol, from, to, authInfo, resultHandler);
    }

    /**
    * Insider Transactions
    * Company insider transactions data sourced from &lt;code&gt;Form 3,4,5&lt;/code&gt;, SEDI and relevant companies&#39; filings. This endpoint covers US, UK, Canada, Australia, India, and all major EU markets. Limit to 100 transactions per API call.
    * @param symbol Symbol of the company: AAPL. Leave this param blank to get the latest transactions. (required)
    * @param from From date: 2020-03-15. (optional)
    * @param to To date: 2020-03-16. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<InsiderTransactions> rxInsiderTransactions(String symbol, LocalDate from, LocalDate to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.insiderTransactions(symbol, from, to, fut)
        ));
    }

    /**
    * Insider Transactions
    * Company insider transactions data sourced from &lt;code&gt;Form 3,4,5&lt;/code&gt;, SEDI and relevant companies&#39; filings. This endpoint covers US, UK, Canada, Australia, India, and all major EU markets. Limit to 100 transactions per API call.
    * @param symbol Symbol of the company: AAPL. Leave this param blank to get the latest transactions. (required)
    * @param from From date: 2020-03-15. (optional)
    * @param to To date: 2020-03-16. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<InsiderTransactions> rxInsiderTransactions(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.insiderTransactions(symbol, from, to, authInfo, fut)
        ));
    }
    /**
    * Institutional Ownership
    * Get a list institutional investors&#39; positions for a particular stock overtime. Data from 13-F filings. Limit to 1 year of data at a time.
    * @param symbol Filter by symbol. (required)
    * @param cusip Filter by CUSIP. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void institutionalOwnership(String symbol, String cusip, String from, String to, Handler<AsyncResult<InstitutionalOwnership>> resultHandler) {
        delegate.institutionalOwnership(symbol, cusip, from, to, resultHandler);
    }

    /**
    * Institutional Ownership
    * Get a list institutional investors&#39; positions for a particular stock overtime. Data from 13-F filings. Limit to 1 year of data at a time.
    * @param symbol Filter by symbol. (required)
    * @param cusip Filter by CUSIP. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void institutionalOwnership(String symbol, String cusip, String from, String to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<InstitutionalOwnership>> resultHandler) {
        delegate.institutionalOwnership(symbol, cusip, from, to, authInfo, resultHandler);
    }

    /**
    * Institutional Ownership
    * Get a list institutional investors&#39; positions for a particular stock overtime. Data from 13-F filings. Limit to 1 year of data at a time.
    * @param symbol Filter by symbol. (required)
    * @param cusip Filter by CUSIP. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<InstitutionalOwnership> rxInstitutionalOwnership(String symbol, String cusip, String from, String to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.institutionalOwnership(symbol, cusip, from, to, fut)
        ));
    }

    /**
    * Institutional Ownership
    * Get a list institutional investors&#39; positions for a particular stock overtime. Data from 13-F filings. Limit to 1 year of data at a time.
    * @param symbol Filter by symbol. (required)
    * @param cusip Filter by CUSIP. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<InstitutionalOwnership> rxInstitutionalOwnership(String symbol, String cusip, String from, String to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.institutionalOwnership(symbol, cusip, from, to, authInfo, fut)
        ));
    }
    /**
    * Institutional Portfolio
    * Get the holdings/portfolio data of institutional investors from 13-F filings. Limit to 1 year of data at a time. You can get a list of supported CIK &lt;a href&#x3D;\&quot;/api/v1/institutional/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param cik Fund&#39;s CIK. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void institutionalPortfolio(String cik, String from, String to, Handler<AsyncResult<InstitutionalPortfolio>> resultHandler) {
        delegate.institutionalPortfolio(cik, from, to, resultHandler);
    }

    /**
    * Institutional Portfolio
    * Get the holdings/portfolio data of institutional investors from 13-F filings. Limit to 1 year of data at a time. You can get a list of supported CIK &lt;a href&#x3D;\&quot;/api/v1/institutional/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param cik Fund&#39;s CIK. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void institutionalPortfolio(String cik, String from, String to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<InstitutionalPortfolio>> resultHandler) {
        delegate.institutionalPortfolio(cik, from, to, authInfo, resultHandler);
    }

    /**
    * Institutional Portfolio
    * Get the holdings/portfolio data of institutional investors from 13-F filings. Limit to 1 year of data at a time. You can get a list of supported CIK &lt;a href&#x3D;\&quot;/api/v1/institutional/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param cik Fund&#39;s CIK. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<InstitutionalPortfolio> rxInstitutionalPortfolio(String cik, String from, String to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.institutionalPortfolio(cik, from, to, fut)
        ));
    }

    /**
    * Institutional Portfolio
    * Get the holdings/portfolio data of institutional investors from 13-F filings. Limit to 1 year of data at a time. You can get a list of supported CIK &lt;a href&#x3D;\&quot;/api/v1/institutional/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param cik Fund&#39;s CIK. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<InstitutionalPortfolio> rxInstitutionalPortfolio(String cik, String from, String to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.institutionalPortfolio(cik, from, to, authInfo, fut)
        ));
    }
    /**
    * Institutional Profile
    * Get a list of well-known institutional investors. Currently support 60+ profiles.
    * @param cik Filter by CIK. Leave blank to get the full list. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void institutionalProfile(String cik, Handler<AsyncResult<InstitutionalProfile>> resultHandler) {
        delegate.institutionalProfile(cik, resultHandler);
    }

    /**
    * Institutional Profile
    * Get a list of well-known institutional investors. Currently support 60+ profiles.
    * @param cik Filter by CIK. Leave blank to get the full list. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void institutionalProfile(String cik, ApiClient.AuthInfo authInfo, Handler<AsyncResult<InstitutionalProfile>> resultHandler) {
        delegate.institutionalProfile(cik, authInfo, resultHandler);
    }

    /**
    * Institutional Profile
    * Get a list of well-known institutional investors. Currently support 60+ profiles.
    * @param cik Filter by CIK. Leave blank to get the full list. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<InstitutionalProfile> rxInstitutionalProfile(String cik) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.institutionalProfile(cik, fut)
        ));
    }

    /**
    * Institutional Profile
    * Get a list of well-known institutional investors. Currently support 60+ profiles.
    * @param cik Filter by CIK. Leave blank to get the full list. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<InstitutionalProfile> rxInstitutionalProfile(String cik, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.institutionalProfile(cik, authInfo, fut)
        ));
    }
    /**
    * International Filings
    * List filings for international companies. Limit to 500 documents at a time. These are the documents we use to source our fundamental data. Enterprise clients who need access to the full filings for global markets should contact us for the access.
    * @param symbol Symbol. Leave empty to list latest filings. (optional)
    * @param country Filter by country using country&#39;s 2-letter code. (optional)
    * @param from From date: 2023-01-15. (optional)
    * @param to To date: 2023-12-16. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void internationalFilings(String symbol, String country, LocalDate from, LocalDate to, Handler<AsyncResult<List<InternationalFiling>>> resultHandler) {
        delegate.internationalFilings(symbol, country, from, to, resultHandler);
    }

    /**
    * International Filings
    * List filings for international companies. Limit to 500 documents at a time. These are the documents we use to source our fundamental data. Enterprise clients who need access to the full filings for global markets should contact us for the access.
    * @param symbol Symbol. Leave empty to list latest filings. (optional)
    * @param country Filter by country using country&#39;s 2-letter code. (optional)
    * @param from From date: 2023-01-15. (optional)
    * @param to To date: 2023-12-16. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void internationalFilings(String symbol, String country, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<InternationalFiling>>> resultHandler) {
        delegate.internationalFilings(symbol, country, from, to, authInfo, resultHandler);
    }

    /**
    * International Filings
    * List filings for international companies. Limit to 500 documents at a time. These are the documents we use to source our fundamental data. Enterprise clients who need access to the full filings for global markets should contact us for the access.
    * @param symbol Symbol. Leave empty to list latest filings. (optional)
    * @param country Filter by country using country&#39;s 2-letter code. (optional)
    * @param from From date: 2023-01-15. (optional)
    * @param to To date: 2023-12-16. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<InternationalFiling>> rxInternationalFilings(String symbol, String country, LocalDate from, LocalDate to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.internationalFilings(symbol, country, from, to, fut)
        ));
    }

    /**
    * International Filings
    * List filings for international companies. Limit to 500 documents at a time. These are the documents we use to source our fundamental data. Enterprise clients who need access to the full filings for global markets should contact us for the access.
    * @param symbol Symbol. Leave empty to list latest filings. (optional)
    * @param country Filter by country using country&#39;s 2-letter code. (optional)
    * @param from From date: 2023-01-15. (optional)
    * @param to To date: 2023-12-16. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<InternationalFiling>> rxInternationalFilings(String symbol, String country, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.internationalFilings(symbol, country, from, to, authInfo, fut)
        ));
    }
    /**
    * Investment Themes (Thematic Investing)
    * &lt;p&gt;Thematic investing involves creating a portfolio (or portion of a portfolio) by gathering together a collection of companies involved in certain areas that you predict will generate above-market returns over the long term. Themes can be based on a concept such as ageing populations or a sub-sector such as robotics, and drones. Thematic investing focuses on predicted long-term trends rather than specific companies or sectors, enabling investors to access structural, one-off shifts that can change an entire industry.&lt;/p&gt;&lt;p&gt;This endpoint will help you get portfolios of different investment themes that are changing our life and are the way of the future.&lt;/p&gt;&lt;p&gt;A full list of themes supported can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ULj9xDh4iPoQj279M084adZ2_S852ttRthKKJ7madYc/edit?usp&#x3D;sharing\&quot;&gt;here&lt;/a&gt;. The theme coverage and portfolios are updated bi-weekly by our analysts. Our approach excludes penny, super-small cap and illiquid stocks.&lt;/p&gt;
    * @param theme Investment theme. A full list of themes supported can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ULj9xDh4iPoQj279M084adZ2_S852ttRthKKJ7madYc/edit?usp&#x3D;sharing\&quot;&gt;here&lt;/a&gt;. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void investmentThemes(String theme, Handler<AsyncResult<InvestmentThemes>> resultHandler) {
        delegate.investmentThemes(theme, resultHandler);
    }

    /**
    * Investment Themes (Thematic Investing)
    * &lt;p&gt;Thematic investing involves creating a portfolio (or portion of a portfolio) by gathering together a collection of companies involved in certain areas that you predict will generate above-market returns over the long term. Themes can be based on a concept such as ageing populations or a sub-sector such as robotics, and drones. Thematic investing focuses on predicted long-term trends rather than specific companies or sectors, enabling investors to access structural, one-off shifts that can change an entire industry.&lt;/p&gt;&lt;p&gt;This endpoint will help you get portfolios of different investment themes that are changing our life and are the way of the future.&lt;/p&gt;&lt;p&gt;A full list of themes supported can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ULj9xDh4iPoQj279M084adZ2_S852ttRthKKJ7madYc/edit?usp&#x3D;sharing\&quot;&gt;here&lt;/a&gt;. The theme coverage and portfolios are updated bi-weekly by our analysts. Our approach excludes penny, super-small cap and illiquid stocks.&lt;/p&gt;
    * @param theme Investment theme. A full list of themes supported can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ULj9xDh4iPoQj279M084adZ2_S852ttRthKKJ7madYc/edit?usp&#x3D;sharing\&quot;&gt;here&lt;/a&gt;. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void investmentThemes(String theme, ApiClient.AuthInfo authInfo, Handler<AsyncResult<InvestmentThemes>> resultHandler) {
        delegate.investmentThemes(theme, authInfo, resultHandler);
    }

    /**
    * Investment Themes (Thematic Investing)
    * &lt;p&gt;Thematic investing involves creating a portfolio (or portion of a portfolio) by gathering together a collection of companies involved in certain areas that you predict will generate above-market returns over the long term. Themes can be based on a concept such as ageing populations or a sub-sector such as robotics, and drones. Thematic investing focuses on predicted long-term trends rather than specific companies or sectors, enabling investors to access structural, one-off shifts that can change an entire industry.&lt;/p&gt;&lt;p&gt;This endpoint will help you get portfolios of different investment themes that are changing our life and are the way of the future.&lt;/p&gt;&lt;p&gt;A full list of themes supported can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ULj9xDh4iPoQj279M084adZ2_S852ttRthKKJ7madYc/edit?usp&#x3D;sharing\&quot;&gt;here&lt;/a&gt;. The theme coverage and portfolios are updated bi-weekly by our analysts. Our approach excludes penny, super-small cap and illiquid stocks.&lt;/p&gt;
    * @param theme Investment theme. A full list of themes supported can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ULj9xDh4iPoQj279M084adZ2_S852ttRthKKJ7madYc/edit?usp&#x3D;sharing\&quot;&gt;here&lt;/a&gt;. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<InvestmentThemes> rxInvestmentThemes(String theme) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.investmentThemes(theme, fut)
        ));
    }

    /**
    * Investment Themes (Thematic Investing)
    * &lt;p&gt;Thematic investing involves creating a portfolio (or portion of a portfolio) by gathering together a collection of companies involved in certain areas that you predict will generate above-market returns over the long term. Themes can be based on a concept such as ageing populations or a sub-sector such as robotics, and drones. Thematic investing focuses on predicted long-term trends rather than specific companies or sectors, enabling investors to access structural, one-off shifts that can change an entire industry.&lt;/p&gt;&lt;p&gt;This endpoint will help you get portfolios of different investment themes that are changing our life and are the way of the future.&lt;/p&gt;&lt;p&gt;A full list of themes supported can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ULj9xDh4iPoQj279M084adZ2_S852ttRthKKJ7madYc/edit?usp&#x3D;sharing\&quot;&gt;here&lt;/a&gt;. The theme coverage and portfolios are updated bi-weekly by our analysts. Our approach excludes penny, super-small cap and illiquid stocks.&lt;/p&gt;
    * @param theme Investment theme. A full list of themes supported can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ULj9xDh4iPoQj279M084adZ2_S852ttRthKKJ7madYc/edit?usp&#x3D;sharing\&quot;&gt;here&lt;/a&gt;. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<InvestmentThemes> rxInvestmentThemes(String theme, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.investmentThemes(theme, authInfo, fut)
        ));
    }
    /**
    * IPO Calendar
    * Get recent and upcoming IPO.
    * @param from From date: 2020-03-15. (required)
    * @param to To date: 2020-03-16. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void ipoCalendar(LocalDate from, LocalDate to, Handler<AsyncResult<IPOCalendar>> resultHandler) {
        delegate.ipoCalendar(from, to, resultHandler);
    }

    /**
    * IPO Calendar
    * Get recent and upcoming IPO.
    * @param from From date: 2020-03-15. (required)
    * @param to To date: 2020-03-16. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void ipoCalendar(LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<IPOCalendar>> resultHandler) {
        delegate.ipoCalendar(from, to, authInfo, resultHandler);
    }

    /**
    * IPO Calendar
    * Get recent and upcoming IPO.
    * @param from From date: 2020-03-15. (required)
    * @param to To date: 2020-03-16. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<IPOCalendar> rxIpoCalendar(LocalDate from, LocalDate to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.ipoCalendar(from, to, fut)
        ));
    }

    /**
    * IPO Calendar
    * Get recent and upcoming IPO.
    * @param from From date: 2020-03-15. (required)
    * @param to To date: 2020-03-16. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<IPOCalendar> rxIpoCalendar(LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.ipoCalendar(from, to, authInfo, fut)
        ));
    }
    /**
    * ISIN Change
    * Get a list of ISIN changes for EU-listed securities. Limit to 2000 events at a time.
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void isinChange(String from, String to, Handler<AsyncResult<IsinChange>> resultHandler) {
        delegate.isinChange(from, to, resultHandler);
    }

    /**
    * ISIN Change
    * Get a list of ISIN changes for EU-listed securities. Limit to 2000 events at a time.
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void isinChange(String from, String to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<IsinChange>> resultHandler) {
        delegate.isinChange(from, to, authInfo, resultHandler);
    }

    /**
    * ISIN Change
    * Get a list of ISIN changes for EU-listed securities. Limit to 2000 events at a time.
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<IsinChange> rxIsinChange(String from, String to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.isinChange(from, to, fut)
        ));
    }

    /**
    * ISIN Change
    * Get a list of ISIN changes for EU-listed securities. Limit to 2000 events at a time.
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<IsinChange> rxIsinChange(String from, String to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.isinChange(from, to, authInfo, fut)
        ));
    }
    /**
    * Market Holiday
    * Get a list of holidays for global exchanges.
    * @param exchange Exchange code. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void marketHoliday(String exchange, Handler<AsyncResult<MarketHoliday>> resultHandler) {
        delegate.marketHoliday(exchange, resultHandler);
    }

    /**
    * Market Holiday
    * Get a list of holidays for global exchanges.
    * @param exchange Exchange code. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void marketHoliday(String exchange, ApiClient.AuthInfo authInfo, Handler<AsyncResult<MarketHoliday>> resultHandler) {
        delegate.marketHoliday(exchange, authInfo, resultHandler);
    }

    /**
    * Market Holiday
    * Get a list of holidays for global exchanges.
    * @param exchange Exchange code. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<MarketHoliday> rxMarketHoliday(String exchange) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.marketHoliday(exchange, fut)
        ));
    }

    /**
    * Market Holiday
    * Get a list of holidays for global exchanges.
    * @param exchange Exchange code. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<MarketHoliday> rxMarketHoliday(String exchange, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.marketHoliday(exchange, authInfo, fut)
        ));
    }
    /**
    * Market News
    * Get latest market news.
    * @param category This parameter can be 1 of the following values &lt;code&gt;general, forex, crypto, merger&lt;/code&gt;. (required)
    * @param minId Use this field to get only news after this ID. Default to 0 (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void marketNews(String category, Long minId, Handler<AsyncResult<List<MarketNews>>> resultHandler) {
        delegate.marketNews(category, minId, resultHandler);
    }

    /**
    * Market News
    * Get latest market news.
    * @param category This parameter can be 1 of the following values &lt;code&gt;general, forex, crypto, merger&lt;/code&gt;. (required)
    * @param minId Use this field to get only news after this ID. Default to 0 (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void marketNews(String category, Long minId, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<MarketNews>>> resultHandler) {
        delegate.marketNews(category, minId, authInfo, resultHandler);
    }

    /**
    * Market News
    * Get latest market news.
    * @param category This parameter can be 1 of the following values &lt;code&gt;general, forex, crypto, merger&lt;/code&gt;. (required)
    * @param minId Use this field to get only news after this ID. Default to 0 (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<MarketNews>> rxMarketNews(String category, Long minId) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.marketNews(category, minId, fut)
        ));
    }

    /**
    * Market News
    * Get latest market news.
    * @param category This parameter can be 1 of the following values &lt;code&gt;general, forex, crypto, merger&lt;/code&gt;. (required)
    * @param minId Use this field to get only news after this ID. Default to 0 (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<MarketNews>> rxMarketNews(String category, Long minId, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.marketNews(category, minId, authInfo, fut)
        ));
    }
    /**
    * Market Status
    * Get current market status for global exchanges (whether exchanges are open or close).
    * @param exchange Exchange code. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void marketStatus(String exchange, Handler<AsyncResult<MarketStatus>> resultHandler) {
        delegate.marketStatus(exchange, resultHandler);
    }

    /**
    * Market Status
    * Get current market status for global exchanges (whether exchanges are open or close).
    * @param exchange Exchange code. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void marketStatus(String exchange, ApiClient.AuthInfo authInfo, Handler<AsyncResult<MarketStatus>> resultHandler) {
        delegate.marketStatus(exchange, authInfo, resultHandler);
    }

    /**
    * Market Status
    * Get current market status for global exchanges (whether exchanges are open or close).
    * @param exchange Exchange code. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<MarketStatus> rxMarketStatus(String exchange) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.marketStatus(exchange, fut)
        ));
    }

    /**
    * Market Status
    * Get current market status for global exchanges (whether exchanges are open or close).
    * @param exchange Exchange code. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<MarketStatus> rxMarketStatus(String exchange, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.marketStatus(exchange, authInfo, fut)
        ));
    }
    /**
    * Mutual Funds Country Exposure
    * Get Mutual Funds country exposure data.
    * @param symbol Symbol. (optional)
    * @param isin Fund&#39;s isin. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void mutualFundCountryExposure(String symbol, String isin, Handler<AsyncResult<MutualFundCountryExposure>> resultHandler) {
        delegate.mutualFundCountryExposure(symbol, isin, resultHandler);
    }

    /**
    * Mutual Funds Country Exposure
    * Get Mutual Funds country exposure data.
    * @param symbol Symbol. (optional)
    * @param isin Fund&#39;s isin. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void mutualFundCountryExposure(String symbol, String isin, ApiClient.AuthInfo authInfo, Handler<AsyncResult<MutualFundCountryExposure>> resultHandler) {
        delegate.mutualFundCountryExposure(symbol, isin, authInfo, resultHandler);
    }

    /**
    * Mutual Funds Country Exposure
    * Get Mutual Funds country exposure data.
    * @param symbol Symbol. (optional)
    * @param isin Fund&#39;s isin. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<MutualFundCountryExposure> rxMutualFundCountryExposure(String symbol, String isin) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.mutualFundCountryExposure(symbol, isin, fut)
        ));
    }

    /**
    * Mutual Funds Country Exposure
    * Get Mutual Funds country exposure data.
    * @param symbol Symbol. (optional)
    * @param isin Fund&#39;s isin. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<MutualFundCountryExposure> rxMutualFundCountryExposure(String symbol, String isin, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.mutualFundCountryExposure(symbol, isin, authInfo, fut)
        ));
    }
    /**
    * Mutual Funds EET
    * Get EET data for EU funds. For PAIs data, please see the EET PAI endpoint.
    * @param isin ISIN. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void mutualFundEet(String isin, Handler<AsyncResult<MutualFundEet>> resultHandler) {
        delegate.mutualFundEet(isin, resultHandler);
    }

    /**
    * Mutual Funds EET
    * Get EET data for EU funds. For PAIs data, please see the EET PAI endpoint.
    * @param isin ISIN. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void mutualFundEet(String isin, ApiClient.AuthInfo authInfo, Handler<AsyncResult<MutualFundEet>> resultHandler) {
        delegate.mutualFundEet(isin, authInfo, resultHandler);
    }

    /**
    * Mutual Funds EET
    * Get EET data for EU funds. For PAIs data, please see the EET PAI endpoint.
    * @param isin ISIN. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<MutualFundEet> rxMutualFundEet(String isin) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.mutualFundEet(isin, fut)
        ));
    }

    /**
    * Mutual Funds EET
    * Get EET data for EU funds. For PAIs data, please see the EET PAI endpoint.
    * @param isin ISIN. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<MutualFundEet> rxMutualFundEet(String isin, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.mutualFundEet(isin, authInfo, fut)
        ));
    }
    /**
    * Mutual Funds EET PAI
    * Get EET PAI data for EU funds.
    * @param isin ISIN. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void mutualFundEetPai(String isin, Handler<AsyncResult<MutualFundEetPai>> resultHandler) {
        delegate.mutualFundEetPai(isin, resultHandler);
    }

    /**
    * Mutual Funds EET PAI
    * Get EET PAI data for EU funds.
    * @param isin ISIN. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void mutualFundEetPai(String isin, ApiClient.AuthInfo authInfo, Handler<AsyncResult<MutualFundEetPai>> resultHandler) {
        delegate.mutualFundEetPai(isin, authInfo, resultHandler);
    }

    /**
    * Mutual Funds EET PAI
    * Get EET PAI data for EU funds.
    * @param isin ISIN. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<MutualFundEetPai> rxMutualFundEetPai(String isin) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.mutualFundEetPai(isin, fut)
        ));
    }

    /**
    * Mutual Funds EET PAI
    * Get EET PAI data for EU funds.
    * @param isin ISIN. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<MutualFundEetPai> rxMutualFundEetPai(String isin, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.mutualFundEetPai(isin, authInfo, fut)
        ));
    }
    /**
    * Mutual Funds Holdings
    * Get full Mutual Funds holdings/constituents. This endpoint covers both US and global mutual funds. For international funds, you must query the data using ISIN. A list of supported funds can be found &lt;a href&#x3D;\&quot;/api/v1/mutual-fund/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol Fund&#39;s symbol. (optional)
    * @param isin Fund&#39;s isin. (optional)
    * @param skip Skip the first n results. You can use this parameter to query historical constituents data. The latest result is returned if skip&#x3D;0 or not set. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void mutualFundHoldings(String symbol, String isin, Long skip, Handler<AsyncResult<MutualFundHoldings>> resultHandler) {
        delegate.mutualFundHoldings(symbol, isin, skip, resultHandler);
    }

    /**
    * Mutual Funds Holdings
    * Get full Mutual Funds holdings/constituents. This endpoint covers both US and global mutual funds. For international funds, you must query the data using ISIN. A list of supported funds can be found &lt;a href&#x3D;\&quot;/api/v1/mutual-fund/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol Fund&#39;s symbol. (optional)
    * @param isin Fund&#39;s isin. (optional)
    * @param skip Skip the first n results. You can use this parameter to query historical constituents data. The latest result is returned if skip&#x3D;0 or not set. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void mutualFundHoldings(String symbol, String isin, Long skip, ApiClient.AuthInfo authInfo, Handler<AsyncResult<MutualFundHoldings>> resultHandler) {
        delegate.mutualFundHoldings(symbol, isin, skip, authInfo, resultHandler);
    }

    /**
    * Mutual Funds Holdings
    * Get full Mutual Funds holdings/constituents. This endpoint covers both US and global mutual funds. For international funds, you must query the data using ISIN. A list of supported funds can be found &lt;a href&#x3D;\&quot;/api/v1/mutual-fund/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol Fund&#39;s symbol. (optional)
    * @param isin Fund&#39;s isin. (optional)
    * @param skip Skip the first n results. You can use this parameter to query historical constituents data. The latest result is returned if skip&#x3D;0 or not set. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<MutualFundHoldings> rxMutualFundHoldings(String symbol, String isin, Long skip) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.mutualFundHoldings(symbol, isin, skip, fut)
        ));
    }

    /**
    * Mutual Funds Holdings
    * Get full Mutual Funds holdings/constituents. This endpoint covers both US and global mutual funds. For international funds, you must query the data using ISIN. A list of supported funds can be found &lt;a href&#x3D;\&quot;/api/v1/mutual-fund/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol Fund&#39;s symbol. (optional)
    * @param isin Fund&#39;s isin. (optional)
    * @param skip Skip the first n results. You can use this parameter to query historical constituents data. The latest result is returned if skip&#x3D;0 or not set. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<MutualFundHoldings> rxMutualFundHoldings(String symbol, String isin, Long skip, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.mutualFundHoldings(symbol, isin, skip, authInfo, fut)
        ));
    }
    /**
    * Mutual Funds Profile
    * Get mutual funds profile information. This endpoint covers both US and global mutual funds. For international funds, you must query the data using ISIN. A list of supported funds can be found &lt;a href&#x3D;\&quot;/api/v1/mutual-fund/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol Fund&#39;s symbol. (optional)
    * @param isin Fund&#39;s isin. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void mutualFundProfile(String symbol, String isin, Handler<AsyncResult<MutualFundProfile>> resultHandler) {
        delegate.mutualFundProfile(symbol, isin, resultHandler);
    }

    /**
    * Mutual Funds Profile
    * Get mutual funds profile information. This endpoint covers both US and global mutual funds. For international funds, you must query the data using ISIN. A list of supported funds can be found &lt;a href&#x3D;\&quot;/api/v1/mutual-fund/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol Fund&#39;s symbol. (optional)
    * @param isin Fund&#39;s isin. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void mutualFundProfile(String symbol, String isin, ApiClient.AuthInfo authInfo, Handler<AsyncResult<MutualFundProfile>> resultHandler) {
        delegate.mutualFundProfile(symbol, isin, authInfo, resultHandler);
    }

    /**
    * Mutual Funds Profile
    * Get mutual funds profile information. This endpoint covers both US and global mutual funds. For international funds, you must query the data using ISIN. A list of supported funds can be found &lt;a href&#x3D;\&quot;/api/v1/mutual-fund/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol Fund&#39;s symbol. (optional)
    * @param isin Fund&#39;s isin. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<MutualFundProfile> rxMutualFundProfile(String symbol, String isin) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.mutualFundProfile(symbol, isin, fut)
        ));
    }

    /**
    * Mutual Funds Profile
    * Get mutual funds profile information. This endpoint covers both US and global mutual funds. For international funds, you must query the data using ISIN. A list of supported funds can be found &lt;a href&#x3D;\&quot;/api/v1/mutual-fund/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol Fund&#39;s symbol. (optional)
    * @param isin Fund&#39;s isin. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<MutualFundProfile> rxMutualFundProfile(String symbol, String isin, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.mutualFundProfile(symbol, isin, authInfo, fut)
        ));
    }
    /**
    * Mutual Funds Sector Exposure
    * Get Mutual Funds sector exposure data.
    * @param symbol Mutual Fund symbol. (optional)
    * @param isin Fund&#39;s isin. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void mutualFundSectorExposure(String symbol, String isin, Handler<AsyncResult<MutualFundSectorExposure>> resultHandler) {
        delegate.mutualFundSectorExposure(symbol, isin, resultHandler);
    }

    /**
    * Mutual Funds Sector Exposure
    * Get Mutual Funds sector exposure data.
    * @param symbol Mutual Fund symbol. (optional)
    * @param isin Fund&#39;s isin. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void mutualFundSectorExposure(String symbol, String isin, ApiClient.AuthInfo authInfo, Handler<AsyncResult<MutualFundSectorExposure>> resultHandler) {
        delegate.mutualFundSectorExposure(symbol, isin, authInfo, resultHandler);
    }

    /**
    * Mutual Funds Sector Exposure
    * Get Mutual Funds sector exposure data.
    * @param symbol Mutual Fund symbol. (optional)
    * @param isin Fund&#39;s isin. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<MutualFundSectorExposure> rxMutualFundSectorExposure(String symbol, String isin) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.mutualFundSectorExposure(symbol, isin, fut)
        ));
    }

    /**
    * Mutual Funds Sector Exposure
    * Get Mutual Funds sector exposure data.
    * @param symbol Mutual Fund symbol. (optional)
    * @param isin Fund&#39;s isin. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<MutualFundSectorExposure> rxMutualFundSectorExposure(String symbol, String isin, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.mutualFundSectorExposure(symbol, isin, authInfo, fut)
        ));
    }
    /**
    * News Sentiment
    * Get company&#39;s news sentiment and statistics. This endpoint is only available for US companies.
    * @param symbol Company symbol. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void newsSentiment(String symbol, Handler<AsyncResult<NewsSentiment>> resultHandler) {
        delegate.newsSentiment(symbol, resultHandler);
    }

    /**
    * News Sentiment
    * Get company&#39;s news sentiment and statistics. This endpoint is only available for US companies.
    * @param symbol Company symbol. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void newsSentiment(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<NewsSentiment>> resultHandler) {
        delegate.newsSentiment(symbol, authInfo, resultHandler);
    }

    /**
    * News Sentiment
    * Get company&#39;s news sentiment and statistics. This endpoint is only available for US companies.
    * @param symbol Company symbol. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<NewsSentiment> rxNewsSentiment(String symbol) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.newsSentiment(symbol, fut)
        ));
    }

    /**
    * News Sentiment
    * Get company&#39;s news sentiment and statistics. This endpoint is only available for US companies.
    * @param symbol Company symbol. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<NewsSentiment> rxNewsSentiment(String symbol, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.newsSentiment(symbol, authInfo, fut)
        ));
    }
    /**
    * Ownership
    * Get a full list of shareholders of a company in descending order of the number of shares held. Data is sourced from &lt;code&gt;13F form&lt;/code&gt;, &lt;code&gt;Schedule 13D&lt;/code&gt; and &lt;code&gt;13G&lt;/code&gt; for US market, &lt;code&gt;UK Share Register&lt;/code&gt; for UK market, &lt;code&gt;SEDI&lt;/code&gt; for Canadian market and equivalent filings for other international markets.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param limit Limit number of results. Leave empty to get the full list. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void ownership(String symbol, Long limit, Handler<AsyncResult<Ownership>> resultHandler) {
        delegate.ownership(symbol, limit, resultHandler);
    }

    /**
    * Ownership
    * Get a full list of shareholders of a company in descending order of the number of shares held. Data is sourced from &lt;code&gt;13F form&lt;/code&gt;, &lt;code&gt;Schedule 13D&lt;/code&gt; and &lt;code&gt;13G&lt;/code&gt; for US market, &lt;code&gt;UK Share Register&lt;/code&gt; for UK market, &lt;code&gt;SEDI&lt;/code&gt; for Canadian market and equivalent filings for other international markets.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param limit Limit number of results. Leave empty to get the full list. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void ownership(String symbol, Long limit, ApiClient.AuthInfo authInfo, Handler<AsyncResult<Ownership>> resultHandler) {
        delegate.ownership(symbol, limit, authInfo, resultHandler);
    }

    /**
    * Ownership
    * Get a full list of shareholders of a company in descending order of the number of shares held. Data is sourced from &lt;code&gt;13F form&lt;/code&gt;, &lt;code&gt;Schedule 13D&lt;/code&gt; and &lt;code&gt;13G&lt;/code&gt; for US market, &lt;code&gt;UK Share Register&lt;/code&gt; for UK market, &lt;code&gt;SEDI&lt;/code&gt; for Canadian market and equivalent filings for other international markets.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param limit Limit number of results. Leave empty to get the full list. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<Ownership> rxOwnership(String symbol, Long limit) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.ownership(symbol, limit, fut)
        ));
    }

    /**
    * Ownership
    * Get a full list of shareholders of a company in descending order of the number of shares held. Data is sourced from &lt;code&gt;13F form&lt;/code&gt;, &lt;code&gt;Schedule 13D&lt;/code&gt; and &lt;code&gt;13G&lt;/code&gt; for US market, &lt;code&gt;UK Share Register&lt;/code&gt; for UK market, &lt;code&gt;SEDI&lt;/code&gt; for Canadian market and equivalent filings for other international markets.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param limit Limit number of results. Leave empty to get the full list. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<Ownership> rxOwnership(String symbol, Long limit, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.ownership(symbol, limit, authInfo, fut)
        ));
    }
    /**
    * Pattern Recognition
    * Run pattern recognition algorithm on a symbol. Support double top/bottom, triple top/bottom, head and shoulders, triangle, wedge, channel, flag, and candlestick patterns.
    * @param symbol Symbol (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void patternRecognition(String symbol, String resolution, Handler<AsyncResult<PatternRecognition>> resultHandler) {
        delegate.patternRecognition(symbol, resolution, resultHandler);
    }

    /**
    * Pattern Recognition
    * Run pattern recognition algorithm on a symbol. Support double top/bottom, triple top/bottom, head and shoulders, triangle, wedge, channel, flag, and candlestick patterns.
    * @param symbol Symbol (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void patternRecognition(String symbol, String resolution, ApiClient.AuthInfo authInfo, Handler<AsyncResult<PatternRecognition>> resultHandler) {
        delegate.patternRecognition(symbol, resolution, authInfo, resultHandler);
    }

    /**
    * Pattern Recognition
    * Run pattern recognition algorithm on a symbol. Support double top/bottom, triple top/bottom, head and shoulders, triangle, wedge, channel, flag, and candlestick patterns.
    * @param symbol Symbol (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<PatternRecognition> rxPatternRecognition(String symbol, String resolution) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.patternRecognition(symbol, resolution, fut)
        ));
    }

    /**
    * Pattern Recognition
    * Run pattern recognition algorithm on a symbol. Support double top/bottom, triple top/bottom, head and shoulders, triangle, wedge, channel, flag, and candlestick patterns.
    * @param symbol Symbol (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<PatternRecognition> rxPatternRecognition(String symbol, String resolution, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.patternRecognition(symbol, resolution, authInfo, fut)
        ));
    }
    /**
    * Major Press Releases
    * &lt;p&gt;Get latest major press releases of a company. This data can be used to highlight the most significant events comprised of mostly press releases sourced from the exchanges, BusinessWire, AccessWire, GlobeNewswire, Newsfile, and PRNewswire.&lt;/p&gt;&lt;p&gt;Full-text press releases data is available for Enterprise clients. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact Us&lt;/a&gt; to learn more.&lt;/p&gt;
    * @param symbol Company symbol. (required)
    * @param from From time: 2020-01-01. (optional)
    * @param to To time: 2020-01-05. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void pressReleases(String symbol, LocalDate from, LocalDate to, Handler<AsyncResult<PressRelease>> resultHandler) {
        delegate.pressReleases(symbol, from, to, resultHandler);
    }

    /**
    * Major Press Releases
    * &lt;p&gt;Get latest major press releases of a company. This data can be used to highlight the most significant events comprised of mostly press releases sourced from the exchanges, BusinessWire, AccessWire, GlobeNewswire, Newsfile, and PRNewswire.&lt;/p&gt;&lt;p&gt;Full-text press releases data is available for Enterprise clients. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact Us&lt;/a&gt; to learn more.&lt;/p&gt;
    * @param symbol Company symbol. (required)
    * @param from From time: 2020-01-01. (optional)
    * @param to To time: 2020-01-05. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void pressReleases(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<PressRelease>> resultHandler) {
        delegate.pressReleases(symbol, from, to, authInfo, resultHandler);
    }

    /**
    * Major Press Releases
    * &lt;p&gt;Get latest major press releases of a company. This data can be used to highlight the most significant events comprised of mostly press releases sourced from the exchanges, BusinessWire, AccessWire, GlobeNewswire, Newsfile, and PRNewswire.&lt;/p&gt;&lt;p&gt;Full-text press releases data is available for Enterprise clients. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact Us&lt;/a&gt; to learn more.&lt;/p&gt;
    * @param symbol Company symbol. (required)
    * @param from From time: 2020-01-01. (optional)
    * @param to To time: 2020-01-05. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<PressRelease> rxPressReleases(String symbol, LocalDate from, LocalDate to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.pressReleases(symbol, from, to, fut)
        ));
    }

    /**
    * Major Press Releases
    * &lt;p&gt;Get latest major press releases of a company. This data can be used to highlight the most significant events comprised of mostly press releases sourced from the exchanges, BusinessWire, AccessWire, GlobeNewswire, Newsfile, and PRNewswire.&lt;/p&gt;&lt;p&gt;Full-text press releases data is available for Enterprise clients. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact Us&lt;/a&gt; to learn more.&lt;/p&gt;
    * @param symbol Company symbol. (required)
    * @param from From time: 2020-01-01. (optional)
    * @param to To time: 2020-01-05. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<PressRelease> rxPressReleases(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.pressReleases(symbol, from, to, authInfo, fut)
        ));
    }
    /**
    * Price Metrics
    * Get company price performance statistics such as 52-week high/low, YTD return and much more.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param date Get data on a specific date in the past. The data is available weekly so your date will be automatically adjusted to the last day of that week. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void priceMetrics(String symbol, String date, Handler<AsyncResult<PriceMetrics>> resultHandler) {
        delegate.priceMetrics(symbol, date, resultHandler);
    }

    /**
    * Price Metrics
    * Get company price performance statistics such as 52-week high/low, YTD return and much more.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param date Get data on a specific date in the past. The data is available weekly so your date will be automatically adjusted to the last day of that week. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void priceMetrics(String symbol, String date, ApiClient.AuthInfo authInfo, Handler<AsyncResult<PriceMetrics>> resultHandler) {
        delegate.priceMetrics(symbol, date, authInfo, resultHandler);
    }

    /**
    * Price Metrics
    * Get company price performance statistics such as 52-week high/low, YTD return and much more.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param date Get data on a specific date in the past. The data is available weekly so your date will be automatically adjusted to the last day of that week. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<PriceMetrics> rxPriceMetrics(String symbol, String date) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.priceMetrics(symbol, date, fut)
        ));
    }

    /**
    * Price Metrics
    * Get company price performance statistics such as 52-week high/low, YTD return and much more.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param date Get data on a specific date in the past. The data is available weekly so your date will be automatically adjusted to the last day of that week. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<PriceMetrics> rxPriceMetrics(String symbol, String date, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.priceMetrics(symbol, date, authInfo, fut)
        ));
    }
    /**
    * Price Target
    * Get latest price target consensus.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void priceTarget(String symbol, Handler<AsyncResult<PriceTarget>> resultHandler) {
        delegate.priceTarget(symbol, resultHandler);
    }

    /**
    * Price Target
    * Get latest price target consensus.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void priceTarget(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<PriceTarget>> resultHandler) {
        delegate.priceTarget(symbol, authInfo, resultHandler);
    }

    /**
    * Price Target
    * Get latest price target consensus.
    * @param symbol Symbol of the company: AAPL. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<PriceTarget> rxPriceTarget(String symbol) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.priceTarget(symbol, fut)
        ));
    }

    /**
    * Price Target
    * Get latest price target consensus.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<PriceTarget> rxPriceTarget(String symbol, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.priceTarget(symbol, authInfo, fut)
        ));
    }
    /**
    * Quote
    * &lt;p&gt;Get real-time quote data for US stocks. Constant polling is not recommended. Use websocket if you need real-time updates.&lt;/p&gt;&lt;p&gt;Real-time stock prices for international markets are supported for Enterprise clients via our partner&#39;s feed. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact Us&lt;/a&gt; to learn more.&lt;/p&gt;
    * @param symbol Symbol (required)
    * @param resultHandler Asynchronous result handler
    */
    public void quote(String symbol, Handler<AsyncResult<Quote>> resultHandler) {
        delegate.quote(symbol, resultHandler);
    }

    /**
    * Quote
    * &lt;p&gt;Get real-time quote data for US stocks. Constant polling is not recommended. Use websocket if you need real-time updates.&lt;/p&gt;&lt;p&gt;Real-time stock prices for international markets are supported for Enterprise clients via our partner&#39;s feed. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact Us&lt;/a&gt; to learn more.&lt;/p&gt;
    * @param symbol Symbol (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void quote(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<Quote>> resultHandler) {
        delegate.quote(symbol, authInfo, resultHandler);
    }

    /**
    * Quote
    * &lt;p&gt;Get real-time quote data for US stocks. Constant polling is not recommended. Use websocket if you need real-time updates.&lt;/p&gt;&lt;p&gt;Real-time stock prices for international markets are supported for Enterprise clients via our partner&#39;s feed. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact Us&lt;/a&gt; to learn more.&lt;/p&gt;
    * @param symbol Symbol (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<Quote> rxQuote(String symbol) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.quote(symbol, fut)
        ));
    }

    /**
    * Quote
    * &lt;p&gt;Get real-time quote data for US stocks. Constant polling is not recommended. Use websocket if you need real-time updates.&lt;/p&gt;&lt;p&gt;Real-time stock prices for international markets are supported for Enterprise clients via our partner&#39;s feed. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact Us&lt;/a&gt; to learn more.&lt;/p&gt;
    * @param symbol Symbol (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<Quote> rxQuote(String symbol, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.quote(symbol, authInfo, fut)
        ));
    }
    /**
    * Recommendation Trends
    * Get latest analyst recommendation trends for a company.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void recommendationTrends(String symbol, Handler<AsyncResult<List<RecommendationTrend>>> resultHandler) {
        delegate.recommendationTrends(symbol, resultHandler);
    }

    /**
    * Recommendation Trends
    * Get latest analyst recommendation trends for a company.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void recommendationTrends(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<RecommendationTrend>>> resultHandler) {
        delegate.recommendationTrends(symbol, authInfo, resultHandler);
    }

    /**
    * Recommendation Trends
    * Get latest analyst recommendation trends for a company.
    * @param symbol Symbol of the company: AAPL. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<RecommendationTrend>> rxRecommendationTrends(String symbol) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.recommendationTrends(symbol, fut)
        ));
    }

    /**
    * Recommendation Trends
    * Get latest analyst recommendation trends for a company.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<RecommendationTrend>> rxRecommendationTrends(String symbol, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.recommendationTrends(symbol, authInfo, fut)
        ));
    }
    /**
    * Revenue Breakdown
    * &lt;p&gt;Get revenue breakdown as-reporetd by product and geography. Users on personal plans can access data for US companies which disclose their revenue breakdown in the annual or quarterly reports.&lt;/p&gt;&lt;p&gt;Global standardized revenue breakdown/segments data is available for Enterprise users. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact us&lt;/a&gt; to inquire about the access for Global standardized data.&lt;/p&gt;
    * @param symbol Symbol. (optional)
    * @param cik CIK. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void revenueBreakdown(String symbol, String cik, Handler<AsyncResult<RevenueBreakdown>> resultHandler) {
        delegate.revenueBreakdown(symbol, cik, resultHandler);
    }

    /**
    * Revenue Breakdown
    * &lt;p&gt;Get revenue breakdown as-reporetd by product and geography. Users on personal plans can access data for US companies which disclose their revenue breakdown in the annual or quarterly reports.&lt;/p&gt;&lt;p&gt;Global standardized revenue breakdown/segments data is available for Enterprise users. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact us&lt;/a&gt; to inquire about the access for Global standardized data.&lt;/p&gt;
    * @param symbol Symbol. (optional)
    * @param cik CIK. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void revenueBreakdown(String symbol, String cik, ApiClient.AuthInfo authInfo, Handler<AsyncResult<RevenueBreakdown>> resultHandler) {
        delegate.revenueBreakdown(symbol, cik, authInfo, resultHandler);
    }

    /**
    * Revenue Breakdown
    * &lt;p&gt;Get revenue breakdown as-reporetd by product and geography. Users on personal plans can access data for US companies which disclose their revenue breakdown in the annual or quarterly reports.&lt;/p&gt;&lt;p&gt;Global standardized revenue breakdown/segments data is available for Enterprise users. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact us&lt;/a&gt; to inquire about the access for Global standardized data.&lt;/p&gt;
    * @param symbol Symbol. (optional)
    * @param cik CIK. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<RevenueBreakdown> rxRevenueBreakdown(String symbol, String cik) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.revenueBreakdown(symbol, cik, fut)
        ));
    }

    /**
    * Revenue Breakdown
    * &lt;p&gt;Get revenue breakdown as-reporetd by product and geography. Users on personal plans can access data for US companies which disclose their revenue breakdown in the annual or quarterly reports.&lt;/p&gt;&lt;p&gt;Global standardized revenue breakdown/segments data is available for Enterprise users. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact us&lt;/a&gt; to inquire about the access for Global standardized data.&lt;/p&gt;
    * @param symbol Symbol. (optional)
    * @param cik CIK. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<RevenueBreakdown> rxRevenueBreakdown(String symbol, String cik, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.revenueBreakdown(symbol, cik, authInfo, fut)
        ));
    }
    /**
    * Revenue Breakdown &amp; KPI
    * &lt;p&gt;Get standardized revenue breakdown and KPIs data for 30,000+ global companies.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void revenueBreakdown2(String symbol, Handler<AsyncResult<RevenueBreakdown2>> resultHandler) {
        delegate.revenueBreakdown2(symbol, resultHandler);
    }

    /**
    * Revenue Breakdown &amp; KPI
    * &lt;p&gt;Get standardized revenue breakdown and KPIs data for 30,000+ global companies.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void revenueBreakdown2(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<RevenueBreakdown2>> resultHandler) {
        delegate.revenueBreakdown2(symbol, authInfo, resultHandler);
    }

    /**
    * Revenue Breakdown &amp; KPI
    * &lt;p&gt;Get standardized revenue breakdown and KPIs data for 30,000+ global companies.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<RevenueBreakdown2> rxRevenueBreakdown2(String symbol) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.revenueBreakdown2(symbol, fut)
        ));
    }

    /**
    * Revenue Breakdown &amp; KPI
    * &lt;p&gt;Get standardized revenue breakdown and KPIs data for 30,000+ global companies.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<RevenueBreakdown2> rxRevenueBreakdown2(String symbol, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.revenueBreakdown2(symbol, authInfo, fut)
        ));
    }
    /**
    * Search In Filing
    * &lt;p&gt;Get a list of excerpts and highlight positions within a document using your query.&lt;/p&gt;
    * @param search Search body (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void searchInFiling(InFilingSearchBody search, Handler<AsyncResult<InFilingResponse>> resultHandler) {
        delegate.searchInFiling(search, resultHandler);
    }

    /**
    * Search In Filing
    * &lt;p&gt;Get a list of excerpts and highlight positions within a document using your query.&lt;/p&gt;
    * @param search Search body (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void searchInFiling(InFilingSearchBody search, ApiClient.AuthInfo authInfo, Handler<AsyncResult<InFilingResponse>> resultHandler) {
        delegate.searchInFiling(search, authInfo, resultHandler);
    }

    /**
    * Search In Filing
    * &lt;p&gt;Get a list of excerpts and highlight positions within a document using your query.&lt;/p&gt;
    * @param search Search body (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<InFilingResponse> rxSearchInFiling(InFilingSearchBody search) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.searchInFiling(search, fut)
        ));
    }

    /**
    * Search In Filing
    * &lt;p&gt;Get a list of excerpts and highlight positions within a document using your query.&lt;/p&gt;
    * @param search Search body (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<InFilingResponse> rxSearchInFiling(InFilingSearchBody search, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.searchInFiling(search, authInfo, fut)
        ));
    }
    /**
    * Sector Metrics
    * Get ratios for different sectors and regions/indices.
    * @param region Region. A list of supported values for this field can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1afedyv7yWJ-z7pMjaAZK-f6ENY3mI3EBCk95QffpoHw/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void sectorMetric(String region, Handler<AsyncResult<SectorMetric>> resultHandler) {
        delegate.sectorMetric(region, resultHandler);
    }

    /**
    * Sector Metrics
    * Get ratios for different sectors and regions/indices.
    * @param region Region. A list of supported values for this field can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1afedyv7yWJ-z7pMjaAZK-f6ENY3mI3EBCk95QffpoHw/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void sectorMetric(String region, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SectorMetric>> resultHandler) {
        delegate.sectorMetric(region, authInfo, resultHandler);
    }

    /**
    * Sector Metrics
    * Get ratios for different sectors and regions/indices.
    * @param region Region. A list of supported values for this field can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1afedyv7yWJ-z7pMjaAZK-f6ENY3mI3EBCk95QffpoHw/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<SectorMetric> rxSectorMetric(String region) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.sectorMetric(region, fut)
        ));
    }

    /**
    * Sector Metrics
    * Get ratios for different sectors and regions/indices.
    * @param region Region. A list of supported values for this field can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1afedyv7yWJ-z7pMjaAZK-f6ENY3mI3EBCk95QffpoHw/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<SectorMetric> rxSectorMetric(String region, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.sectorMetric(region, authInfo, fut)
        ));
    }
    /**
    * Similarity Index
    * &lt;p&gt;Calculate the textual difference between a company&#39;s 10-K / 10-Q reports and the same type of report in the previous year using Cosine Similarity. For example, this endpoint compares 2019&#39;s 10-K with 2018&#39;s 10-K. Companies breaking from its routines in disclosure of financial condition and risk analysis section can signal a significant change in the company&#39;s stock price in the upcoming 4 quarters.&lt;/p&gt;
    * @param symbol Symbol. Required if cik is empty (optional)
    * @param cik CIK. Required if symbol is empty (optional)
    * @param freq &lt;code&gt;annual&lt;/code&gt; or &lt;code&gt;quarterly&lt;/code&gt;. Default to &lt;code&gt;annual&lt;/code&gt; (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void similarityIndex(String symbol, String cik, String freq, Handler<AsyncResult<SimilarityIndex>> resultHandler) {
        delegate.similarityIndex(symbol, cik, freq, resultHandler);
    }

    /**
    * Similarity Index
    * &lt;p&gt;Calculate the textual difference between a company&#39;s 10-K / 10-Q reports and the same type of report in the previous year using Cosine Similarity. For example, this endpoint compares 2019&#39;s 10-K with 2018&#39;s 10-K. Companies breaking from its routines in disclosure of financial condition and risk analysis section can signal a significant change in the company&#39;s stock price in the upcoming 4 quarters.&lt;/p&gt;
    * @param symbol Symbol. Required if cik is empty (optional)
    * @param cik CIK. Required if symbol is empty (optional)
    * @param freq &lt;code&gt;annual&lt;/code&gt; or &lt;code&gt;quarterly&lt;/code&gt;. Default to &lt;code&gt;annual&lt;/code&gt; (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void similarityIndex(String symbol, String cik, String freq, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SimilarityIndex>> resultHandler) {
        delegate.similarityIndex(symbol, cik, freq, authInfo, resultHandler);
    }

    /**
    * Similarity Index
    * &lt;p&gt;Calculate the textual difference between a company&#39;s 10-K / 10-Q reports and the same type of report in the previous year using Cosine Similarity. For example, this endpoint compares 2019&#39;s 10-K with 2018&#39;s 10-K. Companies breaking from its routines in disclosure of financial condition and risk analysis section can signal a significant change in the company&#39;s stock price in the upcoming 4 quarters.&lt;/p&gt;
    * @param symbol Symbol. Required if cik is empty (optional)
    * @param cik CIK. Required if symbol is empty (optional)
    * @param freq &lt;code&gt;annual&lt;/code&gt; or &lt;code&gt;quarterly&lt;/code&gt;. Default to &lt;code&gt;annual&lt;/code&gt; (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<SimilarityIndex> rxSimilarityIndex(String symbol, String cik, String freq) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.similarityIndex(symbol, cik, freq, fut)
        ));
    }

    /**
    * Similarity Index
    * &lt;p&gt;Calculate the textual difference between a company&#39;s 10-K / 10-Q reports and the same type of report in the previous year using Cosine Similarity. For example, this endpoint compares 2019&#39;s 10-K with 2018&#39;s 10-K. Companies breaking from its routines in disclosure of financial condition and risk analysis section can signal a significant change in the company&#39;s stock price in the upcoming 4 quarters.&lt;/p&gt;
    * @param symbol Symbol. Required if cik is empty (optional)
    * @param cik CIK. Required if symbol is empty (optional)
    * @param freq &lt;code&gt;annual&lt;/code&gt; or &lt;code&gt;quarterly&lt;/code&gt;. Default to &lt;code&gt;annual&lt;/code&gt; (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<SimilarityIndex> rxSimilarityIndex(String symbol, String cik, String freq, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.similarityIndex(symbol, cik, freq, authInfo, fut)
        ));
    }
    /**
    * Social Sentiment
    * &lt;p&gt;Get social sentiment for stocks on Reddit and Twitter.&lt;/p&gt;
    * @param symbol Company symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void socialSentiment(String symbol, LocalDate from, LocalDate to, Handler<AsyncResult<SocialSentiment>> resultHandler) {
        delegate.socialSentiment(symbol, from, to, resultHandler);
    }

    /**
    * Social Sentiment
    * &lt;p&gt;Get social sentiment for stocks on Reddit and Twitter.&lt;/p&gt;
    * @param symbol Company symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void socialSentiment(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SocialSentiment>> resultHandler) {
        delegate.socialSentiment(symbol, from, to, authInfo, resultHandler);
    }

    /**
    * Social Sentiment
    * &lt;p&gt;Get social sentiment for stocks on Reddit and Twitter.&lt;/p&gt;
    * @param symbol Company symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<SocialSentiment> rxSocialSentiment(String symbol, LocalDate from, LocalDate to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.socialSentiment(symbol, from, to, fut)
        ));
    }

    /**
    * Social Sentiment
    * &lt;p&gt;Get social sentiment for stocks on Reddit and Twitter.&lt;/p&gt;
    * @param symbol Company symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<SocialSentiment> rxSocialSentiment(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.socialSentiment(symbol, from, to, authInfo, fut)
        ));
    }
    /**
    * Dividends 2 (Basic)
    * Get global dividends data.
    * @param symbol Symbol. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void stockBasicDividends(String symbol, Handler<AsyncResult<Dividends2>> resultHandler) {
        delegate.stockBasicDividends(symbol, resultHandler);
    }

    /**
    * Dividends 2 (Basic)
    * Get global dividends data.
    * @param symbol Symbol. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void stockBasicDividends(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<Dividends2>> resultHandler) {
        delegate.stockBasicDividends(symbol, authInfo, resultHandler);
    }

    /**
    * Dividends 2 (Basic)
    * Get global dividends data.
    * @param symbol Symbol. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<Dividends2> rxStockBasicDividends(String symbol) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.stockBasicDividends(symbol, fut)
        ));
    }

    /**
    * Dividends 2 (Basic)
    * Get global dividends data.
    * @param symbol Symbol. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<Dividends2> rxStockBasicDividends(String symbol, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.stockBasicDividends(symbol, authInfo, fut)
        ));
    }
    /**
    * Last Bid-Ask
    * Get last bid/ask data for US stocks.
    * @param symbol Symbol. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void stockBidask(String symbol, Handler<AsyncResult<LastBidAsk>> resultHandler) {
        delegate.stockBidask(symbol, resultHandler);
    }

    /**
    * Last Bid-Ask
    * Get last bid/ask data for US stocks.
    * @param symbol Symbol. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void stockBidask(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<LastBidAsk>> resultHandler) {
        delegate.stockBidask(symbol, authInfo, resultHandler);
    }

    /**
    * Last Bid-Ask
    * Get last bid/ask data for US stocks.
    * @param symbol Symbol. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<LastBidAsk> rxStockBidask(String symbol) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.stockBidask(symbol, fut)
        ));
    }

    /**
    * Last Bid-Ask
    * Get last bid/ask data for US stocks.
    * @param symbol Symbol. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<LastBidAsk> rxStockBidask(String symbol, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.stockBidask(symbol, authInfo, fut)
        ));
    }
    /**
    * Stock Candles
    * &lt;p&gt;Get candlestick data (OHLCV) for stocks.&lt;/p&gt;&lt;p&gt;Daily data will be adjusted for Splits. Intraday data will remain unadjusted. Only 1 month of intraday will be returned at a time. If you need more historical intraday data, please use the from and to params iteratively to request more data.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param from UNIX timestamp. Interval initial value. (required)
    * @param to UNIX timestamp. Interval end value. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void stockCandles(String symbol, String resolution, Long from, Long to, Handler<AsyncResult<StockCandles>> resultHandler) {
        delegate.stockCandles(symbol, resolution, from, to, resultHandler);
    }

    /**
    * Stock Candles
    * &lt;p&gt;Get candlestick data (OHLCV) for stocks.&lt;/p&gt;&lt;p&gt;Daily data will be adjusted for Splits. Intraday data will remain unadjusted. Only 1 month of intraday will be returned at a time. If you need more historical intraday data, please use the from and to params iteratively to request more data.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param from UNIX timestamp. Interval initial value. (required)
    * @param to UNIX timestamp. Interval end value. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void stockCandles(String symbol, String resolution, Long from, Long to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<StockCandles>> resultHandler) {
        delegate.stockCandles(symbol, resolution, from, to, authInfo, resultHandler);
    }

    /**
    * Stock Candles
    * &lt;p&gt;Get candlestick data (OHLCV) for stocks.&lt;/p&gt;&lt;p&gt;Daily data will be adjusted for Splits. Intraday data will remain unadjusted. Only 1 month of intraday will be returned at a time. If you need more historical intraday data, please use the from and to params iteratively to request more data.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param from UNIX timestamp. Interval initial value. (required)
    * @param to UNIX timestamp. Interval end value. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<StockCandles> rxStockCandles(String symbol, String resolution, Long from, Long to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.stockCandles(symbol, resolution, from, to, fut)
        ));
    }

    /**
    * Stock Candles
    * &lt;p&gt;Get candlestick data (OHLCV) for stocks.&lt;/p&gt;&lt;p&gt;Daily data will be adjusted for Splits. Intraday data will remain unadjusted. Only 1 month of intraday will be returned at a time. If you need more historical intraday data, please use the from and to params iteratively to request more data.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param from UNIX timestamp. Interval initial value. (required)
    * @param to UNIX timestamp. Interval end value. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<StockCandles> rxStockCandles(String symbol, String resolution, Long from, Long to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.stockCandles(symbol, resolution, from, to, authInfo, fut)
        ));
    }
    /**
    * Dividends
    * Get dividends data for common stocks going back 30 years.
    * @param symbol Symbol. (required)
    * @param from YYYY-MM-DD. (required)
    * @param to YYYY-MM-DD. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void stockDividends(String symbol, LocalDate from, LocalDate to, Handler<AsyncResult<List<Dividends>>> resultHandler) {
        delegate.stockDividends(symbol, from, to, resultHandler);
    }

    /**
    * Dividends
    * Get dividends data for common stocks going back 30 years.
    * @param symbol Symbol. (required)
    * @param from YYYY-MM-DD. (required)
    * @param to YYYY-MM-DD. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void stockDividends(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<Dividends>>> resultHandler) {
        delegate.stockDividends(symbol, from, to, authInfo, resultHandler);
    }

    /**
    * Dividends
    * Get dividends data for common stocks going back 30 years.
    * @param symbol Symbol. (required)
    * @param from YYYY-MM-DD. (required)
    * @param to YYYY-MM-DD. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<Dividends>> rxStockDividends(String symbol, LocalDate from, LocalDate to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.stockDividends(symbol, from, to, fut)
        ));
    }

    /**
    * Dividends
    * Get dividends data for common stocks going back 30 years.
    * @param symbol Symbol. (required)
    * @param from YYYY-MM-DD. (required)
    * @param to YYYY-MM-DD. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<Dividends>> rxStockDividends(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.stockDividends(symbol, from, to, authInfo, fut)
        ));
    }
    /**
    * Senate Lobbying
    * Get a list of reported lobbying activities in the Senate and the House.
    * @param symbol Symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void stockLobbying(String symbol, LocalDate from, LocalDate to, Handler<AsyncResult<LobbyingResult>> resultHandler) {
        delegate.stockLobbying(symbol, from, to, resultHandler);
    }

    /**
    * Senate Lobbying
    * Get a list of reported lobbying activities in the Senate and the House.
    * @param symbol Symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void stockLobbying(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<LobbyingResult>> resultHandler) {
        delegate.stockLobbying(symbol, from, to, authInfo, resultHandler);
    }

    /**
    * Senate Lobbying
    * Get a list of reported lobbying activities in the Senate and the House.
    * @param symbol Symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<LobbyingResult> rxStockLobbying(String symbol, LocalDate from, LocalDate to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.stockLobbying(symbol, from, to, fut)
        ));
    }

    /**
    * Senate Lobbying
    * Get a list of reported lobbying activities in the Senate and the House.
    * @param symbol Symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<LobbyingResult> rxStockLobbying(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.stockLobbying(symbol, from, to, authInfo, fut)
        ));
    }
    /**
    * Historical NBBO
    * &lt;p&gt;Get historical best bid and offer for US stocks, LSE, TSX, Euronext and Deutsche Borse.&lt;/p&gt;&lt;p&gt;For US market, this endpoint only serves historical NBBO from the beginning of 2020. To download more historical data, please visit our bulk download page in the Dashboard &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/dashboard/download\&quot;,&gt;here&lt;/a&gt;.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param date Date: 2020-04-02. (required)
    * @param limit Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; (required)
    * @param skip Number of ticks to skip. Use this parameter to loop through the entire data. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void stockNbbo(String symbol, LocalDate date, Long limit, Long skip, Handler<AsyncResult<HistoricalNBBO>> resultHandler) {
        delegate.stockNbbo(symbol, date, limit, skip, resultHandler);
    }

    /**
    * Historical NBBO
    * &lt;p&gt;Get historical best bid and offer for US stocks, LSE, TSX, Euronext and Deutsche Borse.&lt;/p&gt;&lt;p&gt;For US market, this endpoint only serves historical NBBO from the beginning of 2020. To download more historical data, please visit our bulk download page in the Dashboard &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/dashboard/download\&quot;,&gt;here&lt;/a&gt;.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param date Date: 2020-04-02. (required)
    * @param limit Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; (required)
    * @param skip Number of ticks to skip. Use this parameter to loop through the entire data. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void stockNbbo(String symbol, LocalDate date, Long limit, Long skip, ApiClient.AuthInfo authInfo, Handler<AsyncResult<HistoricalNBBO>> resultHandler) {
        delegate.stockNbbo(symbol, date, limit, skip, authInfo, resultHandler);
    }

    /**
    * Historical NBBO
    * &lt;p&gt;Get historical best bid and offer for US stocks, LSE, TSX, Euronext and Deutsche Borse.&lt;/p&gt;&lt;p&gt;For US market, this endpoint only serves historical NBBO from the beginning of 2020. To download more historical data, please visit our bulk download page in the Dashboard &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/dashboard/download\&quot;,&gt;here&lt;/a&gt;.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param date Date: 2020-04-02. (required)
    * @param limit Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; (required)
    * @param skip Number of ticks to skip. Use this parameter to loop through the entire data. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<HistoricalNBBO> rxStockNbbo(String symbol, LocalDate date, Long limit, Long skip) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.stockNbbo(symbol, date, limit, skip, fut)
        ));
    }

    /**
    * Historical NBBO
    * &lt;p&gt;Get historical best bid and offer for US stocks, LSE, TSX, Euronext and Deutsche Borse.&lt;/p&gt;&lt;p&gt;For US market, this endpoint only serves historical NBBO from the beginning of 2020. To download more historical data, please visit our bulk download page in the Dashboard &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/dashboard/download\&quot;,&gt;here&lt;/a&gt;.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param date Date: 2020-04-02. (required)
    * @param limit Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; (required)
    * @param skip Number of ticks to skip. Use this parameter to loop through the entire data. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<HistoricalNBBO> rxStockNbbo(String symbol, LocalDate date, Long limit, Long skip, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.stockNbbo(symbol, date, limit, skip, authInfo, fut)
        ));
    }
    /**
    * Company Presentation
    * &lt;p&gt;Get presentations/slides data in PDF format that are usually used during earnings calls.&lt;/p&gt;
    * @param symbol Company symbol. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void stockPresentation(String symbol, Handler<AsyncResult<StockPresentation>> resultHandler) {
        delegate.stockPresentation(symbol, resultHandler);
    }

    /**
    * Company Presentation
    * &lt;p&gt;Get presentations/slides data in PDF format that are usually used during earnings calls.&lt;/p&gt;
    * @param symbol Company symbol. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void stockPresentation(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<StockPresentation>> resultHandler) {
        delegate.stockPresentation(symbol, authInfo, resultHandler);
    }

    /**
    * Company Presentation
    * &lt;p&gt;Get presentations/slides data in PDF format that are usually used during earnings calls.&lt;/p&gt;
    * @param symbol Company symbol. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<StockPresentation> rxStockPresentation(String symbol) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.stockPresentation(symbol, fut)
        ));
    }

    /**
    * Company Presentation
    * &lt;p&gt;Get presentations/slides data in PDF format that are usually used during earnings calls.&lt;/p&gt;
    * @param symbol Company symbol. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<StockPresentation> rxStockPresentation(String symbol, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.stockPresentation(symbol, authInfo, fut)
        ));
    }
    /**
    * Splits
    * Get splits data for stocks.
    * @param symbol Symbol. (required)
    * @param from YYYY-MM-DD. (required)
    * @param to YYYY-MM-DD. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void stockSplits(String symbol, LocalDate from, LocalDate to, Handler<AsyncResult<List<Split>>> resultHandler) {
        delegate.stockSplits(symbol, from, to, resultHandler);
    }

    /**
    * Splits
    * Get splits data for stocks.
    * @param symbol Symbol. (required)
    * @param from YYYY-MM-DD. (required)
    * @param to YYYY-MM-DD. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void stockSplits(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<Split>>> resultHandler) {
        delegate.stockSplits(symbol, from, to, authInfo, resultHandler);
    }

    /**
    * Splits
    * Get splits data for stocks.
    * @param symbol Symbol. (required)
    * @param from YYYY-MM-DD. (required)
    * @param to YYYY-MM-DD. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<Split>> rxStockSplits(String symbol, LocalDate from, LocalDate to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.stockSplits(symbol, from, to, fut)
        ));
    }

    /**
    * Splits
    * Get splits data for stocks.
    * @param symbol Symbol. (required)
    * @param from YYYY-MM-DD. (required)
    * @param to YYYY-MM-DD. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<Split>> rxStockSplits(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.stockSplits(symbol, from, to, authInfo, fut)
        ));
    }
    /**
    * Stock Symbol
    * List supported stocks. We use the following symbology to identify stocks on Finnhub &lt;code&gt;Exchange_Ticker.Exchange_Code&lt;/code&gt;. A list of supported exchange codes can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1I3pBxjfXB056-g_JYf_6o3Rns3BV2kMGG1nCatb91ls/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param exchange Exchange you want to get the list of symbols from. List of exchange codes can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1I3pBxjfXB056-g_JYf_6o3Rns3BV2kMGG1nCatb91ls/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. (required)
    * @param mic Filter by MIC code. (optional)
    * @param securityType Filter by security type used by OpenFigi standard. (optional)
    * @param currency Filter by currency. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void stockSymbols(String exchange, String mic, String securityType, String currency, Handler<AsyncResult<List<StockSymbol>>> resultHandler) {
        delegate.stockSymbols(exchange, mic, securityType, currency, resultHandler);
    }

    /**
    * Stock Symbol
    * List supported stocks. We use the following symbology to identify stocks on Finnhub &lt;code&gt;Exchange_Ticker.Exchange_Code&lt;/code&gt;. A list of supported exchange codes can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1I3pBxjfXB056-g_JYf_6o3Rns3BV2kMGG1nCatb91ls/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param exchange Exchange you want to get the list of symbols from. List of exchange codes can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1I3pBxjfXB056-g_JYf_6o3Rns3BV2kMGG1nCatb91ls/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. (required)
    * @param mic Filter by MIC code. (optional)
    * @param securityType Filter by security type used by OpenFigi standard. (optional)
    * @param currency Filter by currency. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void stockSymbols(String exchange, String mic, String securityType, String currency, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<StockSymbol>>> resultHandler) {
        delegate.stockSymbols(exchange, mic, securityType, currency, authInfo, resultHandler);
    }

    /**
    * Stock Symbol
    * List supported stocks. We use the following symbology to identify stocks on Finnhub &lt;code&gt;Exchange_Ticker.Exchange_Code&lt;/code&gt;. A list of supported exchange codes can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1I3pBxjfXB056-g_JYf_6o3Rns3BV2kMGG1nCatb91ls/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param exchange Exchange you want to get the list of symbols from. List of exchange codes can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1I3pBxjfXB056-g_JYf_6o3Rns3BV2kMGG1nCatb91ls/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. (required)
    * @param mic Filter by MIC code. (optional)
    * @param securityType Filter by security type used by OpenFigi standard. (optional)
    * @param currency Filter by currency. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<StockSymbol>> rxStockSymbols(String exchange, String mic, String securityType, String currency) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.stockSymbols(exchange, mic, securityType, currency, fut)
        ));
    }

    /**
    * Stock Symbol
    * List supported stocks. We use the following symbology to identify stocks on Finnhub &lt;code&gt;Exchange_Ticker.Exchange_Code&lt;/code&gt;. A list of supported exchange codes can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1I3pBxjfXB056-g_JYf_6o3Rns3BV2kMGG1nCatb91ls/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param exchange Exchange you want to get the list of symbols from. List of exchange codes can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1I3pBxjfXB056-g_JYf_6o3Rns3BV2kMGG1nCatb91ls/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. (required)
    * @param mic Filter by MIC code. (optional)
    * @param securityType Filter by security type used by OpenFigi standard. (optional)
    * @param currency Filter by currency. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<StockSymbol>> rxStockSymbols(String exchange, String mic, String securityType, String currency, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.stockSymbols(exchange, mic, securityType, currency, authInfo, fut)
        ));
    }
    /**
    * Tick Data
    * &lt;p&gt;Get historical tick data for global exchanges.&lt;/p&gt;&lt;p&gt;For more historical tick data, you can visit our bulk download page in the Dashboard &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/dashboard/download\&quot;,&gt;here&lt;/a&gt; to speed up the download process.&lt;/p&gt;&lt;table class&#x3D;\&quot;table table-hover\&quot;&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Exchange&lt;/th&gt;       &lt;th&gt;Segment&lt;/th&gt;       &lt;th&gt;Delay&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;US CTA/UTP&lt;/th&gt;       &lt;td&gt;Full SIP&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;TSX&lt;/th&gt;       &lt;td&gt;&lt;ul&gt;&lt;li&gt;TSX&lt;/li&gt;&lt;li&gt;TSX Venture&lt;/li&gt;&lt;li&gt;Index&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;LSE&lt;/th&gt;       &lt;td&gt;&lt;ul&gt;&lt;li&gt;London Stock Exchange (L)&lt;/li&gt;&lt;li&gt;LSE International (L)&lt;/li&gt;&lt;li&gt;LSE European (L)&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;15 minute&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;Euronext&lt;/th&gt;       &lt;td&gt;&lt;ul&gt; &lt;li&gt;Euronext Paris (PA)&lt;/li&gt; &lt;li&gt;Euronext Amsterdam (AS)&lt;/li&gt; &lt;li&gt;Euronext Lisbon (LS)&lt;/li&gt; &lt;li&gt;Euronext Brussels (BR)&lt;/li&gt; &lt;li&gt;Euronext Oslo (OL)&lt;/li&gt; &lt;li&gt;Euronext London (LN)&lt;/li&gt; &lt;li&gt;Euronext Dublin (IR)&lt;/li&gt; &lt;li&gt;Index&lt;/li&gt; &lt;li&gt;Warrant&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;Deutsche Börse&lt;/th&gt;       &lt;td&gt;&lt;ul&gt; &lt;li&gt;Frankfurt (F)&lt;/li&gt; &lt;li&gt;Xetra (DE)&lt;/li&gt; &lt;li&gt;Duesseldorf (DU)&lt;/li&gt; &lt;li&gt;Hamburg (HM)&lt;/li&gt; &lt;li&gt;Berlin (BE)&lt;/li&gt; &lt;li&gt;Hanover (HA)&lt;/li&gt; &lt;li&gt;Stoxx (SX)&lt;/li&gt; &lt;li&gt;TradeGate (TG)&lt;/li&gt; &lt;li&gt;Zertifikate (SC)&lt;/li&gt; &lt;li&gt;Index&lt;/li&gt; &lt;li&gt;Warrant&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
    * @param symbol Symbol. (required)
    * @param date Date: 2020-04-02. (required)
    * @param limit Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; (required)
    * @param skip Number of ticks to skip. Use this parameter to loop through the entire data. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void stockTick(String symbol, LocalDate date, Long limit, Long skip, Handler<AsyncResult<TickData>> resultHandler) {
        delegate.stockTick(symbol, date, limit, skip, resultHandler);
    }

    /**
    * Tick Data
    * &lt;p&gt;Get historical tick data for global exchanges.&lt;/p&gt;&lt;p&gt;For more historical tick data, you can visit our bulk download page in the Dashboard &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/dashboard/download\&quot;,&gt;here&lt;/a&gt; to speed up the download process.&lt;/p&gt;&lt;table class&#x3D;\&quot;table table-hover\&quot;&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Exchange&lt;/th&gt;       &lt;th&gt;Segment&lt;/th&gt;       &lt;th&gt;Delay&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;US CTA/UTP&lt;/th&gt;       &lt;td&gt;Full SIP&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;TSX&lt;/th&gt;       &lt;td&gt;&lt;ul&gt;&lt;li&gt;TSX&lt;/li&gt;&lt;li&gt;TSX Venture&lt;/li&gt;&lt;li&gt;Index&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;LSE&lt;/th&gt;       &lt;td&gt;&lt;ul&gt;&lt;li&gt;London Stock Exchange (L)&lt;/li&gt;&lt;li&gt;LSE International (L)&lt;/li&gt;&lt;li&gt;LSE European (L)&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;15 minute&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;Euronext&lt;/th&gt;       &lt;td&gt;&lt;ul&gt; &lt;li&gt;Euronext Paris (PA)&lt;/li&gt; &lt;li&gt;Euronext Amsterdam (AS)&lt;/li&gt; &lt;li&gt;Euronext Lisbon (LS)&lt;/li&gt; &lt;li&gt;Euronext Brussels (BR)&lt;/li&gt; &lt;li&gt;Euronext Oslo (OL)&lt;/li&gt; &lt;li&gt;Euronext London (LN)&lt;/li&gt; &lt;li&gt;Euronext Dublin (IR)&lt;/li&gt; &lt;li&gt;Index&lt;/li&gt; &lt;li&gt;Warrant&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;Deutsche Börse&lt;/th&gt;       &lt;td&gt;&lt;ul&gt; &lt;li&gt;Frankfurt (F)&lt;/li&gt; &lt;li&gt;Xetra (DE)&lt;/li&gt; &lt;li&gt;Duesseldorf (DU)&lt;/li&gt; &lt;li&gt;Hamburg (HM)&lt;/li&gt; &lt;li&gt;Berlin (BE)&lt;/li&gt; &lt;li&gt;Hanover (HA)&lt;/li&gt; &lt;li&gt;Stoxx (SX)&lt;/li&gt; &lt;li&gt;TradeGate (TG)&lt;/li&gt; &lt;li&gt;Zertifikate (SC)&lt;/li&gt; &lt;li&gt;Index&lt;/li&gt; &lt;li&gt;Warrant&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
    * @param symbol Symbol. (required)
    * @param date Date: 2020-04-02. (required)
    * @param limit Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; (required)
    * @param skip Number of ticks to skip. Use this parameter to loop through the entire data. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void stockTick(String symbol, LocalDate date, Long limit, Long skip, ApiClient.AuthInfo authInfo, Handler<AsyncResult<TickData>> resultHandler) {
        delegate.stockTick(symbol, date, limit, skip, authInfo, resultHandler);
    }

    /**
    * Tick Data
    * &lt;p&gt;Get historical tick data for global exchanges.&lt;/p&gt;&lt;p&gt;For more historical tick data, you can visit our bulk download page in the Dashboard &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/dashboard/download\&quot;,&gt;here&lt;/a&gt; to speed up the download process.&lt;/p&gt;&lt;table class&#x3D;\&quot;table table-hover\&quot;&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Exchange&lt;/th&gt;       &lt;th&gt;Segment&lt;/th&gt;       &lt;th&gt;Delay&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;US CTA/UTP&lt;/th&gt;       &lt;td&gt;Full SIP&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;TSX&lt;/th&gt;       &lt;td&gt;&lt;ul&gt;&lt;li&gt;TSX&lt;/li&gt;&lt;li&gt;TSX Venture&lt;/li&gt;&lt;li&gt;Index&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;LSE&lt;/th&gt;       &lt;td&gt;&lt;ul&gt;&lt;li&gt;London Stock Exchange (L)&lt;/li&gt;&lt;li&gt;LSE International (L)&lt;/li&gt;&lt;li&gt;LSE European (L)&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;15 minute&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;Euronext&lt;/th&gt;       &lt;td&gt;&lt;ul&gt; &lt;li&gt;Euronext Paris (PA)&lt;/li&gt; &lt;li&gt;Euronext Amsterdam (AS)&lt;/li&gt; &lt;li&gt;Euronext Lisbon (LS)&lt;/li&gt; &lt;li&gt;Euronext Brussels (BR)&lt;/li&gt; &lt;li&gt;Euronext Oslo (OL)&lt;/li&gt; &lt;li&gt;Euronext London (LN)&lt;/li&gt; &lt;li&gt;Euronext Dublin (IR)&lt;/li&gt; &lt;li&gt;Index&lt;/li&gt; &lt;li&gt;Warrant&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;Deutsche Börse&lt;/th&gt;       &lt;td&gt;&lt;ul&gt; &lt;li&gt;Frankfurt (F)&lt;/li&gt; &lt;li&gt;Xetra (DE)&lt;/li&gt; &lt;li&gt;Duesseldorf (DU)&lt;/li&gt; &lt;li&gt;Hamburg (HM)&lt;/li&gt; &lt;li&gt;Berlin (BE)&lt;/li&gt; &lt;li&gt;Hanover (HA)&lt;/li&gt; &lt;li&gt;Stoxx (SX)&lt;/li&gt; &lt;li&gt;TradeGate (TG)&lt;/li&gt; &lt;li&gt;Zertifikate (SC)&lt;/li&gt; &lt;li&gt;Index&lt;/li&gt; &lt;li&gt;Warrant&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
    * @param symbol Symbol. (required)
    * @param date Date: 2020-04-02. (required)
    * @param limit Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; (required)
    * @param skip Number of ticks to skip. Use this parameter to loop through the entire data. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<TickData> rxStockTick(String symbol, LocalDate date, Long limit, Long skip) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.stockTick(symbol, date, limit, skip, fut)
        ));
    }

    /**
    * Tick Data
    * &lt;p&gt;Get historical tick data for global exchanges.&lt;/p&gt;&lt;p&gt;For more historical tick data, you can visit our bulk download page in the Dashboard &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/dashboard/download\&quot;,&gt;here&lt;/a&gt; to speed up the download process.&lt;/p&gt;&lt;table class&#x3D;\&quot;table table-hover\&quot;&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Exchange&lt;/th&gt;       &lt;th&gt;Segment&lt;/th&gt;       &lt;th&gt;Delay&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;US CTA/UTP&lt;/th&gt;       &lt;td&gt;Full SIP&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;TSX&lt;/th&gt;       &lt;td&gt;&lt;ul&gt;&lt;li&gt;TSX&lt;/li&gt;&lt;li&gt;TSX Venture&lt;/li&gt;&lt;li&gt;Index&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;LSE&lt;/th&gt;       &lt;td&gt;&lt;ul&gt;&lt;li&gt;London Stock Exchange (L)&lt;/li&gt;&lt;li&gt;LSE International (L)&lt;/li&gt;&lt;li&gt;LSE European (L)&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;15 minute&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;Euronext&lt;/th&gt;       &lt;td&gt;&lt;ul&gt; &lt;li&gt;Euronext Paris (PA)&lt;/li&gt; &lt;li&gt;Euronext Amsterdam (AS)&lt;/li&gt; &lt;li&gt;Euronext Lisbon (LS)&lt;/li&gt; &lt;li&gt;Euronext Brussels (BR)&lt;/li&gt; &lt;li&gt;Euronext Oslo (OL)&lt;/li&gt; &lt;li&gt;Euronext London (LN)&lt;/li&gt; &lt;li&gt;Euronext Dublin (IR)&lt;/li&gt; &lt;li&gt;Index&lt;/li&gt; &lt;li&gt;Warrant&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;Deutsche Börse&lt;/th&gt;       &lt;td&gt;&lt;ul&gt; &lt;li&gt;Frankfurt (F)&lt;/li&gt; &lt;li&gt;Xetra (DE)&lt;/li&gt; &lt;li&gt;Duesseldorf (DU)&lt;/li&gt; &lt;li&gt;Hamburg (HM)&lt;/li&gt; &lt;li&gt;Berlin (BE)&lt;/li&gt; &lt;li&gt;Hanover (HA)&lt;/li&gt; &lt;li&gt;Stoxx (SX)&lt;/li&gt; &lt;li&gt;TradeGate (TG)&lt;/li&gt; &lt;li&gt;Zertifikate (SC)&lt;/li&gt; &lt;li&gt;Index&lt;/li&gt; &lt;li&gt;Warrant&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
    * @param symbol Symbol. (required)
    * @param date Date: 2020-04-02. (required)
    * @param limit Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; (required)
    * @param skip Number of ticks to skip. Use this parameter to loop through the entire data. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<TickData> rxStockTick(String symbol, LocalDate date, Long limit, Long skip, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.stockTick(symbol, date, limit, skip, authInfo, fut)
        ));
    }
    /**
    * USA Spending
    * Get a list of government&#39;s spending activities from USASpending dataset for public companies. This dataset can help you identify companies that win big government contracts which is extremely important for industries such as Defense, Aerospace, and Education.
    * @param symbol Symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for &lt;code&gt;actionDate&lt;/code&gt; (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for &lt;code&gt;actionDate&lt;/code&gt; (required)
    * @param resultHandler Asynchronous result handler
    */
    public void stockUsaSpending(String symbol, LocalDate from, LocalDate to, Handler<AsyncResult<UsaSpendingResult>> resultHandler) {
        delegate.stockUsaSpending(symbol, from, to, resultHandler);
    }

    /**
    * USA Spending
    * Get a list of government&#39;s spending activities from USASpending dataset for public companies. This dataset can help you identify companies that win big government contracts which is extremely important for industries such as Defense, Aerospace, and Education.
    * @param symbol Symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for &lt;code&gt;actionDate&lt;/code&gt; (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for &lt;code&gt;actionDate&lt;/code&gt; (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void stockUsaSpending(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<UsaSpendingResult>> resultHandler) {
        delegate.stockUsaSpending(symbol, from, to, authInfo, resultHandler);
    }

    /**
    * USA Spending
    * Get a list of government&#39;s spending activities from USASpending dataset for public companies. This dataset can help you identify companies that win big government contracts which is extremely important for industries such as Defense, Aerospace, and Education.
    * @param symbol Symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for &lt;code&gt;actionDate&lt;/code&gt; (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for &lt;code&gt;actionDate&lt;/code&gt; (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<UsaSpendingResult> rxStockUsaSpending(String symbol, LocalDate from, LocalDate to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.stockUsaSpending(symbol, from, to, fut)
        ));
    }

    /**
    * USA Spending
    * Get a list of government&#39;s spending activities from USASpending dataset for public companies. This dataset can help you identify companies that win big government contracts which is extremely important for industries such as Defense, Aerospace, and Education.
    * @param symbol Symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for &lt;code&gt;actionDate&lt;/code&gt; (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for &lt;code&gt;actionDate&lt;/code&gt; (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<UsaSpendingResult> rxStockUsaSpending(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.stockUsaSpending(symbol, from, to, authInfo, fut)
        ));
    }
    /**
    * USPTO Patents
    * List USPTO patents for companies. Limit to 250 records per API call.
    * @param symbol Symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void stockUsptoPatent(String symbol, LocalDate from, LocalDate to, Handler<AsyncResult<UsptoPatentResult>> resultHandler) {
        delegate.stockUsptoPatent(symbol, from, to, resultHandler);
    }

    /**
    * USPTO Patents
    * List USPTO patents for companies. Limit to 250 records per API call.
    * @param symbol Symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void stockUsptoPatent(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<UsptoPatentResult>> resultHandler) {
        delegate.stockUsptoPatent(symbol, from, to, authInfo, resultHandler);
    }

    /**
    * USPTO Patents
    * List USPTO patents for companies. Limit to 250 records per API call.
    * @param symbol Symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<UsptoPatentResult> rxStockUsptoPatent(String symbol, LocalDate from, LocalDate to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.stockUsptoPatent(symbol, from, to, fut)
        ));
    }

    /**
    * USPTO Patents
    * List USPTO patents for companies. Limit to 250 records per API call.
    * @param symbol Symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<UsptoPatentResult> rxStockUsptoPatent(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.stockUsptoPatent(symbol, from, to, authInfo, fut)
        ));
    }
    /**
    * H1-B Visa Application
    * Get a list of H1-B and Permanent visa applications for companies from the DOL. The data is updated quarterly.
    * @param symbol Symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter on the &lt;code&gt;beginDate&lt;/code&gt; column. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter on the &lt;code&gt;beginDate&lt;/code&gt; column. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void stockVisaApplication(String symbol, LocalDate from, LocalDate to, Handler<AsyncResult<VisaApplicationResult>> resultHandler) {
        delegate.stockVisaApplication(symbol, from, to, resultHandler);
    }

    /**
    * H1-B Visa Application
    * Get a list of H1-B and Permanent visa applications for companies from the DOL. The data is updated quarterly.
    * @param symbol Symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter on the &lt;code&gt;beginDate&lt;/code&gt; column. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter on the &lt;code&gt;beginDate&lt;/code&gt; column. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void stockVisaApplication(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<VisaApplicationResult>> resultHandler) {
        delegate.stockVisaApplication(symbol, from, to, authInfo, resultHandler);
    }

    /**
    * H1-B Visa Application
    * Get a list of H1-B and Permanent visa applications for companies from the DOL. The data is updated quarterly.
    * @param symbol Symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter on the &lt;code&gt;beginDate&lt;/code&gt; column. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter on the &lt;code&gt;beginDate&lt;/code&gt; column. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<VisaApplicationResult> rxStockVisaApplication(String symbol, LocalDate from, LocalDate to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.stockVisaApplication(symbol, from, to, fut)
        ));
    }

    /**
    * H1-B Visa Application
    * Get a list of H1-B and Permanent visa applications for companies from the DOL. The data is updated quarterly.
    * @param symbol Symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter on the &lt;code&gt;beginDate&lt;/code&gt; column. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter on the &lt;code&gt;beginDate&lt;/code&gt; column. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<VisaApplicationResult> rxStockVisaApplication(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.stockVisaApplication(symbol, from, to, authInfo, fut)
        ));
    }
    /**
    * Supply Chain Relationships
    * &lt;p&gt;This endpoint provides an overall map of public companies&#39; key customers and suppliers. The data offers a deeper look into a company&#39;s supply chain and how products are created. The data will help investors manage risk, limit exposure or generate alpha-generating ideas and trading insights.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void supplyChainRelationships(String symbol, Handler<AsyncResult<SupplyChainRelationships>> resultHandler) {
        delegate.supplyChainRelationships(symbol, resultHandler);
    }

    /**
    * Supply Chain Relationships
    * &lt;p&gt;This endpoint provides an overall map of public companies&#39; key customers and suppliers. The data offers a deeper look into a company&#39;s supply chain and how products are created. The data will help investors manage risk, limit exposure or generate alpha-generating ideas and trading insights.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void supplyChainRelationships(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SupplyChainRelationships>> resultHandler) {
        delegate.supplyChainRelationships(symbol, authInfo, resultHandler);
    }

    /**
    * Supply Chain Relationships
    * &lt;p&gt;This endpoint provides an overall map of public companies&#39; key customers and suppliers. The data offers a deeper look into a company&#39;s supply chain and how products are created. The data will help investors manage risk, limit exposure or generate alpha-generating ideas and trading insights.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<SupplyChainRelationships> rxSupplyChainRelationships(String symbol) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.supplyChainRelationships(symbol, fut)
        ));
    }

    /**
    * Supply Chain Relationships
    * &lt;p&gt;This endpoint provides an overall map of public companies&#39; key customers and suppliers. The data offers a deeper look into a company&#39;s supply chain and how products are created. The data will help investors manage risk, limit exposure or generate alpha-generating ideas and trading insights.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<SupplyChainRelationships> rxSupplyChainRelationships(String symbol, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.supplyChainRelationships(symbol, authInfo, fut)
        ));
    }
    /**
    * Support/Resistance
    * Get support and resistance levels for a symbol.
    * @param symbol Symbol (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void supportResistance(String symbol, String resolution, Handler<AsyncResult<SupportResistance>> resultHandler) {
        delegate.supportResistance(symbol, resolution, resultHandler);
    }

    /**
    * Support/Resistance
    * Get support and resistance levels for a symbol.
    * @param symbol Symbol (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void supportResistance(String symbol, String resolution, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SupportResistance>> resultHandler) {
        delegate.supportResistance(symbol, resolution, authInfo, resultHandler);
    }

    /**
    * Support/Resistance
    * Get support and resistance levels for a symbol.
    * @param symbol Symbol (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<SupportResistance> rxSupportResistance(String symbol, String resolution) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.supportResistance(symbol, resolution, fut)
        ));
    }

    /**
    * Support/Resistance
    * Get support and resistance levels for a symbol.
    * @param symbol Symbol (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<SupportResistance> rxSupportResistance(String symbol, String resolution, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.supportResistance(symbol, resolution, authInfo, fut)
        ));
    }
    /**
    * Symbol Change
    * Get a list of symbol changes for US-listed, EU-listed, NSE and ASX securities. Limit to 2000 events at a time.
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void symbolChange(String from, String to, Handler<AsyncResult<SymbolChange>> resultHandler) {
        delegate.symbolChange(from, to, resultHandler);
    }

    /**
    * Symbol Change
    * Get a list of symbol changes for US-listed, EU-listed, NSE and ASX securities. Limit to 2000 events at a time.
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void symbolChange(String from, String to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SymbolChange>> resultHandler) {
        delegate.symbolChange(from, to, authInfo, resultHandler);
    }

    /**
    * Symbol Change
    * Get a list of symbol changes for US-listed, EU-listed, NSE and ASX securities. Limit to 2000 events at a time.
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<SymbolChange> rxSymbolChange(String from, String to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.symbolChange(from, to, fut)
        ));
    }

    /**
    * Symbol Change
    * Get a list of symbol changes for US-listed, EU-listed, NSE and ASX securities. Limit to 2000 events at a time.
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<SymbolChange> rxSymbolChange(String from, String to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.symbolChange(from, to, authInfo, fut)
        ));
    }
    /**
    * Symbol Lookup
    * Search for best-matching symbols based on your query. You can input anything from symbol, security&#39;s name to ISIN and Cusip.
    * @param q Query text can be symbol, name, isin, or cusip. (required)
    * @param exchange Exchange limit. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void symbolSearch(String q, String exchange, Handler<AsyncResult<SymbolLookup>> resultHandler) {
        delegate.symbolSearch(q, exchange, resultHandler);
    }

    /**
    * Symbol Lookup
    * Search for best-matching symbols based on your query. You can input anything from symbol, security&#39;s name to ISIN and Cusip.
    * @param q Query text can be symbol, name, isin, or cusip. (required)
    * @param exchange Exchange limit. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void symbolSearch(String q, String exchange, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SymbolLookup>> resultHandler) {
        delegate.symbolSearch(q, exchange, authInfo, resultHandler);
    }

    /**
    * Symbol Lookup
    * Search for best-matching symbols based on your query. You can input anything from symbol, security&#39;s name to ISIN and Cusip.
    * @param q Query text can be symbol, name, isin, or cusip. (required)
    * @param exchange Exchange limit. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<SymbolLookup> rxSymbolSearch(String q, String exchange) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.symbolSearch(q, exchange, fut)
        ));
    }

    /**
    * Symbol Lookup
    * Search for best-matching symbols based on your query. You can input anything from symbol, security&#39;s name to ISIN and Cusip.
    * @param q Query text can be symbol, name, isin, or cusip. (required)
    * @param exchange Exchange limit. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<SymbolLookup> rxSymbolSearch(String q, String exchange, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.symbolSearch(q, exchange, authInfo, fut)
        ));
    }
    /**
    * Technical Indicators
    * Return technical indicator with price data. List of supported indicators can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol symbol (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param from UNIX timestamp. Interval initial value. (required)
    * @param to UNIX timestamp. Interval end value. (required)
    * @param indicator Indicator name. Full list can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. (required)
    * @param indicatorFields Check out &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;this page&lt;/a&gt; to see which indicators and params are supported. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void technicalIndicator(String symbol, String resolution, Long from, Long to, String indicator, Object indicatorFields, Handler<AsyncResult<Object>> resultHandler) {
        delegate.technicalIndicator(symbol, resolution, from, to, indicator, indicatorFields, resultHandler);
    }

    /**
    * Technical Indicators
    * Return technical indicator with price data. List of supported indicators can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol symbol (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param from UNIX timestamp. Interval initial value. (required)
    * @param to UNIX timestamp. Interval end value. (required)
    * @param indicator Indicator name. Full list can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. (required)
    * @param indicatorFields Check out &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;this page&lt;/a&gt; to see which indicators and params are supported. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void technicalIndicator(String symbol, String resolution, Long from, Long to, String indicator, Object indicatorFields, ApiClient.AuthInfo authInfo, Handler<AsyncResult<Object>> resultHandler) {
        delegate.technicalIndicator(symbol, resolution, from, to, indicator, indicatorFields, authInfo, resultHandler);
    }

    /**
    * Technical Indicators
    * Return technical indicator with price data. List of supported indicators can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol symbol (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param from UNIX timestamp. Interval initial value. (required)
    * @param to UNIX timestamp. Interval end value. (required)
    * @param indicator Indicator name. Full list can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. (required)
    * @param indicatorFields Check out &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;this page&lt;/a&gt; to see which indicators and params are supported. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<Object> rxTechnicalIndicator(String symbol, String resolution, Long from, Long to, String indicator, Object indicatorFields) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.technicalIndicator(symbol, resolution, from, to, indicator, indicatorFields, fut)
        ));
    }

    /**
    * Technical Indicators
    * Return technical indicator with price data. List of supported indicators can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol symbol (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param from UNIX timestamp. Interval initial value. (required)
    * @param to UNIX timestamp. Interval end value. (required)
    * @param indicator Indicator name. Full list can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. (required)
    * @param indicatorFields Check out &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;this page&lt;/a&gt; to see which indicators and params are supported. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<Object> rxTechnicalIndicator(String symbol, String resolution, Long from, Long to, String indicator, Object indicatorFields, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.technicalIndicator(symbol, resolution, from, to, indicator, indicatorFields, authInfo, fut)
        ));
    }
    /**
    * Earnings Call Transcripts
    * &lt;p&gt;Get earnings call transcripts, audio and participants&#39; list. Data is available for US, UK, European, Australian and Canadian companies.&lt;p&gt;15+ years of data is available with 220,000+ audio which add up to 7TB in size.&lt;/p&gt;
    * @param id Transcript&#39;s id obtained with &lt;a href&#x3D;\&quot;#transcripts-list\&quot;&gt;Transcripts List endpoint&lt;/a&gt;. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void transcripts(String id, Handler<AsyncResult<EarningsCallTranscripts>> resultHandler) {
        delegate.transcripts(id, resultHandler);
    }

    /**
    * Earnings Call Transcripts
    * &lt;p&gt;Get earnings call transcripts, audio and participants&#39; list. Data is available for US, UK, European, Australian and Canadian companies.&lt;p&gt;15+ years of data is available with 220,000+ audio which add up to 7TB in size.&lt;/p&gt;
    * @param id Transcript&#39;s id obtained with &lt;a href&#x3D;\&quot;#transcripts-list\&quot;&gt;Transcripts List endpoint&lt;/a&gt;. (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void transcripts(String id, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EarningsCallTranscripts>> resultHandler) {
        delegate.transcripts(id, authInfo, resultHandler);
    }

    /**
    * Earnings Call Transcripts
    * &lt;p&gt;Get earnings call transcripts, audio and participants&#39; list. Data is available for US, UK, European, Australian and Canadian companies.&lt;p&gt;15+ years of data is available with 220,000+ audio which add up to 7TB in size.&lt;/p&gt;
    * @param id Transcript&#39;s id obtained with &lt;a href&#x3D;\&quot;#transcripts-list\&quot;&gt;Transcripts List endpoint&lt;/a&gt;. (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<EarningsCallTranscripts> rxTranscripts(String id) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.transcripts(id, fut)
        ));
    }

    /**
    * Earnings Call Transcripts
    * &lt;p&gt;Get earnings call transcripts, audio and participants&#39; list. Data is available for US, UK, European, Australian and Canadian companies.&lt;p&gt;15+ years of data is available with 220,000+ audio which add up to 7TB in size.&lt;/p&gt;
    * @param id Transcript&#39;s id obtained with &lt;a href&#x3D;\&quot;#transcripts-list\&quot;&gt;Transcripts List endpoint&lt;/a&gt;. (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<EarningsCallTranscripts> rxTranscripts(String id, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.transcripts(id, authInfo, fut)
        ));
    }
    /**
    * Earnings Call Transcripts List
    * List earnings call transcripts&#39; metadata. This endpoint is available for US, UK, European, Australian and Canadian companies.
    * @param symbol Company symbol: AAPL. Leave empty to list the latest transcripts (required)
    * @param resultHandler Asynchronous result handler
    */
    public void transcriptsList(String symbol, Handler<AsyncResult<EarningsCallTranscriptsList>> resultHandler) {
        delegate.transcriptsList(symbol, resultHandler);
    }

    /**
    * Earnings Call Transcripts List
    * List earnings call transcripts&#39; metadata. This endpoint is available for US, UK, European, Australian and Canadian companies.
    * @param symbol Company symbol: AAPL. Leave empty to list the latest transcripts (required)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void transcriptsList(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EarningsCallTranscriptsList>> resultHandler) {
        delegate.transcriptsList(symbol, authInfo, resultHandler);
    }

    /**
    * Earnings Call Transcripts List
    * List earnings call transcripts&#39; metadata. This endpoint is available for US, UK, European, Australian and Canadian companies.
    * @param symbol Company symbol: AAPL. Leave empty to list the latest transcripts (required)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<EarningsCallTranscriptsList> rxTranscriptsList(String symbol) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.transcriptsList(symbol, fut)
        ));
    }

    /**
    * Earnings Call Transcripts List
    * List earnings call transcripts&#39; metadata. This endpoint is available for US, UK, European, Australian and Canadian companies.
    * @param symbol Company symbol: AAPL. Leave empty to list the latest transcripts (required)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<EarningsCallTranscriptsList> rxTranscriptsList(String symbol, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.transcriptsList(symbol, authInfo, fut)
        ));
    }
    /**
    * Stock Upgrade/Downgrade
    * Get latest stock upgrade and downgrade.
    * @param symbol Symbol of the company: AAPL. If left blank, the API will return latest stock upgrades/downgrades. (optional)
    * @param from From date: 2000-03-15. (optional)
    * @param to To date: 2020-03-16. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void upgradeDowngrade(String symbol, LocalDate from, LocalDate to, Handler<AsyncResult<List<UpgradeDowngrade>>> resultHandler) {
        delegate.upgradeDowngrade(symbol, from, to, resultHandler);
    }

    /**
    * Stock Upgrade/Downgrade
    * Get latest stock upgrade and downgrade.
    * @param symbol Symbol of the company: AAPL. If left blank, the API will return latest stock upgrades/downgrades. (optional)
    * @param from From date: 2000-03-15. (optional)
    * @param to To date: 2020-03-16. (optional)
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void upgradeDowngrade(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<UpgradeDowngrade>>> resultHandler) {
        delegate.upgradeDowngrade(symbol, from, to, authInfo, resultHandler);
    }

    /**
    * Stock Upgrade/Downgrade
    * Get latest stock upgrade and downgrade.
    * @param symbol Symbol of the company: AAPL. If left blank, the API will return latest stock upgrades/downgrades. (optional)
    * @param from From date: 2000-03-15. (optional)
    * @param to To date: 2020-03-16. (optional)
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<UpgradeDowngrade>> rxUpgradeDowngrade(String symbol, LocalDate from, LocalDate to) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.upgradeDowngrade(symbol, from, to, fut)
        ));
    }

    /**
    * Stock Upgrade/Downgrade
    * Get latest stock upgrade and downgrade.
    * @param symbol Symbol of the company: AAPL. If left blank, the API will return latest stock upgrades/downgrades. (optional)
    * @param from From date: 2000-03-15. (optional)
    * @param to To date: 2020-03-16. (optional)
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<List<UpgradeDowngrade>> rxUpgradeDowngrade(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.upgradeDowngrade(symbol, from, to, authInfo, fut)
        ));
    }

    public static DefaultApi newInstance(bbb.finnhub.client.api.DefaultApi arg) {
        return arg != null ? new DefaultApi(arg) : null;
    }
}
