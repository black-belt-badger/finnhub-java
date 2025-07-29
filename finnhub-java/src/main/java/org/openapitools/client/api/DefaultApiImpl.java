package org.openapitools.client.api;

import org.openapitools.client.model.AIChatBody;
import org.openapitools.client.model.AIChatResponse;
import org.openapitools.client.model.AggregateIndicators;
import org.openapitools.client.model.AirlinePriceIndexData;
import org.openapitools.client.model.BankBranchRes;
import org.openapitools.client.model.BasicFinancials;
import org.openapitools.client.model.BondCandles;
import org.openapitools.client.model.BondProfile;
import org.openapitools.client.model.BondTickData;
import org.openapitools.client.model.BondYieldCurve;
import org.openapitools.client.model.CompanyESG;
import org.openapitools.client.model.CompanyEarningsQualityScore;
import org.openapitools.client.model.CompanyExecutive;
import org.openapitools.client.model.CompanyNews;
import org.openapitools.client.model.CompanyProfile;
import org.openapitools.client.model.CompanyProfile2;
import org.openapitools.client.model.CongressionalTrading;
import org.openapitools.client.model.CountryMetadata;
import org.openapitools.client.model.CovidInfo;
import org.openapitools.client.model.CryptoCandles;
import org.openapitools.client.model.CryptoProfile;
import org.openapitools.client.model.CryptoSymbol;
import org.openapitools.client.model.Dividends;
import org.openapitools.client.model.Dividends2;
import org.openapitools.client.model.ETFsCountryExposure;
import org.openapitools.client.model.ETFsHoldings;
import org.openapitools.client.model.ETFsProfile;
import org.openapitools.client.model.ETFsSectorExposure;
import org.openapitools.client.model.EarningResult;
import org.openapitools.client.model.EarningsCalendar;
import org.openapitools.client.model.EarningsCallLive;
import org.openapitools.client.model.EarningsCallTranscripts;
import org.openapitools.client.model.EarningsCallTranscriptsList;
import org.openapitools.client.model.EarningsEstimates;
import org.openapitools.client.model.EbitEstimates;
import org.openapitools.client.model.EbitdaEstimates;
import org.openapitools.client.model.EconomicCalendar;
import org.openapitools.client.model.EconomicCode;
import org.openapitools.client.model.EconomicData;
import org.openapitools.client.model.FDAComitteeMeeting;
import org.openapitools.client.model.Filing;
import org.openapitools.client.model.FinancialStatements;
import org.openapitools.client.model.FinancialsAsReported;
import org.openapitools.client.model.ForexCandles;
import org.openapitools.client.model.ForexSymbol;
import org.openapitools.client.model.Forexrates;
import org.openapitools.client.model.FundOwnership;
import org.openapitools.client.model.HistoricalCompanyESG;
import org.openapitools.client.model.HistoricalEmployeeCount;
import org.openapitools.client.model.HistoricalMarketCapData;
import org.openapitools.client.model.HistoricalNBBO;
import org.openapitools.client.model.IPOCalendar;
import org.openapitools.client.model.InFilingResponse;
import org.openapitools.client.model.InFilingSearchBody;
import org.openapitools.client.model.IndicesConstituents;
import org.openapitools.client.model.IndicesHistoricalConstituents;
import org.openapitools.client.model.InsiderSentiments;
import org.openapitools.client.model.InsiderTransactions;
import org.openapitools.client.model.InstitutionalOwnership;
import org.openapitools.client.model.InstitutionalPortfolio;
import org.openapitools.client.model.InstitutionalProfile;
import org.openapitools.client.model.InternationalFiling;
import org.openapitools.client.model.InvestmentThemes;
import org.openapitools.client.model.IsinChange;
import org.openapitools.client.model.LastBidAsk;
import org.openapitools.client.model.LobbyingResult;
import java.time.LocalDate;
import org.openapitools.client.model.MarketHoliday;
import org.openapitools.client.model.MarketNews;
import org.openapitools.client.model.MarketStatus;
import org.openapitools.client.model.MutualFundCountryExposure;
import org.openapitools.client.model.MutualFundEet;
import org.openapitools.client.model.MutualFundEetPai;
import org.openapitools.client.model.MutualFundHoldings;
import org.openapitools.client.model.MutualFundProfile;
import org.openapitools.client.model.MutualFundSectorExposure;
import org.openapitools.client.model.NewsSentiment;
import org.openapitools.client.model.Ownership;
import org.openapitools.client.model.PatternRecognition;
import org.openapitools.client.model.PressRelease;
import org.openapitools.client.model.PriceMetrics;
import org.openapitools.client.model.PriceTarget;
import org.openapitools.client.model.Quote;
import org.openapitools.client.model.RecommendationTrend;
import org.openapitools.client.model.RevenueBreakdown;
import org.openapitools.client.model.RevenueBreakdown2;
import org.openapitools.client.model.RevenueEstimates;
import org.openapitools.client.model.SECSentimentAnalysis;
import org.openapitools.client.model.SearchBody;
import org.openapitools.client.model.SearchFilter;
import org.openapitools.client.model.SearchResponse;
import org.openapitools.client.model.SectorMetric;
import org.openapitools.client.model.SimilarityIndex;
import org.openapitools.client.model.SocialSentiment;
import org.openapitools.client.model.Split;
import org.openapitools.client.model.StockCandles;
import org.openapitools.client.model.StockPresentation;
import org.openapitools.client.model.StockSymbol;
import org.openapitools.client.model.SupplyChainRelationships;
import org.openapitools.client.model.SupportResistance;
import org.openapitools.client.model.SymbolChange;
import org.openapitools.client.model.SymbolLookup;
import org.openapitools.client.model.TickData;
import org.openapitools.client.model.UpgradeDowngrade;
import org.openapitools.client.model.UsaSpendingResult;
import org.openapitools.client.model.UsptoPatentResult;
import org.openapitools.client.model.VisaApplicationResult;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.MultiMap;
import io.vertx.core.json.JsonObject;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.*;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public class DefaultApiImpl implements DefaultApi {

    private ApiClient apiClient;

    public DefaultApiImpl() {
        this(null);
    }

    public DefaultApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
    * Aggregate Indicators
    * Get aggregate signal of multiple technical indicators such as MACD, RSI, Moving Average v.v. A full list of indicators can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1MWuy0WuT2yVlxr1KbPdggVygMZtJfunDnhe-C0GEXYM/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
        * @param symbol symbol (required)
        * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void aggregateIndicator(String symbol, String resolution, Handler<AsyncResult<AggregateIndicators>> resultHandler) {
        aggregateIndicator(symbol, resolution, null, resultHandler);
    }

    /**
    * Aggregate Indicators
    * Get aggregate signal of multiple technical indicators such as MACD, RSI, Moving Average v.v. A full list of indicators can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1MWuy0WuT2yVlxr1KbPdggVygMZtJfunDnhe-C0GEXYM/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol symbol (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void aggregateIndicator(String symbol, String resolution, ApiClient.AuthInfo authInfo, Handler<AsyncResult<AggregateIndicators>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling aggregateIndicator"));
            return;
        }
        
        // verify the required parameter 'resolution' is set
        if (resolution == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'resolution' when calling aggregateIndicator"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/scan/technical-indicator";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "resolution", resolution));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<AggregateIndicators> localVarReturnType = new TypeReference<AggregateIndicators>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * AI Copilot
    * &lt;p&gt;Chat with our AI copilot powered by Neyman AI trained on the extensive Finnhub&#39;s global data. You can ask it any finance-related questions just like with other LLM models and receive results in texts and widgets.&lt;/p&gt;
        * @param search Search body (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void aiChat(AIChatBody search, Handler<AsyncResult<AIChatResponse>> resultHandler) {
        aiChat(search, null, resultHandler);
    }

    /**
    * AI Copilot
    * &lt;p&gt;Chat with our AI copilot powered by Neyman AI trained on the extensive Finnhub&#39;s global data. You can ask it any finance-related questions just like with other LLM models and receive results in texts and widgets.&lt;/p&gt;
    * @param search Search body (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void aiChat(AIChatBody search, ApiClient.AuthInfo authInfo, Handler<AsyncResult<AIChatResponse>> resultHandler) {
        Object localVarBody = search;
        
        // create path and map variables
        String localVarPath = "/ai-chat";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<AIChatResponse> localVarReturnType = new TypeReference<AIChatResponse>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        airlinePriceIndex(airline, from, to, null, resultHandler);
    }

    /**
    * Airline Price Index
    * &lt;p&gt;The Flight Ticket Price Index API provides comprehensive data on airline ticket prices, including the average daily ticket price and its percentage change (price index). This data, collected weekly and projected two weeks ahead, aggregates daily prices and indexes from the 50 busiest and largest airports across the USA. The dataset includes detailed information on airlines, dates, and average ticket prices, offering valuable insights for market analysis and pricing strategies.&lt;/p&gt;&lt;p&gt;The price index is calculated as percentage change of average daily ticket price from the previous weekly reading. Raw ticket prices data is available for Enterprise users. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact us&lt;/a&gt; to inquire about the raw price data.&lt;/p&gt;
    * @param airline Filter data by airline. Accepted values: &lt;code&gt;united&lt;/code&gt;,&lt;code&gt;delta&lt;/code&gt;,&lt;code&gt;american_airlines&lt;/code&gt;,&lt;code&gt;southwest&lt;/code&gt;,&lt;code&gt;southern_airways_express&lt;/code&gt;,&lt;code&gt;alaska_airlines&lt;/code&gt;,&lt;code&gt;frontier_airlines&lt;/code&gt;,&lt;code&gt;jetblue_airways&lt;/code&gt;,&lt;code&gt;spirit_airlines&lt;/code&gt;,&lt;code&gt;sun_country_airlines&lt;/code&gt;,&lt;code&gt;breeze_airways&lt;/code&gt;,&lt;code&gt;hawaiian_airlines&lt;/code&gt; (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void airlinePriceIndex(String airline, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<AirlinePriceIndexData>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'airline' is set
        if (airline == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'airline' when calling airlinePriceIndex"));
            return;
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'from' when calling airlinePriceIndex"));
            return;
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'to' when calling airlinePriceIndex"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/airline/price-index";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "airline", airline));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<AirlinePriceIndexData> localVarReturnType = new TypeReference<AirlinePriceIndexData>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Bank Branch List
    * Retrieve list of US bank branches information for a given symbol.
        * @param symbol Symbol. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void bankBranch(Object symbol, Handler<AsyncResult<BankBranchRes>> resultHandler) {
        bankBranch(symbol, null, resultHandler);
    }

    /**
    * Bank Branch List
    * Retrieve list of US bank branches information for a given symbol.
    * @param symbol Symbol. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void bankBranch(Object symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<BankBranchRes>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling bankBranch"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/bank-branch";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<BankBranchRes> localVarReturnType = new TypeReference<BankBranchRes>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        bondPrice(isin, from, to, null, resultHandler);
    }

    /**
    * Bond price data
    * &lt;p&gt;Get bond&#39;s price data. The following datasets are supported:&lt;/p&gt;&lt;table class&#x3D;\&quot;table table-hover\&quot;&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Exchange&lt;/th&gt;       &lt;th&gt;Segment&lt;/th&gt;       &lt;th&gt;Delay&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;   &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;US Government Bonds&lt;/th&gt;       &lt;td&gt;Government Bonds&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;BTDS: US Corporate Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;144A Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
    * @param isin ISIN. (required)
    * @param from UNIX timestamp. Interval initial value. (required)
    * @param to UNIX timestamp. Interval end value. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void bondPrice(String isin, Long from, Long to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<BondCandles>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'isin' is set
        if (isin == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'isin' when calling bondPrice"));
            return;
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'from' when calling bondPrice"));
            return;
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'to' when calling bondPrice"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/bond/price";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "isin", isin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<BondCandles> localVarReturnType = new TypeReference<BondCandles>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        bondProfile(isin, cusip, figi, null, resultHandler);
    }

    /**
    * Bond Profile
    * Get general information of a bond. You can query by FIGI, ISIN or CUSIP. A list of supported bonds can be found &lt;a href&#x3D;\&quot;/api/v1/bond/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param isin ISIN (optional)
    * @param cusip CUSIP (optional)
    * @param figi FIGI (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void bondProfile(String isin, String cusip, String figi, ApiClient.AuthInfo authInfo, Handler<AsyncResult<BondProfile>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/bond/profile";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "isin", isin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cusip", cusip));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "figi", figi));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<BondProfile> localVarReturnType = new TypeReference<BondProfile>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        bondTick(isin, date, limit, skip, exchange, null, resultHandler);
    }

    /**
    * Bond Tick Data
    * &lt;p&gt;Get trade-level data for bonds. The following datasets are supported:&lt;/p&gt;&lt;table class&#x3D;\&quot;table table-hover\&quot;&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Exchange&lt;/th&gt;       &lt;th&gt;Segment&lt;/th&gt;       &lt;th&gt;Delay&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;BTDS: US Corporate Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;144A Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
    * @param isin ISIN. (required)
    * @param date Date: 2020-04-02. (required)
    * @param limit Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; (required)
    * @param skip Number of ticks to skip. Use this parameter to loop through the entire data. (required)
    * @param exchange Currently support the following values: &lt;code&gt;trace&lt;/code&gt;. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void bondTick(String isin, LocalDate date, Long limit, Long skip, String exchange, ApiClient.AuthInfo authInfo, Handler<AsyncResult<BondTickData>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'isin' is set
        if (isin == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'isin' when calling bondTick"));
            return;
        }
        
        // verify the required parameter 'date' is set
        if (date == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'date' when calling bondTick"));
            return;
        }
        
        // verify the required parameter 'limit' is set
        if (limit == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'limit' when calling bondTick"));
            return;
        }
        
        // verify the required parameter 'skip' is set
        if (skip == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'skip' when calling bondTick"));
            return;
        }
        
        // verify the required parameter 'exchange' is set
        if (exchange == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'exchange' when calling bondTick"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/bond/tick";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "isin", isin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "skip", skip));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "exchange", exchange));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<BondTickData> localVarReturnType = new TypeReference<BondTickData>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Bond Yield Curve
    * Get yield curve data for Treasury bonds.
        * @param code Bond&#39;s code. You can find the list of supported code &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1iA-lM0Kht7lsQZ7Uu_s6r2i1BbQNUNO9eGkO5-zglHg/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener\&quot;&gt;here&lt;/a&gt;. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void bondYieldCurve(String code, Handler<AsyncResult<BondYieldCurve>> resultHandler) {
        bondYieldCurve(code, null, resultHandler);
    }

    /**
    * Bond Yield Curve
    * Get yield curve data for Treasury bonds.
    * @param code Bond&#39;s code. You can find the list of supported code &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1iA-lM0Kht7lsQZ7Uu_s6r2i1BbQNUNO9eGkO5-zglHg/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener\&quot;&gt;here&lt;/a&gt;. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void bondYieldCurve(String code, ApiClient.AuthInfo authInfo, Handler<AsyncResult<BondYieldCurve>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'code' is set
        if (code == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'code' when calling bondYieldCurve"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/bond/yield-curve";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "code", code));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<BondYieldCurve> localVarReturnType = new TypeReference<BondYieldCurve>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Basic Financials
    * Get company basic financials such as margin, P/E ratio, 52-week high/low etc.
        * @param symbol Symbol of the company: AAPL. (required)
        * @param metric Metric type. Can be 1 of the following values &lt;code&gt;all&lt;/code&gt; (required)
    * @param resultHandler Asynchronous result handler
    */
    public void companyBasicFinancials(String symbol, String metric, Handler<AsyncResult<BasicFinancials>> resultHandler) {
        companyBasicFinancials(symbol, metric, null, resultHandler);
    }

    /**
    * Basic Financials
    * Get company basic financials such as margin, P/E ratio, 52-week high/low etc.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param metric Metric type. Can be 1 of the following values &lt;code&gt;all&lt;/code&gt; (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void companyBasicFinancials(String symbol, String metric, ApiClient.AuthInfo authInfo, Handler<AsyncResult<BasicFinancials>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling companyBasicFinancials"));
            return;
        }
        
        // verify the required parameter 'metric' is set
        if (metric == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'metric' when calling companyBasicFinancials"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/metric";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "metric", metric));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<BasicFinancials> localVarReturnType = new TypeReference<BasicFinancials>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Earnings Surprises
    * Get company historical quarterly earnings surprise going back to 2000.
        * @param symbol Symbol of the company: AAPL. (required)
        * @param limit Limit number of period returned. Leave blank to get the full history. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void companyEarnings(String symbol, Long limit, Handler<AsyncResult<List<EarningResult>>> resultHandler) {
        companyEarnings(symbol, limit, null, resultHandler);
    }

    /**
    * Earnings Surprises
    * Get company historical quarterly earnings surprise going back to 2000.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param limit Limit number of period returned. Leave blank to get the full history. (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void companyEarnings(String symbol, Long limit, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<EarningResult>>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling companyEarnings"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/earnings";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<List<EarningResult>> localVarReturnType = new TypeReference<List<EarningResult>>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Company Earnings Quality Score
    * &lt;p&gt;This endpoint provides Earnings Quality Score for global companies.&lt;/p&gt;&lt;p&gt; Earnings quality refers to the extent to which current earnings predict future earnings. \&quot;High-quality\&quot; earnings are expected to persist, while \&quot;low-quality\&quot; earnings do not. A higher score means a higher earnings quality&lt;/p&gt;&lt;p&gt;Finnhub uses a proprietary model which takes into consideration 4 criteria:&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: unset; margin-left: 30px;\&quot;&gt;&lt;li&gt;Profitability&lt;/li&gt;&lt;li&gt;Growth&lt;/li&gt;&lt;li&gt;Cash Generation &amp; Capital Allocation&lt;/li&gt;&lt;li&gt;Leverage&lt;/li&gt;&lt;/ul&gt;&lt;br/&gt;&lt;p&gt;We then compare the metrics of each company in each category against its peers in the same industry to gauge how quality its earnings is.&lt;/p&gt;
        * @param symbol Symbol. (required)
        * @param freq Frequency. Currently support &lt;code&gt;annual&lt;/code&gt; and &lt;code&gt;quarterly&lt;/code&gt; (required)
    * @param resultHandler Asynchronous result handler
    */
    public void companyEarningsQualityScore(String symbol, String freq, Handler<AsyncResult<CompanyEarningsQualityScore>> resultHandler) {
        companyEarningsQualityScore(symbol, freq, null, resultHandler);
    }

    /**
    * Company Earnings Quality Score
    * &lt;p&gt;This endpoint provides Earnings Quality Score for global companies.&lt;/p&gt;&lt;p&gt; Earnings quality refers to the extent to which current earnings predict future earnings. \&quot;High-quality\&quot; earnings are expected to persist, while \&quot;low-quality\&quot; earnings do not. A higher score means a higher earnings quality&lt;/p&gt;&lt;p&gt;Finnhub uses a proprietary model which takes into consideration 4 criteria:&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: unset; margin-left: 30px;\&quot;&gt;&lt;li&gt;Profitability&lt;/li&gt;&lt;li&gt;Growth&lt;/li&gt;&lt;li&gt;Cash Generation &amp; Capital Allocation&lt;/li&gt;&lt;li&gt;Leverage&lt;/li&gt;&lt;/ul&gt;&lt;br/&gt;&lt;p&gt;We then compare the metrics of each company in each category against its peers in the same industry to gauge how quality its earnings is.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param freq Frequency. Currently support &lt;code&gt;annual&lt;/code&gt; and &lt;code&gt;quarterly&lt;/code&gt; (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void companyEarningsQualityScore(String symbol, String freq, ApiClient.AuthInfo authInfo, Handler<AsyncResult<CompanyEarningsQualityScore>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling companyEarningsQualityScore"));
            return;
        }
        
        // verify the required parameter 'freq' is set
        if (freq == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'freq' when calling companyEarningsQualityScore"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/earnings-quality-score";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "freq", freq));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<CompanyEarningsQualityScore> localVarReturnType = new TypeReference<CompanyEarningsQualityScore>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * EBIT Estimates
    * Get company&#39;s ebit estimates.
        * @param symbol Symbol of the company: AAPL. (required)
        * @param freq Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void companyEbitEstimates(String symbol, String freq, Handler<AsyncResult<EbitEstimates>> resultHandler) {
        companyEbitEstimates(symbol, freq, null, resultHandler);
    }

    /**
    * EBIT Estimates
    * Get company&#39;s ebit estimates.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param freq Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void companyEbitEstimates(String symbol, String freq, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EbitEstimates>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling companyEbitEstimates"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/ebit-estimate";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "freq", freq));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<EbitEstimates> localVarReturnType = new TypeReference<EbitEstimates>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * EBITDA Estimates
    * Get company&#39;s ebitda estimates.
        * @param symbol Symbol of the company: AAPL. (required)
        * @param freq Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void companyEbitdaEstimates(String symbol, String freq, Handler<AsyncResult<EbitdaEstimates>> resultHandler) {
        companyEbitdaEstimates(symbol, freq, null, resultHandler);
    }

    /**
    * EBITDA Estimates
    * Get company&#39;s ebitda estimates.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param freq Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void companyEbitdaEstimates(String symbol, String freq, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EbitdaEstimates>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling companyEbitdaEstimates"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/ebitda-estimate";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "freq", freq));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<EbitdaEstimates> localVarReturnType = new TypeReference<EbitdaEstimates>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Earnings Estimates
    * Get company&#39;s EPS estimates.
        * @param symbol Symbol of the company: AAPL. (required)
        * @param freq Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void companyEpsEstimates(String symbol, String freq, Handler<AsyncResult<EarningsEstimates>> resultHandler) {
        companyEpsEstimates(symbol, freq, null, resultHandler);
    }

    /**
    * Earnings Estimates
    * Get company&#39;s EPS estimates.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param freq Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void companyEpsEstimates(String symbol, String freq, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EarningsEstimates>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling companyEpsEstimates"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/eps-estimate";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "freq", freq));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<EarningsEstimates> localVarReturnType = new TypeReference<EarningsEstimates>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Company ESG Scores
    * &lt;p&gt;This endpoint provides the latest ESG scores and important indicators for 7000+ global companies. The data is collected through company&#39;s public ESG disclosure and public sources.&lt;/p&gt;&lt;p&gt;Our ESG scoring models takes into account more than 150 different inputs to calculate the level of ESG risks and how well a company is managing them. A higher score means lower ESG risk or better ESG management. ESG scores are in the the range of 0-100. Some key indicators might contain letter-grade score from C- to A+ with C- is the lowest score and A+ is the highest score.&lt;/p&gt;
        * @param symbol Symbol. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void companyEsgScore(String symbol, Handler<AsyncResult<CompanyESG>> resultHandler) {
        companyEsgScore(symbol, null, resultHandler);
    }

    /**
    * Company ESG Scores
    * &lt;p&gt;This endpoint provides the latest ESG scores and important indicators for 7000+ global companies. The data is collected through company&#39;s public ESG disclosure and public sources.&lt;/p&gt;&lt;p&gt;Our ESG scoring models takes into account more than 150 different inputs to calculate the level of ESG risks and how well a company is managing them. A higher score means lower ESG risk or better ESG management. ESG scores are in the the range of 0-100. Some key indicators might contain letter-grade score from C- to A+ with C- is the lowest score and A+ is the highest score.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void companyEsgScore(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<CompanyESG>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling companyEsgScore"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/esg";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<CompanyESG> localVarReturnType = new TypeReference<CompanyESG>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Company Executive
    * Get a list of company&#39;s executives and members of the Board.
        * @param symbol Symbol of the company: AAPL. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void companyExecutive(String symbol, Handler<AsyncResult<CompanyExecutive>> resultHandler) {
        companyExecutive(symbol, null, resultHandler);
    }

    /**
    * Company Executive
    * Get a list of company&#39;s executives and members of the Board.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void companyExecutive(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<CompanyExecutive>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling companyExecutive"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/executive";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<CompanyExecutive> localVarReturnType = new TypeReference<CompanyExecutive>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Historical ESG Scores
    * &lt;p&gt;This endpoint provides historical ESG scores and important indicators for 7000+ global companies. The data is collected through company&#39;s public ESG disclosure and public sources.&lt;/p&gt;&lt;p&gt;Our ESG scoring models takes into account more than 150 different inputs to calculate the level of ESG risks and how well a company is managing them. A higher score means lower ESG risk or better ESG management. ESG scores are in the the range of 0-100. Some key indicators might contain letter-grade score from C- to A+ with C- is the lowest score and A+ is the highest score.&lt;/p&gt;
        * @param symbol Symbol. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void companyHistoricalEsgScore(String symbol, Handler<AsyncResult<HistoricalCompanyESG>> resultHandler) {
        companyHistoricalEsgScore(symbol, null, resultHandler);
    }

    /**
    * Historical ESG Scores
    * &lt;p&gt;This endpoint provides historical ESG scores and important indicators for 7000+ global companies. The data is collected through company&#39;s public ESG disclosure and public sources.&lt;/p&gt;&lt;p&gt;Our ESG scoring models takes into account more than 150 different inputs to calculate the level of ESG risks and how well a company is managing them. A higher score means lower ESG risk or better ESG management. ESG scores are in the the range of 0-100. Some key indicators might contain letter-grade score from C- to A+ with C- is the lowest score and A+ is the highest score.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void companyHistoricalEsgScore(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<HistoricalCompanyESG>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling companyHistoricalEsgScore"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/historical-esg";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<HistoricalCompanyESG> localVarReturnType = new TypeReference<HistoricalCompanyESG>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        companyNews(symbol, from, to, null, resultHandler);
    }

    /**
    * Company News
    * List latest company news by symbol. This endpoint is only available for North American companies.
    * @param symbol Company symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void companyNews(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<CompanyNews>>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling companyNews"));
            return;
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'from' when calling companyNews"));
            return;
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'to' when calling companyNews"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/company-news";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<List<CompanyNews>> localVarReturnType = new TypeReference<List<CompanyNews>>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Peers
    * Get company peers. Return a list of peers operating in the same country and sector/industry.
        * @param symbol Symbol of the company: AAPL. (required)
        * @param grouping Specify the grouping criteria for choosing peers.Supporter values: &lt;code&gt;sector&lt;/code&gt;, &lt;code&gt;industry&lt;/code&gt;, &lt;code&gt;subIndustry&lt;/code&gt;. Default to &lt;code&gt;subIndustry&lt;/code&gt;. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void companyPeers(String symbol, String grouping, Handler<AsyncResult<List<String>>> resultHandler) {
        companyPeers(symbol, grouping, null, resultHandler);
    }

    /**
    * Peers
    * Get company peers. Return a list of peers operating in the same country and sector/industry.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param grouping Specify the grouping criteria for choosing peers.Supporter values: &lt;code&gt;sector&lt;/code&gt;, &lt;code&gt;industry&lt;/code&gt;, &lt;code&gt;subIndustry&lt;/code&gt;. Default to &lt;code&gt;subIndustry&lt;/code&gt;. (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void companyPeers(String symbol, String grouping, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<String>>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling companyPeers"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/peers";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "grouping", grouping));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<List<String>> localVarReturnType = new TypeReference<List<String>>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        companyProfile(symbol, isin, cusip, null, resultHandler);
    }

    /**
    * Company Profile
    * Get general information of a company. You can query by symbol, ISIN or CUSIP
    * @param symbol Symbol of the company: AAPL e.g. (optional)
    * @param isin ISIN (optional)
    * @param cusip CUSIP (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void companyProfile(String symbol, String isin, String cusip, ApiClient.AuthInfo authInfo, Handler<AsyncResult<CompanyProfile>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/stock/profile";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "isin", isin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cusip", cusip));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<CompanyProfile> localVarReturnType = new TypeReference<CompanyProfile>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        companyProfile2(symbol, isin, cusip, null, resultHandler);
    }

    /**
    * Company Profile 2
    * Get general information of a company. You can query by symbol, ISIN or CUSIP. This is the free version of &lt;a href&#x3D;\&quot;#company-profile\&quot;&gt;Company Profile&lt;/a&gt;.
    * @param symbol Symbol of the company: AAPL e.g. (optional)
    * @param isin ISIN (optional)
    * @param cusip CUSIP (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void companyProfile2(String symbol, String isin, String cusip, ApiClient.AuthInfo authInfo, Handler<AsyncResult<CompanyProfile2>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/stock/profile2";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "isin", isin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cusip", cusip));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<CompanyProfile2> localVarReturnType = new TypeReference<CompanyProfile2>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Revenue Estimates
    * Get company&#39;s revenue estimates.
        * @param symbol Symbol of the company: AAPL. (required)
        * @param freq Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void companyRevenueEstimates(String symbol, String freq, Handler<AsyncResult<RevenueEstimates>> resultHandler) {
        companyRevenueEstimates(symbol, freq, null, resultHandler);
    }

    /**
    * Revenue Estimates
    * Get company&#39;s revenue estimates.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param freq Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void companyRevenueEstimates(String symbol, String freq, ApiClient.AuthInfo authInfo, Handler<AsyncResult<RevenueEstimates>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling companyRevenueEstimates"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/revenue-estimate";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "freq", freq));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<RevenueEstimates> localVarReturnType = new TypeReference<RevenueEstimates>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        congressionalTrading(symbol, from, to, null, resultHandler);
    }

    /**
    * Congressional Trading
    * Get stock trades data disclosed by members of congress.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void congressionalTrading(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<CongressionalTrading>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling congressionalTrading"));
            return;
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'from' when calling congressionalTrading"));
            return;
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'to' when calling congressionalTrading"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/congressional-trading";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<CongressionalTrading> localVarReturnType = new TypeReference<CongressionalTrading>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Country Metadata
    * List all countries and metadata.
    * @param resultHandler Asynchronous result handler
    */
    public void country(Handler<AsyncResult<List<CountryMetadata>>> resultHandler) {
        country(null, resultHandler);
    }

    /**
    * Country Metadata
    * List all countries and metadata.
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void country(ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<CountryMetadata>>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/country";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<List<CountryMetadata>> localVarReturnType = new TypeReference<List<CountryMetadata>>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * COVID-19
    * Get real-time updates on the number of COVID-19 (Corona virus) cases in the US with a state-by-state breakdown. Data is sourced from CDC and reputable sources. You can also access this API &lt;a href&#x3D;\&quot;https://rapidapi.com/Finnhub/api/finnhub-real-time-covid-19\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;nofollow\&quot;&gt;here&lt;/a&gt;
    * @param resultHandler Asynchronous result handler
    */
    public void covid19(Handler<AsyncResult<List<CovidInfo>>> resultHandler) {
        covid19(null, resultHandler);
    }

    /**
    * COVID-19
    * Get real-time updates on the number of COVID-19 (Corona virus) cases in the US with a state-by-state breakdown. Data is sourced from CDC and reputable sources. You can also access this API &lt;a href&#x3D;\&quot;https://rapidapi.com/Finnhub/api/finnhub-real-time-covid-19\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;nofollow\&quot;&gt;here&lt;/a&gt;
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void covid19(ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<CovidInfo>>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/covid19/us";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<List<CovidInfo>> localVarReturnType = new TypeReference<List<CovidInfo>>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        cryptoCandles(symbol, resolution, from, to, null, resultHandler);
    }

    /**
    * Crypto Candles
    * Get candlestick data for crypto symbols.
    * @param symbol Use symbol returned in &lt;code&gt;/crypto/symbol&lt;/code&gt; endpoint for this field. (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param from UNIX timestamp. Interval initial value. (required)
    * @param to UNIX timestamp. Interval end value. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void cryptoCandles(String symbol, String resolution, Long from, Long to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<CryptoCandles>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling cryptoCandles"));
            return;
        }
        
        // verify the required parameter 'resolution' is set
        if (resolution == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'resolution' when calling cryptoCandles"));
            return;
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'from' when calling cryptoCandles"));
            return;
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'to' when calling cryptoCandles"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/crypto/candle";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "resolution", resolution));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<CryptoCandles> localVarReturnType = new TypeReference<CryptoCandles>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Crypto Exchanges
    * List supported crypto exchanges
    * @param resultHandler Asynchronous result handler
    */
    public void cryptoExchanges(Handler<AsyncResult<List<String>>> resultHandler) {
        cryptoExchanges(null, resultHandler);
    }

    /**
    * Crypto Exchanges
    * List supported crypto exchanges
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void cryptoExchanges(ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<String>>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/crypto/exchange";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<List<String>> localVarReturnType = new TypeReference<List<String>>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Crypto Profile
    * Get crypto&#39;s profile.
        * @param symbol Crypto symbol such as BTC or ETH. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void cryptoProfile(String symbol, Handler<AsyncResult<CryptoProfile>> resultHandler) {
        cryptoProfile(symbol, null, resultHandler);
    }

    /**
    * Crypto Profile
    * Get crypto&#39;s profile.
    * @param symbol Crypto symbol such as BTC or ETH. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void cryptoProfile(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<CryptoProfile>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling cryptoProfile"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/crypto/profile";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<CryptoProfile> localVarReturnType = new TypeReference<CryptoProfile>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Crypto Symbol
    * List supported crypto symbols by exchange
        * @param exchange Exchange you want to get the list of symbols from. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void cryptoSymbols(String exchange, Handler<AsyncResult<List<CryptoSymbol>>> resultHandler) {
        cryptoSymbols(exchange, null, resultHandler);
    }

    /**
    * Crypto Symbol
    * List supported crypto symbols by exchange
    * @param exchange Exchange you want to get the list of symbols from. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void cryptoSymbols(String exchange, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<CryptoSymbol>>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'exchange' is set
        if (exchange == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'exchange' when calling cryptoSymbols"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/crypto/symbol";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "exchange", exchange));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<List<CryptoSymbol>> localVarReturnType = new TypeReference<List<CryptoSymbol>>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        earningsCalendar(from, to, symbol, international, null, resultHandler);
    }

    /**
    * Earnings Calendar
    * Get historical and coming earnings release. EPS and Revenue in this endpoint are non-GAAP, which means they are adjusted to exclude some one-time or unusual items. This is the same data investors usually react to and talked about on the media. Estimates are sourced from both sell-side and buy-side analysts.
    * @param from From date: 2020-03-15. (optional)
    * @param to To date: 2020-03-16. (optional)
    * @param symbol Filter by symbol: AAPL. (optional)
    * @param international Set to &lt;code&gt;true&lt;/code&gt; to include international markets. Default value is &lt;code&gt;false&lt;/code&gt; (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void earningsCalendar(LocalDate from, LocalDate to, String symbol, Boolean international, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EarningsCalendar>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/calendar/earnings";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "international", international));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<EarningsCalendar> localVarReturnType = new TypeReference<EarningsCalendar>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        earningsCallLive(from, to, symbol, null, resultHandler);
    }

    /**
    * Earnings Call Audio Live
    * &lt;p&gt;Stream live earnings calls with data provided in the calendar. The data will be available in m3u8 format. mp3 files will be available once the calls finish in the &lt;code&gt;recording&lt;/code&gt; field.&lt;/p&gt;
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param symbol Filter by symbol: AAPL. (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void earningsCallLive(LocalDate from, LocalDate to, String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EarningsCallLive>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/stock/earnings-call-live";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<EarningsCallLive> localVarReturnType = new TypeReference<EarningsCallLive>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Economic Calendar
    * &lt;p&gt;Get recent and upcoming economic releases.&lt;/p&gt;&lt;p&gt;Historical events and surprises are available for Enterprise clients.&lt;/p&gt;
        * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
        * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void economicCalendar(LocalDate from, LocalDate to, Handler<AsyncResult<EconomicCalendar>> resultHandler) {
        economicCalendar(from, to, null, resultHandler);
    }

    /**
    * Economic Calendar
    * &lt;p&gt;Get recent and upcoming economic releases.&lt;/p&gt;&lt;p&gt;Historical events and surprises are available for Enterprise clients.&lt;/p&gt;
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void economicCalendar(LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EconomicCalendar>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/calendar/economic";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<EconomicCalendar> localVarReturnType = new TypeReference<EconomicCalendar>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Economic Code
    * List codes of supported economic data.
    * @param resultHandler Asynchronous result handler
    */
    public void economicCode(Handler<AsyncResult<List<EconomicCode>>> resultHandler) {
        economicCode(null, resultHandler);
    }

    /**
    * Economic Code
    * List codes of supported economic data.
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void economicCode(ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<EconomicCode>>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/economic/code";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<List<EconomicCode>> localVarReturnType = new TypeReference<List<EconomicCode>>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Economic Data
    * Get economic data.
        * @param code Economic code. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void economicData(String code, Handler<AsyncResult<EconomicData>> resultHandler) {
        economicData(code, null, resultHandler);
    }

    /**
    * Economic Data
    * Get economic data.
    * @param code Economic code. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void economicData(String code, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EconomicData>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'code' is set
        if (code == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'code' when calling economicData"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/economic";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "code", code));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<EconomicData> localVarReturnType = new TypeReference<EconomicData>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * ETFs Country Exposure
    * Get ETF country exposure data.
        * @param symbol ETF symbol. (optional)
        * @param isin ETF isin. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void etfsCountryExposure(String symbol, String isin, Handler<AsyncResult<ETFsCountryExposure>> resultHandler) {
        etfsCountryExposure(symbol, isin, null, resultHandler);
    }

    /**
    * ETFs Country Exposure
    * Get ETF country exposure data.
    * @param symbol ETF symbol. (optional)
    * @param isin ETF isin. (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void etfsCountryExposure(String symbol, String isin, ApiClient.AuthInfo authInfo, Handler<AsyncResult<ETFsCountryExposure>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/etf/country";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "isin", isin));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<ETFsCountryExposure> localVarReturnType = new TypeReference<ETFsCountryExposure>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        etfsHoldings(symbol, isin, skip, date, null, resultHandler);
    }

    /**
    * ETFs Holdings
    * Get full ETF holdings/constituents. This endpoint has global coverage. Widget only shows top 10 holdings. A list of supported ETFs can be found &lt;a href&#x3D;\&quot;/api/v1/etf/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol ETF symbol. (optional)
    * @param isin ETF isin. (optional)
    * @param skip Skip the first n results. You can use this parameter to query historical constituents data. The latest result is returned if skip&#x3D;0 or not set. (optional)
    * @param date Query holdings by date. You can use either this param or &lt;code&gt;skip&lt;/code&gt; param, not both. (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void etfsHoldings(String symbol, String isin, Long skip, String date, ApiClient.AuthInfo authInfo, Handler<AsyncResult<ETFsHoldings>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/etf/holdings";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "isin", isin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "skip", skip));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<ETFsHoldings> localVarReturnType = new TypeReference<ETFsHoldings>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * ETFs Profile
    * Get ETF profile information. This endpoint has global coverage. A list of supported ETFs can be found &lt;a href&#x3D;\&quot;/api/v1/etf/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
        * @param symbol ETF symbol. (optional)
        * @param isin ETF isin. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void etfsProfile(String symbol, String isin, Handler<AsyncResult<ETFsProfile>> resultHandler) {
        etfsProfile(symbol, isin, null, resultHandler);
    }

    /**
    * ETFs Profile
    * Get ETF profile information. This endpoint has global coverage. A list of supported ETFs can be found &lt;a href&#x3D;\&quot;/api/v1/etf/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol ETF symbol. (optional)
    * @param isin ETF isin. (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void etfsProfile(String symbol, String isin, ApiClient.AuthInfo authInfo, Handler<AsyncResult<ETFsProfile>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/etf/profile";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "isin", isin));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<ETFsProfile> localVarReturnType = new TypeReference<ETFsProfile>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * ETFs Sector Exposure
    * Get ETF sector exposure data.
        * @param symbol ETF symbol. (optional)
        * @param isin ETF isin. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void etfsSectorExposure(String symbol, String isin, Handler<AsyncResult<ETFsSectorExposure>> resultHandler) {
        etfsSectorExposure(symbol, isin, null, resultHandler);
    }

    /**
    * ETFs Sector Exposure
    * Get ETF sector exposure data.
    * @param symbol ETF symbol. (optional)
    * @param isin ETF isin. (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void etfsSectorExposure(String symbol, String isin, ApiClient.AuthInfo authInfo, Handler<AsyncResult<ETFsSectorExposure>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/etf/sector";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "isin", isin));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<ETFsSectorExposure> localVarReturnType = new TypeReference<ETFsSectorExposure>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * FDA Committee Meeting Calendar
    * FDA&#39;s advisory committees are established to provide functions which support the agency&#39;s mission of protecting and promoting the public health, while meeting the requirements set forth in the Federal Advisory Committee Act. Committees are either mandated by statute or established at the discretion of the Department of Health and Human Services. Each committee is subject to renewal at two-year intervals unless the committee charter states otherwise.
    * @param resultHandler Asynchronous result handler
    */
    public void fdaCommitteeMeetingCalendar(Handler<AsyncResult<List<FDAComitteeMeeting>>> resultHandler) {
        fdaCommitteeMeetingCalendar(null, resultHandler);
    }

    /**
    * FDA Committee Meeting Calendar
    * FDA&#39;s advisory committees are established to provide functions which support the agency&#39;s mission of protecting and promoting the public health, while meeting the requirements set forth in the Federal Advisory Committee Act. Committees are either mandated by statute or established at the discretion of the Department of Health and Human Services. Each committee is subject to renewal at two-year intervals unless the committee charter states otherwise.
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void fdaCommitteeMeetingCalendar(ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<FDAComitteeMeeting>>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/fda-advisory-committee-calendar";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<List<FDAComitteeMeeting>> localVarReturnType = new TypeReference<List<FDAComitteeMeeting>>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        filings(symbol, cik, accessNumber, form, from, to, null, resultHandler);
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
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void filings(String symbol, String cik, String accessNumber, String form, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<Filing>>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/stock/filings";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cik", cik));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessNumber", accessNumber));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "form", form));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<List<Filing>> localVarReturnType = new TypeReference<List<Filing>>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * SEC Sentiment Analysis
    * Get sentiment analysis of 10-K and 10-Q filings from SEC. An abnormal increase in the number of positive/negative words in filings can signal a significant change in the company&#39;s stock price in the upcoming 4 quarters. We make use of &lt;a href&#x3D; \&quot;https://sraf.nd.edu/textual-analysis/resources/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Loughran and McDonald Sentiment Word Lists&lt;/a&gt; to calculate the sentiment for each filing.
        * @param accessNumber Access number of a specific report you want to retrieve data from. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void filingsSentiment(String accessNumber, Handler<AsyncResult<SECSentimentAnalysis>> resultHandler) {
        filingsSentiment(accessNumber, null, resultHandler);
    }

    /**
    * SEC Sentiment Analysis
    * Get sentiment analysis of 10-K and 10-Q filings from SEC. An abnormal increase in the number of positive/negative words in filings can signal a significant change in the company&#39;s stock price in the upcoming 4 quarters. We make use of &lt;a href&#x3D; \&quot;https://sraf.nd.edu/textual-analysis/resources/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Loughran and McDonald Sentiment Word Lists&lt;/a&gt; to calculate the sentiment for each filing.
    * @param accessNumber Access number of a specific report you want to retrieve data from. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void filingsSentiment(String accessNumber, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SECSentimentAnalysis>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'accessNumber' is set
        if (accessNumber == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'accessNumber' when calling filingsSentiment"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/filings-sentiment";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessNumber", accessNumber));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<SECSentimentAnalysis> localVarReturnType = new TypeReference<SECSentimentAnalysis>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        financials(symbol, statement, freq, null, resultHandler);
    }

    /**
    * Financial Statements
    * &lt;p&gt;Get standardized balance sheet, income statement and cash flow for global companies going back 30+ years. Data is sourced from original filings most of which made available through &lt;a href&#x3D;\&quot;#filings\&quot;&gt;SEC Filings&lt;/a&gt; and &lt;a href&#x3D;\&quot;#international-filings\&quot;&gt;International Filings&lt;/a&gt; endpoints.&lt;/p&gt;&lt;p&gt;&lt;i&gt;Wondering why our standardized data is different from Bloomberg, Reuters, Factset, S&amp;P or Yahoo Finance ? Check out our &lt;a href&#x3D;\&quot;/faq\&quot;&gt;FAQ page&lt;/a&gt; to learn more&lt;/i&gt;&lt;/p&gt;
    * @param symbol Symbol of the company: AAPL. (required)
    * @param statement Statement can take 1 of these values &lt;code&gt;bs, ic, cf&lt;/code&gt; for Balance Sheet, Income Statement, Cash Flow respectively. (required)
    * @param freq Frequency can take 1 of these values &lt;code&gt;annual, quarterly, ttm, ytd&lt;/code&gt;.  TTM (Trailing Twelve Months) option is available for Income Statement and Cash Flow. YTD (Year To Date) option is only available for Cash Flow. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void financials(String symbol, String statement, String freq, ApiClient.AuthInfo authInfo, Handler<AsyncResult<FinancialStatements>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling financials"));
            return;
        }
        
        // verify the required parameter 'statement' is set
        if (statement == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'statement' when calling financials"));
            return;
        }
        
        // verify the required parameter 'freq' is set
        if (freq == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'freq' when calling financials"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/financials";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "statement", statement));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "freq", freq));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<FinancialStatements> localVarReturnType = new TypeReference<FinancialStatements>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        financialsReported(symbol, cik, accessNumber, freq, from, to, null, resultHandler);
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
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void financialsReported(String symbol, String cik, String accessNumber, String freq, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<FinancialsAsReported>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/stock/financials-reported";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cik", cik));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessNumber", accessNumber));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "freq", freq));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<FinancialsAsReported> localVarReturnType = new TypeReference<FinancialsAsReported>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        forexCandles(symbol, resolution, from, to, null, resultHandler);
    }

    /**
    * Forex Candles
    * Get candlestick data for forex symbols.
    * @param symbol Use symbol returned in &lt;code&gt;/forex/symbol&lt;/code&gt; endpoint for this field. (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param from UNIX timestamp. Interval initial value. (required)
    * @param to UNIX timestamp. Interval end value. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void forexCandles(String symbol, String resolution, Long from, Long to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<ForexCandles>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling forexCandles"));
            return;
        }
        
        // verify the required parameter 'resolution' is set
        if (resolution == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'resolution' when calling forexCandles"));
            return;
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'from' when calling forexCandles"));
            return;
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'to' when calling forexCandles"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/forex/candle";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "resolution", resolution));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<ForexCandles> localVarReturnType = new TypeReference<ForexCandles>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Forex Exchanges
    * List supported forex exchanges
    * @param resultHandler Asynchronous result handler
    */
    public void forexExchanges(Handler<AsyncResult<List<String>>> resultHandler) {
        forexExchanges(null, resultHandler);
    }

    /**
    * Forex Exchanges
    * List supported forex exchanges
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void forexExchanges(ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<String>>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/forex/exchange";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<List<String>> localVarReturnType = new TypeReference<List<String>>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Forex rates
    * Get rates for all forex pairs. Ideal for currency conversion
        * @param base Base currency. Default to EUR. (optional)
        * @param date Date. Leave blank to get the latest data. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void forexRates(String base, String date, Handler<AsyncResult<Forexrates>> resultHandler) {
        forexRates(base, date, null, resultHandler);
    }

    /**
    * Forex rates
    * Get rates for all forex pairs. Ideal for currency conversion
    * @param base Base currency. Default to EUR. (optional)
    * @param date Date. Leave blank to get the latest data. (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void forexRates(String base, String date, ApiClient.AuthInfo authInfo, Handler<AsyncResult<Forexrates>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/forex/rates";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "base", base));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<Forexrates> localVarReturnType = new TypeReference<Forexrates>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Forex Symbol
    * List supported forex symbols.
        * @param exchange Exchange you want to get the list of symbols from. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void forexSymbols(String exchange, Handler<AsyncResult<List<ForexSymbol>>> resultHandler) {
        forexSymbols(exchange, null, resultHandler);
    }

    /**
    * Forex Symbol
    * List supported forex symbols.
    * @param exchange Exchange you want to get the list of symbols from. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void forexSymbols(String exchange, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<ForexSymbol>>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'exchange' is set
        if (exchange == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'exchange' when calling forexSymbols"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/forex/symbol";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "exchange", exchange));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<List<ForexSymbol>> localVarReturnType = new TypeReference<List<ForexSymbol>>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Fund Ownership
    * Get a full list fund and institutional investors of a company in descending order of the number of shares held. Data is sourced from &lt;code&gt;13F form&lt;/code&gt;, &lt;code&gt;Schedule 13D&lt;/code&gt; and &lt;code&gt;13G&lt;/code&gt; for US market, &lt;code&gt;UK Share Register&lt;/code&gt; for UK market, &lt;code&gt;SEDI&lt;/code&gt; for Canadian market and equivalent filings for other international markets.
        * @param symbol Symbol of the company: AAPL. (required)
        * @param limit Limit number of results. Leave empty to get the full list. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void fundOwnership(String symbol, Long limit, Handler<AsyncResult<FundOwnership>> resultHandler) {
        fundOwnership(symbol, limit, null, resultHandler);
    }

    /**
    * Fund Ownership
    * Get a full list fund and institutional investors of a company in descending order of the number of shares held. Data is sourced from &lt;code&gt;13F form&lt;/code&gt;, &lt;code&gt;Schedule 13D&lt;/code&gt; and &lt;code&gt;13G&lt;/code&gt; for US market, &lt;code&gt;UK Share Register&lt;/code&gt; for UK market, &lt;code&gt;SEDI&lt;/code&gt; for Canadian market and equivalent filings for other international markets.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param limit Limit number of results. Leave empty to get the full list. (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void fundOwnership(String symbol, Long limit, ApiClient.AuthInfo authInfo, Handler<AsyncResult<FundOwnership>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling fundOwnership"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/fund-ownership";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<FundOwnership> localVarReturnType = new TypeReference<FundOwnership>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Download Filings
    * &lt;p&gt;Download filings using document ids.&lt;/p&gt;
        * @param documentId Document&#39;s id. Note that this is different from filingId as 1 filing can contain multiple documents. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void globalFilingsDownload(String documentId, Handler<AsyncResult<Void>> resultHandler) {
        globalFilingsDownload(documentId, null, resultHandler);
    }

    /**
    * Download Filings
    * &lt;p&gt;Download filings using document ids.&lt;/p&gt;
    * @param documentId Document&#39;s id. Note that this is different from filingId as 1 filing can contain multiple documents. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void globalFilingsDownload(String documentId, ApiClient.AuthInfo authInfo, Handler<AsyncResult<Void>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'documentId' when calling globalFilingsDownload"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/global-filings/download";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "documentId", documentId));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };

        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, null, resultHandler);
    }
    /**
    * Global Filings Search
    * &lt;p&gt;Search for best-matched filings across global companies&#39; filings, transcripts and press releases. You can filter by anything from symbol, ISIN to form type, and document sources.&lt;/p&gt;&lt;p&gt;This endpoint will return a list of documents that match your search criteria. If you would like to get the excerpts as well, please set &lt;code&gt;highlighted&lt;/code&gt; to &lt;code&gt;true&lt;/code&gt;. Once you have the list of documents, you can get a list of excerpts and positions to highlight the document using the &lt;code&gt;/search-in-filing&lt;/code&gt; endpoint&lt;/p&gt;
        * @param search Search body (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void globalFilingsSearch(SearchBody search, Handler<AsyncResult<SearchResponse>> resultHandler) {
        globalFilingsSearch(search, null, resultHandler);
    }

    /**
    * Global Filings Search
    * &lt;p&gt;Search for best-matched filings across global companies&#39; filings, transcripts and press releases. You can filter by anything from symbol, ISIN to form type, and document sources.&lt;/p&gt;&lt;p&gt;This endpoint will return a list of documents that match your search criteria. If you would like to get the excerpts as well, please set &lt;code&gt;highlighted&lt;/code&gt; to &lt;code&gt;true&lt;/code&gt;. Once you have the list of documents, you can get a list of excerpts and positions to highlight the document using the &lt;code&gt;/search-in-filing&lt;/code&gt; endpoint&lt;/p&gt;
    * @param search Search body (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void globalFilingsSearch(SearchBody search, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SearchResponse>> resultHandler) {
        Object localVarBody = search;
        
        // create path and map variables
        String localVarPath = "/global-filings/search";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<SearchResponse> localVarReturnType = new TypeReference<SearchResponse>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Search Filter
    * &lt;p&gt;Get available values for each filter in search body.&lt;/p&gt;
        * @param field Field to get available filters. Available filters are \&quot;countries\&quot;, \&quot;exchanges\&quot;, \&quot;exhibits\&quot;, \&quot;forms\&quot;, \&quot;gics\&quot;, \&quot;naics\&quot;, \&quot;caps\&quot;, \&quot;acts\&quot;, and \&quot;sort\&quot;. (required)
        * @param source Get available forms for each source. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void globalFilingsSearchFilter(String field, String source, Handler<AsyncResult<SearchFilter>> resultHandler) {
        globalFilingsSearchFilter(field, source, null, resultHandler);
    }

    /**
    * Search Filter
    * &lt;p&gt;Get available values for each filter in search body.&lt;/p&gt;
    * @param field Field to get available filters. Available filters are \&quot;countries\&quot;, \&quot;exchanges\&quot;, \&quot;exhibits\&quot;, \&quot;forms\&quot;, \&quot;gics\&quot;, \&quot;naics\&quot;, \&quot;caps\&quot;, \&quot;acts\&quot;, and \&quot;sort\&quot;. (required)
    * @param source Get available forms for each source. (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void globalFilingsSearchFilter(String field, String source, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SearchFilter>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'field' is set
        if (field == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'field' when calling globalFilingsSearchFilter"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/global-filings/filter";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "field", field));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<SearchFilter> localVarReturnType = new TypeReference<SearchFilter>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        historicalEmployeeCount(symbol, from, to, null, resultHandler);
    }

    /**
    * Historical Employee Count
    * Get historical employee count for global companies.
    * @param symbol Company symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void historicalEmployeeCount(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<HistoricalEmployeeCount>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling historicalEmployeeCount"));
            return;
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'from' when calling historicalEmployeeCount"));
            return;
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'to' when calling historicalEmployeeCount"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/historical-employee-count";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<HistoricalEmployeeCount> localVarReturnType = new TypeReference<HistoricalEmployeeCount>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        historicalMarketCap(symbol, from, to, null, resultHandler);
    }

    /**
    * Historical Market Cap
    * Get historical market cap data for global companies.
    * @param symbol Company symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void historicalMarketCap(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<HistoricalMarketCapData>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling historicalMarketCap"));
            return;
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'from' when calling historicalMarketCap"));
            return;
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'to' when calling historicalMarketCap"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/historical-market-cap";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<HistoricalMarketCapData> localVarReturnType = new TypeReference<HistoricalMarketCapData>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Indices Constituents
    * Get a list of index&#39;s constituents. A list of supported indices for this endpoint can be found &lt;a href&#x3D;\&quot;/api/v1/index/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
        * @param symbol symbol (required)
    * @param resultHandler Asynchronous result handler
    */
    public void indicesConstituents(String symbol, Handler<AsyncResult<IndicesConstituents>> resultHandler) {
        indicesConstituents(symbol, null, resultHandler);
    }

    /**
    * Indices Constituents
    * Get a list of index&#39;s constituents. A list of supported indices for this endpoint can be found &lt;a href&#x3D;\&quot;/api/v1/index/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol symbol (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void indicesConstituents(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<IndicesConstituents>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling indicesConstituents"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/index/constituents";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<IndicesConstituents> localVarReturnType = new TypeReference<IndicesConstituents>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Indices Historical Constituents
    * Get full history of index&#39;s constituents including symbols and dates of joining and leaving the Index. Currently support &lt;code&gt;^GSPC&lt;/code&gt;, &lt;code&gt;^NDX&lt;/code&gt;, &lt;code&gt;^DJI&lt;/code&gt;
        * @param symbol symbol (required)
    * @param resultHandler Asynchronous result handler
    */
    public void indicesHistoricalConstituents(String symbol, Handler<AsyncResult<IndicesHistoricalConstituents>> resultHandler) {
        indicesHistoricalConstituents(symbol, null, resultHandler);
    }

    /**
    * Indices Historical Constituents
    * Get full history of index&#39;s constituents including symbols and dates of joining and leaving the Index. Currently support &lt;code&gt;^GSPC&lt;/code&gt;, &lt;code&gt;^NDX&lt;/code&gt;, &lt;code&gt;^DJI&lt;/code&gt;
    * @param symbol symbol (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void indicesHistoricalConstituents(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<IndicesHistoricalConstituents>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling indicesHistoricalConstituents"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/index/historical-constituents";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<IndicesHistoricalConstituents> localVarReturnType = new TypeReference<IndicesHistoricalConstituents>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        insiderSentiment(symbol, from, to, null, resultHandler);
    }

    /**
    * Insider Sentiment
    * Get insider sentiment data for US companies calculated using method discussed &lt;a href&#x3D;\&quot;https://medium.com/@stock-api/finnhub-insiders-sentiment-analysis-cc43f9f64b3a\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. The MSPR ranges from -100 for the most negative to 100 for the most positive which can signal price changes in the coming 30-90 days.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param from From date: 2020-03-15. (required)
    * @param to To date: 2020-03-16. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void insiderSentiment(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<InsiderSentiments>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling insiderSentiment"));
            return;
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'from' when calling insiderSentiment"));
            return;
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'to' when calling insiderSentiment"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/insider-sentiment";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<InsiderSentiments> localVarReturnType = new TypeReference<InsiderSentiments>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        insiderTransactions(symbol, from, to, null, resultHandler);
    }

    /**
    * Insider Transactions
    * Company insider transactions data sourced from &lt;code&gt;Form 3,4,5&lt;/code&gt;, SEDI and relevant companies&#39; filings. This endpoint covers US, UK, Canada, Australia, India, and all major EU markets. Limit to 100 transactions per API call.
    * @param symbol Symbol of the company: AAPL. Leave this param blank to get the latest transactions. (required)
    * @param from From date: 2020-03-15. (optional)
    * @param to To date: 2020-03-16. (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void insiderTransactions(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<InsiderTransactions>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling insiderTransactions"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/insider-transactions";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<InsiderTransactions> localVarReturnType = new TypeReference<InsiderTransactions>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        institutionalOwnership(symbol, cusip, from, to, null, resultHandler);
    }

    /**
    * Institutional Ownership
    * Get a list institutional investors&#39; positions for a particular stock overtime. Data from 13-F filings. Limit to 1 year of data at a time.
    * @param symbol Filter by symbol. (required)
    * @param cusip Filter by CUSIP. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void institutionalOwnership(String symbol, String cusip, String from, String to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<InstitutionalOwnership>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling institutionalOwnership"));
            return;
        }
        
        // verify the required parameter 'cusip' is set
        if (cusip == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'cusip' when calling institutionalOwnership"));
            return;
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'from' when calling institutionalOwnership"));
            return;
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'to' when calling institutionalOwnership"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/institutional/ownership";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cusip", cusip));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<InstitutionalOwnership> localVarReturnType = new TypeReference<InstitutionalOwnership>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        institutionalPortfolio(cik, from, to, null, resultHandler);
    }

    /**
    * Institutional Portfolio
    * Get the holdings/portfolio data of institutional investors from 13-F filings. Limit to 1 year of data at a time. You can get a list of supported CIK &lt;a href&#x3D;\&quot;/api/v1/institutional/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param cik Fund&#39;s CIK. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void institutionalPortfolio(String cik, String from, String to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<InstitutionalPortfolio>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'cik' is set
        if (cik == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'cik' when calling institutionalPortfolio"));
            return;
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'from' when calling institutionalPortfolio"));
            return;
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'to' when calling institutionalPortfolio"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/institutional/portfolio";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cik", cik));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<InstitutionalPortfolio> localVarReturnType = new TypeReference<InstitutionalPortfolio>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Institutional Profile
    * Get a list of well-known institutional investors. Currently support 60+ profiles.
        * @param cik Filter by CIK. Leave blank to get the full list. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void institutionalProfile(String cik, Handler<AsyncResult<InstitutionalProfile>> resultHandler) {
        institutionalProfile(cik, null, resultHandler);
    }

    /**
    * Institutional Profile
    * Get a list of well-known institutional investors. Currently support 60+ profiles.
    * @param cik Filter by CIK. Leave blank to get the full list. (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void institutionalProfile(String cik, ApiClient.AuthInfo authInfo, Handler<AsyncResult<InstitutionalProfile>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/institutional/profile";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cik", cik));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<InstitutionalProfile> localVarReturnType = new TypeReference<InstitutionalProfile>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        internationalFilings(symbol, country, from, to, null, resultHandler);
    }

    /**
    * International Filings
    * List filings for international companies. Limit to 500 documents at a time. These are the documents we use to source our fundamental data. Enterprise clients who need access to the full filings for global markets should contact us for the access.
    * @param symbol Symbol. Leave empty to list latest filings. (optional)
    * @param country Filter by country using country&#39;s 2-letter code. (optional)
    * @param from From date: 2023-01-15. (optional)
    * @param to To date: 2023-12-16. (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void internationalFilings(String symbol, String country, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<InternationalFiling>>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/stock/international-filings";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<List<InternationalFiling>> localVarReturnType = new TypeReference<List<InternationalFiling>>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Investment Themes (Thematic Investing)
    * &lt;p&gt;Thematic investing involves creating a portfolio (or portion of a portfolio) by gathering together a collection of companies involved in certain areas that you predict will generate above-market returns over the long term. Themes can be based on a concept such as ageing populations or a sub-sector such as robotics, and drones. Thematic investing focuses on predicted long-term trends rather than specific companies or sectors, enabling investors to access structural, one-off shifts that can change an entire industry.&lt;/p&gt;&lt;p&gt;This endpoint will help you get portfolios of different investment themes that are changing our life and are the way of the future.&lt;/p&gt;&lt;p&gt;A full list of themes supported can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ULj9xDh4iPoQj279M084adZ2_S852ttRthKKJ7madYc/edit?usp&#x3D;sharing\&quot;&gt;here&lt;/a&gt;. The theme coverage and portfolios are updated bi-weekly by our analysts. Our approach excludes penny, super-small cap and illiquid stocks.&lt;/p&gt;
        * @param theme Investment theme. A full list of themes supported can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ULj9xDh4iPoQj279M084adZ2_S852ttRthKKJ7madYc/edit?usp&#x3D;sharing\&quot;&gt;here&lt;/a&gt;. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void investmentThemes(String theme, Handler<AsyncResult<InvestmentThemes>> resultHandler) {
        investmentThemes(theme, null, resultHandler);
    }

    /**
    * Investment Themes (Thematic Investing)
    * &lt;p&gt;Thematic investing involves creating a portfolio (or portion of a portfolio) by gathering together a collection of companies involved in certain areas that you predict will generate above-market returns over the long term. Themes can be based on a concept such as ageing populations or a sub-sector such as robotics, and drones. Thematic investing focuses on predicted long-term trends rather than specific companies or sectors, enabling investors to access structural, one-off shifts that can change an entire industry.&lt;/p&gt;&lt;p&gt;This endpoint will help you get portfolios of different investment themes that are changing our life and are the way of the future.&lt;/p&gt;&lt;p&gt;A full list of themes supported can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ULj9xDh4iPoQj279M084adZ2_S852ttRthKKJ7madYc/edit?usp&#x3D;sharing\&quot;&gt;here&lt;/a&gt;. The theme coverage and portfolios are updated bi-weekly by our analysts. Our approach excludes penny, super-small cap and illiquid stocks.&lt;/p&gt;
    * @param theme Investment theme. A full list of themes supported can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ULj9xDh4iPoQj279M084adZ2_S852ttRthKKJ7madYc/edit?usp&#x3D;sharing\&quot;&gt;here&lt;/a&gt;. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void investmentThemes(String theme, ApiClient.AuthInfo authInfo, Handler<AsyncResult<InvestmentThemes>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'theme' is set
        if (theme == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'theme' when calling investmentThemes"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/investment-theme";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "theme", theme));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<InvestmentThemes> localVarReturnType = new TypeReference<InvestmentThemes>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * IPO Calendar
    * Get recent and upcoming IPO.
        * @param from From date: 2020-03-15. (required)
        * @param to To date: 2020-03-16. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void ipoCalendar(LocalDate from, LocalDate to, Handler<AsyncResult<IPOCalendar>> resultHandler) {
        ipoCalendar(from, to, null, resultHandler);
    }

    /**
    * IPO Calendar
    * Get recent and upcoming IPO.
    * @param from From date: 2020-03-15. (required)
    * @param to To date: 2020-03-16. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void ipoCalendar(LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<IPOCalendar>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'from' is set
        if (from == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'from' when calling ipoCalendar"));
            return;
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'to' when calling ipoCalendar"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/calendar/ipo";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<IPOCalendar> localVarReturnType = new TypeReference<IPOCalendar>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * ISIN Change
    * Get a list of ISIN changes for EU-listed securities. Limit to 2000 events at a time.
        * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
        * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void isinChange(String from, String to, Handler<AsyncResult<IsinChange>> resultHandler) {
        isinChange(from, to, null, resultHandler);
    }

    /**
    * ISIN Change
    * Get a list of ISIN changes for EU-listed securities. Limit to 2000 events at a time.
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void isinChange(String from, String to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<IsinChange>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'from' is set
        if (from == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'from' when calling isinChange"));
            return;
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'to' when calling isinChange"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/ca/isin-change";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<IsinChange> localVarReturnType = new TypeReference<IsinChange>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Market Holiday
    * Get a list of holidays for global exchanges.
        * @param exchange Exchange code. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void marketHoliday(String exchange, Handler<AsyncResult<MarketHoliday>> resultHandler) {
        marketHoliday(exchange, null, resultHandler);
    }

    /**
    * Market Holiday
    * Get a list of holidays for global exchanges.
    * @param exchange Exchange code. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void marketHoliday(String exchange, ApiClient.AuthInfo authInfo, Handler<AsyncResult<MarketHoliday>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'exchange' is set
        if (exchange == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'exchange' when calling marketHoliday"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/market-holiday";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "exchange", exchange));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<MarketHoliday> localVarReturnType = new TypeReference<MarketHoliday>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Market News
    * Get latest market news.
        * @param category This parameter can be 1 of the following values &lt;code&gt;general, forex, crypto, merger&lt;/code&gt;. (required)
        * @param minId Use this field to get only news after this ID. Default to 0 (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void marketNews(String category, Long minId, Handler<AsyncResult<List<MarketNews>>> resultHandler) {
        marketNews(category, minId, null, resultHandler);
    }

    /**
    * Market News
    * Get latest market news.
    * @param category This parameter can be 1 of the following values &lt;code&gt;general, forex, crypto, merger&lt;/code&gt;. (required)
    * @param minId Use this field to get only news after this ID. Default to 0 (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void marketNews(String category, Long minId, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<MarketNews>>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'category' is set
        if (category == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'category' when calling marketNews"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/news";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "category", category));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "minId", minId));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<List<MarketNews>> localVarReturnType = new TypeReference<List<MarketNews>>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Market Status
    * Get current market status for global exchanges (whether exchanges are open or close).
        * @param exchange Exchange code. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void marketStatus(String exchange, Handler<AsyncResult<MarketStatus>> resultHandler) {
        marketStatus(exchange, null, resultHandler);
    }

    /**
    * Market Status
    * Get current market status for global exchanges (whether exchanges are open or close).
    * @param exchange Exchange code. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void marketStatus(String exchange, ApiClient.AuthInfo authInfo, Handler<AsyncResult<MarketStatus>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'exchange' is set
        if (exchange == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'exchange' when calling marketStatus"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/market-status";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "exchange", exchange));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<MarketStatus> localVarReturnType = new TypeReference<MarketStatus>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Mutual Funds Country Exposure
    * Get Mutual Funds country exposure data.
        * @param symbol Symbol. (optional)
        * @param isin Fund&#39;s isin. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void mutualFundCountryExposure(String symbol, String isin, Handler<AsyncResult<MutualFundCountryExposure>> resultHandler) {
        mutualFundCountryExposure(symbol, isin, null, resultHandler);
    }

    /**
    * Mutual Funds Country Exposure
    * Get Mutual Funds country exposure data.
    * @param symbol Symbol. (optional)
    * @param isin Fund&#39;s isin. (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void mutualFundCountryExposure(String symbol, String isin, ApiClient.AuthInfo authInfo, Handler<AsyncResult<MutualFundCountryExposure>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/mutual-fund/country";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "isin", isin));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<MutualFundCountryExposure> localVarReturnType = new TypeReference<MutualFundCountryExposure>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Mutual Funds EET
    * Get EET data for EU funds. For PAIs data, please see the EET PAI endpoint.
        * @param isin ISIN. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void mutualFundEet(String isin, Handler<AsyncResult<MutualFundEet>> resultHandler) {
        mutualFundEet(isin, null, resultHandler);
    }

    /**
    * Mutual Funds EET
    * Get EET data for EU funds. For PAIs data, please see the EET PAI endpoint.
    * @param isin ISIN. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void mutualFundEet(String isin, ApiClient.AuthInfo authInfo, Handler<AsyncResult<MutualFundEet>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'isin' is set
        if (isin == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'isin' when calling mutualFundEet"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/mutual-fund/eet";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "isin", isin));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<MutualFundEet> localVarReturnType = new TypeReference<MutualFundEet>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Mutual Funds EET PAI
    * Get EET PAI data for EU funds.
        * @param isin ISIN. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void mutualFundEetPai(String isin, Handler<AsyncResult<MutualFundEetPai>> resultHandler) {
        mutualFundEetPai(isin, null, resultHandler);
    }

    /**
    * Mutual Funds EET PAI
    * Get EET PAI data for EU funds.
    * @param isin ISIN. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void mutualFundEetPai(String isin, ApiClient.AuthInfo authInfo, Handler<AsyncResult<MutualFundEetPai>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'isin' is set
        if (isin == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'isin' when calling mutualFundEetPai"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/mutual-fund/eet-pai";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "isin", isin));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<MutualFundEetPai> localVarReturnType = new TypeReference<MutualFundEetPai>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        mutualFundHoldings(symbol, isin, skip, null, resultHandler);
    }

    /**
    * Mutual Funds Holdings
    * Get full Mutual Funds holdings/constituents. This endpoint covers both US and global mutual funds. For international funds, you must query the data using ISIN. A list of supported funds can be found &lt;a href&#x3D;\&quot;/api/v1/mutual-fund/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol Fund&#39;s symbol. (optional)
    * @param isin Fund&#39;s isin. (optional)
    * @param skip Skip the first n results. You can use this parameter to query historical constituents data. The latest result is returned if skip&#x3D;0 or not set. (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void mutualFundHoldings(String symbol, String isin, Long skip, ApiClient.AuthInfo authInfo, Handler<AsyncResult<MutualFundHoldings>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/mutual-fund/holdings";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "isin", isin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "skip", skip));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<MutualFundHoldings> localVarReturnType = new TypeReference<MutualFundHoldings>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Mutual Funds Profile
    * Get mutual funds profile information. This endpoint covers both US and global mutual funds. For international funds, you must query the data using ISIN. A list of supported funds can be found &lt;a href&#x3D;\&quot;/api/v1/mutual-fund/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
        * @param symbol Fund&#39;s symbol. (optional)
        * @param isin Fund&#39;s isin. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void mutualFundProfile(String symbol, String isin, Handler<AsyncResult<MutualFundProfile>> resultHandler) {
        mutualFundProfile(symbol, isin, null, resultHandler);
    }

    /**
    * Mutual Funds Profile
    * Get mutual funds profile information. This endpoint covers both US and global mutual funds. For international funds, you must query the data using ISIN. A list of supported funds can be found &lt;a href&#x3D;\&quot;/api/v1/mutual-fund/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param symbol Fund&#39;s symbol. (optional)
    * @param isin Fund&#39;s isin. (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void mutualFundProfile(String symbol, String isin, ApiClient.AuthInfo authInfo, Handler<AsyncResult<MutualFundProfile>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/mutual-fund/profile";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "isin", isin));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<MutualFundProfile> localVarReturnType = new TypeReference<MutualFundProfile>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Mutual Funds Sector Exposure
    * Get Mutual Funds sector exposure data.
        * @param symbol Mutual Fund symbol. (optional)
        * @param isin Fund&#39;s isin. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void mutualFundSectorExposure(String symbol, String isin, Handler<AsyncResult<MutualFundSectorExposure>> resultHandler) {
        mutualFundSectorExposure(symbol, isin, null, resultHandler);
    }

    /**
    * Mutual Funds Sector Exposure
    * Get Mutual Funds sector exposure data.
    * @param symbol Mutual Fund symbol. (optional)
    * @param isin Fund&#39;s isin. (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void mutualFundSectorExposure(String symbol, String isin, ApiClient.AuthInfo authInfo, Handler<AsyncResult<MutualFundSectorExposure>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/mutual-fund/sector";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "isin", isin));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<MutualFundSectorExposure> localVarReturnType = new TypeReference<MutualFundSectorExposure>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * News Sentiment
    * Get company&#39;s news sentiment and statistics. This endpoint is only available for US companies.
        * @param symbol Company symbol. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void newsSentiment(String symbol, Handler<AsyncResult<NewsSentiment>> resultHandler) {
        newsSentiment(symbol, null, resultHandler);
    }

    /**
    * News Sentiment
    * Get company&#39;s news sentiment and statistics. This endpoint is only available for US companies.
    * @param symbol Company symbol. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void newsSentiment(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<NewsSentiment>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling newsSentiment"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/news-sentiment";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<NewsSentiment> localVarReturnType = new TypeReference<NewsSentiment>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Ownership
    * Get a full list of shareholders of a company in descending order of the number of shares held. Data is sourced from &lt;code&gt;13F form&lt;/code&gt;, &lt;code&gt;Schedule 13D&lt;/code&gt; and &lt;code&gt;13G&lt;/code&gt; for US market, &lt;code&gt;UK Share Register&lt;/code&gt; for UK market, &lt;code&gt;SEDI&lt;/code&gt; for Canadian market and equivalent filings for other international markets.
        * @param symbol Symbol of the company: AAPL. (required)
        * @param limit Limit number of results. Leave empty to get the full list. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void ownership(String symbol, Long limit, Handler<AsyncResult<Ownership>> resultHandler) {
        ownership(symbol, limit, null, resultHandler);
    }

    /**
    * Ownership
    * Get a full list of shareholders of a company in descending order of the number of shares held. Data is sourced from &lt;code&gt;13F form&lt;/code&gt;, &lt;code&gt;Schedule 13D&lt;/code&gt; and &lt;code&gt;13G&lt;/code&gt; for US market, &lt;code&gt;UK Share Register&lt;/code&gt; for UK market, &lt;code&gt;SEDI&lt;/code&gt; for Canadian market and equivalent filings for other international markets.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param limit Limit number of results. Leave empty to get the full list. (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void ownership(String symbol, Long limit, ApiClient.AuthInfo authInfo, Handler<AsyncResult<Ownership>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling ownership"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/ownership";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<Ownership> localVarReturnType = new TypeReference<Ownership>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Pattern Recognition
    * Run pattern recognition algorithm on a symbol. Support double top/bottom, triple top/bottom, head and shoulders, triangle, wedge, channel, flag, and candlestick patterns.
        * @param symbol Symbol (required)
        * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void patternRecognition(String symbol, String resolution, Handler<AsyncResult<PatternRecognition>> resultHandler) {
        patternRecognition(symbol, resolution, null, resultHandler);
    }

    /**
    * Pattern Recognition
    * Run pattern recognition algorithm on a symbol. Support double top/bottom, triple top/bottom, head and shoulders, triangle, wedge, channel, flag, and candlestick patterns.
    * @param symbol Symbol (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void patternRecognition(String symbol, String resolution, ApiClient.AuthInfo authInfo, Handler<AsyncResult<PatternRecognition>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling patternRecognition"));
            return;
        }
        
        // verify the required parameter 'resolution' is set
        if (resolution == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'resolution' when calling patternRecognition"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/scan/pattern";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "resolution", resolution));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<PatternRecognition> localVarReturnType = new TypeReference<PatternRecognition>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        pressReleases(symbol, from, to, null, resultHandler);
    }

    /**
    * Major Press Releases
    * &lt;p&gt;Get latest major press releases of a company. This data can be used to highlight the most significant events comprised of mostly press releases sourced from the exchanges, BusinessWire, AccessWire, GlobeNewswire, Newsfile, and PRNewswire.&lt;/p&gt;&lt;p&gt;Full-text press releases data is available for Enterprise clients. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact Us&lt;/a&gt; to learn more.&lt;/p&gt;
    * @param symbol Company symbol. (required)
    * @param from From time: 2020-01-01. (optional)
    * @param to To time: 2020-01-05. (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void pressReleases(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<PressRelease>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling pressReleases"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/press-releases";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<PressRelease> localVarReturnType = new TypeReference<PressRelease>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Price Metrics
    * Get company price performance statistics such as 52-week high/low, YTD return and much more.
        * @param symbol Symbol of the company: AAPL. (required)
        * @param date Get data on a specific date in the past. The data is available weekly so your date will be automatically adjusted to the last day of that week. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void priceMetrics(String symbol, String date, Handler<AsyncResult<PriceMetrics>> resultHandler) {
        priceMetrics(symbol, date, null, resultHandler);
    }

    /**
    * Price Metrics
    * Get company price performance statistics such as 52-week high/low, YTD return and much more.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param date Get data on a specific date in the past. The data is available weekly so your date will be automatically adjusted to the last day of that week. (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void priceMetrics(String symbol, String date, ApiClient.AuthInfo authInfo, Handler<AsyncResult<PriceMetrics>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling priceMetrics"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/price-metric";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<PriceMetrics> localVarReturnType = new TypeReference<PriceMetrics>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Price Target
    * Get latest price target consensus.
        * @param symbol Symbol of the company: AAPL. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void priceTarget(String symbol, Handler<AsyncResult<PriceTarget>> resultHandler) {
        priceTarget(symbol, null, resultHandler);
    }

    /**
    * Price Target
    * Get latest price target consensus.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void priceTarget(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<PriceTarget>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling priceTarget"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/price-target";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<PriceTarget> localVarReturnType = new TypeReference<PriceTarget>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Quote
    * &lt;p&gt;Get real-time quote data for US stocks. Constant polling is not recommended. Use websocket if you need real-time updates.&lt;/p&gt;&lt;p&gt;Real-time stock prices for international markets are supported for Enterprise clients via our partner&#39;s feed. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact Us&lt;/a&gt; to learn more.&lt;/p&gt;
        * @param symbol Symbol (required)
    * @param resultHandler Asynchronous result handler
    */
    public void quote(String symbol, Handler<AsyncResult<Quote>> resultHandler) {
        quote(symbol, null, resultHandler);
    }

    /**
    * Quote
    * &lt;p&gt;Get real-time quote data for US stocks. Constant polling is not recommended. Use websocket if you need real-time updates.&lt;/p&gt;&lt;p&gt;Real-time stock prices for international markets are supported for Enterprise clients via our partner&#39;s feed. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact Us&lt;/a&gt; to learn more.&lt;/p&gt;
    * @param symbol Symbol (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void quote(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<Quote>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling quote"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/quote";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<Quote> localVarReturnType = new TypeReference<Quote>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Recommendation Trends
    * Get latest analyst recommendation trends for a company.
        * @param symbol Symbol of the company: AAPL. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void recommendationTrends(String symbol, Handler<AsyncResult<List<RecommendationTrend>>> resultHandler) {
        recommendationTrends(symbol, null, resultHandler);
    }

    /**
    * Recommendation Trends
    * Get latest analyst recommendation trends for a company.
    * @param symbol Symbol of the company: AAPL. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void recommendationTrends(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<RecommendationTrend>>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling recommendationTrends"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/recommendation";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<List<RecommendationTrend>> localVarReturnType = new TypeReference<List<RecommendationTrend>>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Revenue Breakdown
    * &lt;p&gt;Get revenue breakdown as-reporetd by product and geography. Users on personal plans can access data for US companies which disclose their revenue breakdown in the annual or quarterly reports.&lt;/p&gt;&lt;p&gt;Global standardized revenue breakdown/segments data is available for Enterprise users. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact us&lt;/a&gt; to inquire about the access for Global standardized data.&lt;/p&gt;
        * @param symbol Symbol. (optional)
        * @param cik CIK. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void revenueBreakdown(String symbol, String cik, Handler<AsyncResult<RevenueBreakdown>> resultHandler) {
        revenueBreakdown(symbol, cik, null, resultHandler);
    }

    /**
    * Revenue Breakdown
    * &lt;p&gt;Get revenue breakdown as-reporetd by product and geography. Users on personal plans can access data for US companies which disclose their revenue breakdown in the annual or quarterly reports.&lt;/p&gt;&lt;p&gt;Global standardized revenue breakdown/segments data is available for Enterprise users. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact us&lt;/a&gt; to inquire about the access for Global standardized data.&lt;/p&gt;
    * @param symbol Symbol. (optional)
    * @param cik CIK. (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void revenueBreakdown(String symbol, String cik, ApiClient.AuthInfo authInfo, Handler<AsyncResult<RevenueBreakdown>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/stock/revenue-breakdown";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cik", cik));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<RevenueBreakdown> localVarReturnType = new TypeReference<RevenueBreakdown>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Revenue Breakdown &amp; KPI
    * &lt;p&gt;Get standardized revenue breakdown and KPIs data for 30,000+ global companies.&lt;/p&gt;
        * @param symbol Symbol. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void revenueBreakdown2(String symbol, Handler<AsyncResult<RevenueBreakdown2>> resultHandler) {
        revenueBreakdown2(symbol, null, resultHandler);
    }

    /**
    * Revenue Breakdown &amp; KPI
    * &lt;p&gt;Get standardized revenue breakdown and KPIs data for 30,000+ global companies.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void revenueBreakdown2(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<RevenueBreakdown2>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling revenueBreakdown2"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/revenue-breakdown2";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<RevenueBreakdown2> localVarReturnType = new TypeReference<RevenueBreakdown2>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Search In Filing
    * &lt;p&gt;Get a list of excerpts and highlight positions within a document using your query.&lt;/p&gt;
        * @param search Search body (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void searchInFiling(InFilingSearchBody search, Handler<AsyncResult<InFilingResponse>> resultHandler) {
        searchInFiling(search, null, resultHandler);
    }

    /**
    * Search In Filing
    * &lt;p&gt;Get a list of excerpts and highlight positions within a document using your query.&lt;/p&gt;
    * @param search Search body (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void searchInFiling(InFilingSearchBody search, ApiClient.AuthInfo authInfo, Handler<AsyncResult<InFilingResponse>> resultHandler) {
        Object localVarBody = search;
        
        // create path and map variables
        String localVarPath = "/global-filings/search-in-filing";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<InFilingResponse> localVarReturnType = new TypeReference<InFilingResponse>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Sector Metrics
    * Get ratios for different sectors and regions/indices.
        * @param region Region. A list of supported values for this field can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1afedyv7yWJ-z7pMjaAZK-f6ENY3mI3EBCk95QffpoHw/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void sectorMetric(String region, Handler<AsyncResult<SectorMetric>> resultHandler) {
        sectorMetric(region, null, resultHandler);
    }

    /**
    * Sector Metrics
    * Get ratios for different sectors and regions/indices.
    * @param region Region. A list of supported values for this field can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1afedyv7yWJ-z7pMjaAZK-f6ENY3mI3EBCk95QffpoHw/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void sectorMetric(String region, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SectorMetric>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'region' is set
        if (region == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'region' when calling sectorMetric"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/sector/metrics";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "region", region));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<SectorMetric> localVarReturnType = new TypeReference<SectorMetric>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        similarityIndex(symbol, cik, freq, null, resultHandler);
    }

    /**
    * Similarity Index
    * &lt;p&gt;Calculate the textual difference between a company&#39;s 10-K / 10-Q reports and the same type of report in the previous year using Cosine Similarity. For example, this endpoint compares 2019&#39;s 10-K with 2018&#39;s 10-K. Companies breaking from its routines in disclosure of financial condition and risk analysis section can signal a significant change in the company&#39;s stock price in the upcoming 4 quarters.&lt;/p&gt;
    * @param symbol Symbol. Required if cik is empty (optional)
    * @param cik CIK. Required if symbol is empty (optional)
    * @param freq &lt;code&gt;annual&lt;/code&gt; or &lt;code&gt;quarterly&lt;/code&gt;. Default to &lt;code&gt;annual&lt;/code&gt; (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void similarityIndex(String symbol, String cik, String freq, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SimilarityIndex>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/stock/similarity-index";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cik", cik));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "freq", freq));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<SimilarityIndex> localVarReturnType = new TypeReference<SimilarityIndex>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        socialSentiment(symbol, from, to, null, resultHandler);
    }

    /**
    * Social Sentiment
    * &lt;p&gt;Get social sentiment for stocks on Reddit and Twitter.&lt;/p&gt;
    * @param symbol Company symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void socialSentiment(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SocialSentiment>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling socialSentiment"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/social-sentiment";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<SocialSentiment> localVarReturnType = new TypeReference<SocialSentiment>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Dividends 2 (Basic)
    * Get global dividends data.
        * @param symbol Symbol. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void stockBasicDividends(String symbol, Handler<AsyncResult<Dividends2>> resultHandler) {
        stockBasicDividends(symbol, null, resultHandler);
    }

    /**
    * Dividends 2 (Basic)
    * Get global dividends data.
    * @param symbol Symbol. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void stockBasicDividends(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<Dividends2>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling stockBasicDividends"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/dividend2";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<Dividends2> localVarReturnType = new TypeReference<Dividends2>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Last Bid-Ask
    * Get last bid/ask data for US stocks.
        * @param symbol Symbol. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void stockBidask(String symbol, Handler<AsyncResult<LastBidAsk>> resultHandler) {
        stockBidask(symbol, null, resultHandler);
    }

    /**
    * Last Bid-Ask
    * Get last bid/ask data for US stocks.
    * @param symbol Symbol. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void stockBidask(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<LastBidAsk>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling stockBidask"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/bidask";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<LastBidAsk> localVarReturnType = new TypeReference<LastBidAsk>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        stockCandles(symbol, resolution, from, to, null, resultHandler);
    }

    /**
    * Stock Candles
    * &lt;p&gt;Get candlestick data (OHLCV) for stocks.&lt;/p&gt;&lt;p&gt;Daily data will be adjusted for Splits. Intraday data will remain unadjusted. Only 1 month of intraday will be returned at a time. If you need more historical intraday data, please use the from and to params iteratively to request more data.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param from UNIX timestamp. Interval initial value. (required)
    * @param to UNIX timestamp. Interval end value. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void stockCandles(String symbol, String resolution, Long from, Long to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<StockCandles>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling stockCandles"));
            return;
        }
        
        // verify the required parameter 'resolution' is set
        if (resolution == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'resolution' when calling stockCandles"));
            return;
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'from' when calling stockCandles"));
            return;
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'to' when calling stockCandles"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/candle";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "resolution", resolution));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<StockCandles> localVarReturnType = new TypeReference<StockCandles>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        stockDividends(symbol, from, to, null, resultHandler);
    }

    /**
    * Dividends
    * Get dividends data for common stocks going back 30 years.
    * @param symbol Symbol. (required)
    * @param from YYYY-MM-DD. (required)
    * @param to YYYY-MM-DD. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void stockDividends(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<Dividends>>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling stockDividends"));
            return;
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'from' when calling stockDividends"));
            return;
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'to' when calling stockDividends"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/dividend";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<List<Dividends>> localVarReturnType = new TypeReference<List<Dividends>>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        stockLobbying(symbol, from, to, null, resultHandler);
    }

    /**
    * Senate Lobbying
    * Get a list of reported lobbying activities in the Senate and the House.
    * @param symbol Symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void stockLobbying(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<LobbyingResult>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling stockLobbying"));
            return;
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'from' when calling stockLobbying"));
            return;
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'to' when calling stockLobbying"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/lobbying";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<LobbyingResult> localVarReturnType = new TypeReference<LobbyingResult>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        stockNbbo(symbol, date, limit, skip, null, resultHandler);
    }

    /**
    * Historical NBBO
    * &lt;p&gt;Get historical best bid and offer for US stocks, LSE, TSX, Euronext and Deutsche Borse.&lt;/p&gt;&lt;p&gt;For US market, this endpoint only serves historical NBBO from the beginning of 2020. To download more historical data, please visit our bulk download page in the Dashboard &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/dashboard/download\&quot;,&gt;here&lt;/a&gt;.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param date Date: 2020-04-02. (required)
    * @param limit Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; (required)
    * @param skip Number of ticks to skip. Use this parameter to loop through the entire data. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void stockNbbo(String symbol, LocalDate date, Long limit, Long skip, ApiClient.AuthInfo authInfo, Handler<AsyncResult<HistoricalNBBO>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling stockNbbo"));
            return;
        }
        
        // verify the required parameter 'date' is set
        if (date == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'date' when calling stockNbbo"));
            return;
        }
        
        // verify the required parameter 'limit' is set
        if (limit == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'limit' when calling stockNbbo"));
            return;
        }
        
        // verify the required parameter 'skip' is set
        if (skip == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'skip' when calling stockNbbo"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/bbo";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "skip", skip));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<HistoricalNBBO> localVarReturnType = new TypeReference<HistoricalNBBO>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Company Presentation
    * &lt;p&gt;Get presentations/slides data in PDF format that are usually used during earnings calls.&lt;/p&gt;
        * @param symbol Company symbol. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void stockPresentation(String symbol, Handler<AsyncResult<StockPresentation>> resultHandler) {
        stockPresentation(symbol, null, resultHandler);
    }

    /**
    * Company Presentation
    * &lt;p&gt;Get presentations/slides data in PDF format that are usually used during earnings calls.&lt;/p&gt;
    * @param symbol Company symbol. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void stockPresentation(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<StockPresentation>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling stockPresentation"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/presentation";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<StockPresentation> localVarReturnType = new TypeReference<StockPresentation>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        stockSplits(symbol, from, to, null, resultHandler);
    }

    /**
    * Splits
    * Get splits data for stocks.
    * @param symbol Symbol. (required)
    * @param from YYYY-MM-DD. (required)
    * @param to YYYY-MM-DD. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void stockSplits(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<Split>>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling stockSplits"));
            return;
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'from' when calling stockSplits"));
            return;
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'to' when calling stockSplits"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/split";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<List<Split>> localVarReturnType = new TypeReference<List<Split>>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        stockSymbols(exchange, mic, securityType, currency, null, resultHandler);
    }

    /**
    * Stock Symbol
    * List supported stocks. We use the following symbology to identify stocks on Finnhub &lt;code&gt;Exchange_Ticker.Exchange_Code&lt;/code&gt;. A list of supported exchange codes can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1I3pBxjfXB056-g_JYf_6o3Rns3BV2kMGG1nCatb91ls/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
    * @param exchange Exchange you want to get the list of symbols from. List of exchange codes can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1I3pBxjfXB056-g_JYf_6o3Rns3BV2kMGG1nCatb91ls/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. (required)
    * @param mic Filter by MIC code. (optional)
    * @param securityType Filter by security type used by OpenFigi standard. (optional)
    * @param currency Filter by currency. (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void stockSymbols(String exchange, String mic, String securityType, String currency, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<StockSymbol>>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'exchange' is set
        if (exchange == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'exchange' when calling stockSymbols"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/symbol";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "exchange", exchange));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "mic", mic));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "securityType", securityType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<List<StockSymbol>> localVarReturnType = new TypeReference<List<StockSymbol>>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        stockTick(symbol, date, limit, skip, null, resultHandler);
    }

    /**
    * Tick Data
    * &lt;p&gt;Get historical tick data for global exchanges.&lt;/p&gt;&lt;p&gt;For more historical tick data, you can visit our bulk download page in the Dashboard &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/dashboard/download\&quot;,&gt;here&lt;/a&gt; to speed up the download process.&lt;/p&gt;&lt;table class&#x3D;\&quot;table table-hover\&quot;&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Exchange&lt;/th&gt;       &lt;th&gt;Segment&lt;/th&gt;       &lt;th&gt;Delay&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;US CTA/UTP&lt;/th&gt;       &lt;td&gt;Full SIP&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;TSX&lt;/th&gt;       &lt;td&gt;&lt;ul&gt;&lt;li&gt;TSX&lt;/li&gt;&lt;li&gt;TSX Venture&lt;/li&gt;&lt;li&gt;Index&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;LSE&lt;/th&gt;       &lt;td&gt;&lt;ul&gt;&lt;li&gt;London Stock Exchange (L)&lt;/li&gt;&lt;li&gt;LSE International (L)&lt;/li&gt;&lt;li&gt;LSE European (L)&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;15 minute&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;Euronext&lt;/th&gt;       &lt;td&gt;&lt;ul&gt; &lt;li&gt;Euronext Paris (PA)&lt;/li&gt; &lt;li&gt;Euronext Amsterdam (AS)&lt;/li&gt; &lt;li&gt;Euronext Lisbon (LS)&lt;/li&gt; &lt;li&gt;Euronext Brussels (BR)&lt;/li&gt; &lt;li&gt;Euronext Oslo (OL)&lt;/li&gt; &lt;li&gt;Euronext London (LN)&lt;/li&gt; &lt;li&gt;Euronext Dublin (IR)&lt;/li&gt; &lt;li&gt;Index&lt;/li&gt; &lt;li&gt;Warrant&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;Deutsche Börse&lt;/th&gt;       &lt;td&gt;&lt;ul&gt; &lt;li&gt;Frankfurt (F)&lt;/li&gt; &lt;li&gt;Xetra (DE)&lt;/li&gt; &lt;li&gt;Duesseldorf (DU)&lt;/li&gt; &lt;li&gt;Hamburg (HM)&lt;/li&gt; &lt;li&gt;Berlin (BE)&lt;/li&gt; &lt;li&gt;Hanover (HA)&lt;/li&gt; &lt;li&gt;Stoxx (SX)&lt;/li&gt; &lt;li&gt;TradeGate (TG)&lt;/li&gt; &lt;li&gt;Zertifikate (SC)&lt;/li&gt; &lt;li&gt;Index&lt;/li&gt; &lt;li&gt;Warrant&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
    * @param symbol Symbol. (required)
    * @param date Date: 2020-04-02. (required)
    * @param limit Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; (required)
    * @param skip Number of ticks to skip. Use this parameter to loop through the entire data. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void stockTick(String symbol, LocalDate date, Long limit, Long skip, ApiClient.AuthInfo authInfo, Handler<AsyncResult<TickData>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling stockTick"));
            return;
        }
        
        // verify the required parameter 'date' is set
        if (date == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'date' when calling stockTick"));
            return;
        }
        
        // verify the required parameter 'limit' is set
        if (limit == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'limit' when calling stockTick"));
            return;
        }
        
        // verify the required parameter 'skip' is set
        if (skip == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'skip' when calling stockTick"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/tick";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "skip", skip));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TickData> localVarReturnType = new TypeReference<TickData>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        stockUsaSpending(symbol, from, to, null, resultHandler);
    }

    /**
    * USA Spending
    * Get a list of government&#39;s spending activities from USASpending dataset for public companies. This dataset can help you identify companies that win big government contracts which is extremely important for industries such as Defense, Aerospace, and Education.
    * @param symbol Symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for &lt;code&gt;actionDate&lt;/code&gt; (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for &lt;code&gt;actionDate&lt;/code&gt; (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void stockUsaSpending(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<UsaSpendingResult>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling stockUsaSpending"));
            return;
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'from' when calling stockUsaSpending"));
            return;
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'to' when calling stockUsaSpending"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/usa-spending";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<UsaSpendingResult> localVarReturnType = new TypeReference<UsaSpendingResult>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        stockUsptoPatent(symbol, from, to, null, resultHandler);
    }

    /**
    * USPTO Patents
    * List USPTO patents for companies. Limit to 250 records per API call.
    * @param symbol Symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void stockUsptoPatent(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<UsptoPatentResult>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling stockUsptoPatent"));
            return;
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'from' when calling stockUsptoPatent"));
            return;
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'to' when calling stockUsptoPatent"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/uspto-patent";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<UsptoPatentResult> localVarReturnType = new TypeReference<UsptoPatentResult>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        stockVisaApplication(symbol, from, to, null, resultHandler);
    }

    /**
    * H1-B Visa Application
    * Get a list of H1-B and Permanent visa applications for companies from the DOL. The data is updated quarterly.
    * @param symbol Symbol. (required)
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter on the &lt;code&gt;beginDate&lt;/code&gt; column. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter on the &lt;code&gt;beginDate&lt;/code&gt; column. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void stockVisaApplication(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<VisaApplicationResult>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling stockVisaApplication"));
            return;
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'from' when calling stockVisaApplication"));
            return;
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'to' when calling stockVisaApplication"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/visa-application";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<VisaApplicationResult> localVarReturnType = new TypeReference<VisaApplicationResult>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Supply Chain Relationships
    * &lt;p&gt;This endpoint provides an overall map of public companies&#39; key customers and suppliers. The data offers a deeper look into a company&#39;s supply chain and how products are created. The data will help investors manage risk, limit exposure or generate alpha-generating ideas and trading insights.&lt;/p&gt;
        * @param symbol Symbol. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void supplyChainRelationships(String symbol, Handler<AsyncResult<SupplyChainRelationships>> resultHandler) {
        supplyChainRelationships(symbol, null, resultHandler);
    }

    /**
    * Supply Chain Relationships
    * &lt;p&gt;This endpoint provides an overall map of public companies&#39; key customers and suppliers. The data offers a deeper look into a company&#39;s supply chain and how products are created. The data will help investors manage risk, limit exposure or generate alpha-generating ideas and trading insights.&lt;/p&gt;
    * @param symbol Symbol. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void supplyChainRelationships(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SupplyChainRelationships>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling supplyChainRelationships"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/supply-chain";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<SupplyChainRelationships> localVarReturnType = new TypeReference<SupplyChainRelationships>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Support/Resistance
    * Get support and resistance levels for a symbol.
        * @param symbol Symbol (required)
        * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void supportResistance(String symbol, String resolution, Handler<AsyncResult<SupportResistance>> resultHandler) {
        supportResistance(symbol, resolution, null, resultHandler);
    }

    /**
    * Support/Resistance
    * Get support and resistance levels for a symbol.
    * @param symbol Symbol (required)
    * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void supportResistance(String symbol, String resolution, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SupportResistance>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling supportResistance"));
            return;
        }
        
        // verify the required parameter 'resolution' is set
        if (resolution == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'resolution' when calling supportResistance"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/scan/support-resistance";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "resolution", resolution));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<SupportResistance> localVarReturnType = new TypeReference<SupportResistance>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Symbol Change
    * Get a list of symbol changes for US-listed, EU-listed, NSE and ASX securities. Limit to 2000 events at a time.
        * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
        * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void symbolChange(String from, String to, Handler<AsyncResult<SymbolChange>> resultHandler) {
        symbolChange(from, to, null, resultHandler);
    }

    /**
    * Symbol Change
    * Get a list of symbol changes for US-listed, EU-listed, NSE and ASX securities. Limit to 2000 events at a time.
    * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param to To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void symbolChange(String from, String to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SymbolChange>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'from' is set
        if (from == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'from' when calling symbolChange"));
            return;
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'to' when calling symbolChange"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/ca/symbol-change";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<SymbolChange> localVarReturnType = new TypeReference<SymbolChange>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Symbol Lookup
    * Search for best-matching symbols based on your query. You can input anything from symbol, security&#39;s name to ISIN and Cusip.
        * @param q Query text can be symbol, name, isin, or cusip. (required)
        * @param exchange Exchange limit. (optional)
    * @param resultHandler Asynchronous result handler
    */
    public void symbolSearch(String q, String exchange, Handler<AsyncResult<SymbolLookup>> resultHandler) {
        symbolSearch(q, exchange, null, resultHandler);
    }

    /**
    * Symbol Lookup
    * Search for best-matching symbols based on your query. You can input anything from symbol, security&#39;s name to ISIN and Cusip.
    * @param q Query text can be symbol, name, isin, or cusip. (required)
    * @param exchange Exchange limit. (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void symbolSearch(String q, String exchange, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SymbolLookup>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'q' is set
        if (q == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'q' when calling symbolSearch"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/search";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "q", q));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "exchange", exchange));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<SymbolLookup> localVarReturnType = new TypeReference<SymbolLookup>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        technicalIndicator(symbol, resolution, from, to, indicator, indicatorFields, null, resultHandler);
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
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void technicalIndicator(String symbol, String resolution, Long from, Long to, String indicator, Object indicatorFields, ApiClient.AuthInfo authInfo, Handler<AsyncResult<Object>> resultHandler) {
        Object localVarBody = indicatorFields;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling technicalIndicator"));
            return;
        }
        
        // verify the required parameter 'resolution' is set
        if (resolution == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'resolution' when calling technicalIndicator"));
            return;
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'from' when calling technicalIndicator"));
            return;
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'to' when calling technicalIndicator"));
            return;
        }
        
        // verify the required parameter 'indicator' is set
        if (indicator == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'indicator' when calling technicalIndicator"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/indicator";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "resolution", resolution));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "indicator", indicator));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<Object> localVarReturnType = new TypeReference<Object>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Earnings Call Transcripts
    * &lt;p&gt;Get earnings call transcripts, audio and participants&#39; list. Data is available for US, UK, European, Australian and Canadian companies.&lt;p&gt;15+ years of data is available with 220,000+ audio which add up to 7TB in size.&lt;/p&gt;
        * @param id Transcript&#39;s id obtained with &lt;a href&#x3D;\&quot;#transcripts-list\&quot;&gt;Transcripts List endpoint&lt;/a&gt;. (required)
    * @param resultHandler Asynchronous result handler
    */
    public void transcripts(String id, Handler<AsyncResult<EarningsCallTranscripts>> resultHandler) {
        transcripts(id, null, resultHandler);
    }

    /**
    * Earnings Call Transcripts
    * &lt;p&gt;Get earnings call transcripts, audio and participants&#39; list. Data is available for US, UK, European, Australian and Canadian companies.&lt;p&gt;15+ years of data is available with 220,000+ audio which add up to 7TB in size.&lt;/p&gt;
    * @param id Transcript&#39;s id obtained with &lt;a href&#x3D;\&quot;#transcripts-list\&quot;&gt;Transcripts List endpoint&lt;/a&gt;. (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void transcripts(String id, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EarningsCallTranscripts>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling transcripts"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/transcripts";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<EarningsCallTranscripts> localVarReturnType = new TypeReference<EarningsCallTranscripts>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }
    /**
    * Earnings Call Transcripts List
    * List earnings call transcripts&#39; metadata. This endpoint is available for US, UK, European, Australian and Canadian companies.
        * @param symbol Company symbol: AAPL. Leave empty to list the latest transcripts (required)
    * @param resultHandler Asynchronous result handler
    */
    public void transcriptsList(String symbol, Handler<AsyncResult<EarningsCallTranscriptsList>> resultHandler) {
        transcriptsList(symbol, null, resultHandler);
    }

    /**
    * Earnings Call Transcripts List
    * List earnings call transcripts&#39; metadata. This endpoint is available for US, UK, European, Australian and Canadian companies.
    * @param symbol Company symbol: AAPL. Leave empty to list the latest transcripts (required)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void transcriptsList(String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EarningsCallTranscriptsList>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'symbol' when calling transcriptsList"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/stock/transcripts/list";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<EarningsCallTranscriptsList> localVarReturnType = new TypeReference<EarningsCallTranscriptsList>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
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
        upgradeDowngrade(symbol, from, to, null, resultHandler);
    }

    /**
    * Stock Upgrade/Downgrade
    * Get latest stock upgrade and downgrade.
    * @param symbol Symbol of the company: AAPL. If left blank, the API will return latest stock upgrades/downgrades. (optional)
    * @param from From date: 2000-03-15. (optional)
    * @param to To date: 2020-03-16. (optional)
    * @param authInfo per call authentication override.
    * @param resultHandler Asynchronous result handler
    */
    public void upgradeDowngrade(String symbol, LocalDate from, LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<UpgradeDowngrade>>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/stock/upgrade-downgrade";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<List<UpgradeDowngrade>> localVarReturnType = new TypeReference<List<UpgradeDowngrade>>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, authInfo, localVarReturnType, resultHandler);
    }

    private String encodeParameter(String parameter) {
        try {
            return URLEncoder.encode(parameter, StandardCharsets.UTF_8.name()).replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            return parameter;
        }
    }
}
