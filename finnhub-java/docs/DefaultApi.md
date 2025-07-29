# DefaultApi

All URIs are relative to *https://finnhub.io/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aggregateIndicator**](DefaultApi.md#aggregateIndicator) | **GET** /scan/technical-indicator | Aggregate Indicators |
| [**aiChat**](DefaultApi.md#aiChat) | **POST** /ai-chat | AI Copilot |
| [**airlinePriceIndex**](DefaultApi.md#airlinePriceIndex) | **GET** /airline/price-index | Airline Price Index |
| [**bankBranch**](DefaultApi.md#bankBranch) | **GET** /bank-branch | Bank Branch List |
| [**bondPrice**](DefaultApi.md#bondPrice) | **GET** /bond/price | Bond price data |
| [**bondProfile**](DefaultApi.md#bondProfile) | **GET** /bond/profile | Bond Profile |
| [**bondTick**](DefaultApi.md#bondTick) | **GET** /bond/tick | Bond Tick Data |
| [**bondYieldCurve**](DefaultApi.md#bondYieldCurve) | **GET** /bond/yield-curve | Bond Yield Curve |
| [**companyBasicFinancials**](DefaultApi.md#companyBasicFinancials) | **GET** /stock/metric | Basic Financials |
| [**companyEarnings**](DefaultApi.md#companyEarnings) | **GET** /stock/earnings | Earnings Surprises |
| [**companyEarningsQualityScore**](DefaultApi.md#companyEarningsQualityScore) | **GET** /stock/earnings-quality-score | Company Earnings Quality Score |
| [**companyEbitEstimates**](DefaultApi.md#companyEbitEstimates) | **GET** /stock/ebit-estimate | EBIT Estimates |
| [**companyEbitdaEstimates**](DefaultApi.md#companyEbitdaEstimates) | **GET** /stock/ebitda-estimate | EBITDA Estimates |
| [**companyEpsEstimates**](DefaultApi.md#companyEpsEstimates) | **GET** /stock/eps-estimate | Earnings Estimates |
| [**companyEsgScore**](DefaultApi.md#companyEsgScore) | **GET** /stock/esg | Company ESG Scores |
| [**companyExecutive**](DefaultApi.md#companyExecutive) | **GET** /stock/executive | Company Executive |
| [**companyHistoricalEsgScore**](DefaultApi.md#companyHistoricalEsgScore) | **GET** /stock/historical-esg | Historical ESG Scores |
| [**companyNews**](DefaultApi.md#companyNews) | **GET** /company-news | Company News |
| [**companyPeers**](DefaultApi.md#companyPeers) | **GET** /stock/peers | Peers |
| [**companyProfile**](DefaultApi.md#companyProfile) | **GET** /stock/profile | Company Profile |
| [**companyProfile2**](DefaultApi.md#companyProfile2) | **GET** /stock/profile2 | Company Profile 2 |
| [**companyRevenueEstimates**](DefaultApi.md#companyRevenueEstimates) | **GET** /stock/revenue-estimate | Revenue Estimates |
| [**congressionalTrading**](DefaultApi.md#congressionalTrading) | **GET** /stock/congressional-trading | Congressional Trading |
| [**country**](DefaultApi.md#country) | **GET** /country | Country Metadata |
| [**covid19**](DefaultApi.md#covid19) | **GET** /covid19/us | COVID-19 |
| [**cryptoCandles**](DefaultApi.md#cryptoCandles) | **GET** /crypto/candle | Crypto Candles |
| [**cryptoExchanges**](DefaultApi.md#cryptoExchanges) | **GET** /crypto/exchange | Crypto Exchanges |
| [**cryptoProfile**](DefaultApi.md#cryptoProfile) | **GET** /crypto/profile | Crypto Profile |
| [**cryptoSymbols**](DefaultApi.md#cryptoSymbols) | **GET** /crypto/symbol | Crypto Symbol |
| [**earningsCalendar**](DefaultApi.md#earningsCalendar) | **GET** /calendar/earnings | Earnings Calendar |
| [**earningsCallLive**](DefaultApi.md#earningsCallLive) | **GET** /stock/earnings-call-live | Earnings Call Audio Live |
| [**economicCalendar**](DefaultApi.md#economicCalendar) | **GET** /calendar/economic | Economic Calendar |
| [**economicCode**](DefaultApi.md#economicCode) | **GET** /economic/code | Economic Code |
| [**economicData**](DefaultApi.md#economicData) | **GET** /economic | Economic Data |
| [**etfsCountryExposure**](DefaultApi.md#etfsCountryExposure) | **GET** /etf/country | ETFs Country Exposure |
| [**etfsHoldings**](DefaultApi.md#etfsHoldings) | **GET** /etf/holdings | ETFs Holdings |
| [**etfsProfile**](DefaultApi.md#etfsProfile) | **GET** /etf/profile | ETFs Profile |
| [**etfsSectorExposure**](DefaultApi.md#etfsSectorExposure) | **GET** /etf/sector | ETFs Sector Exposure |
| [**fdaCommitteeMeetingCalendar**](DefaultApi.md#fdaCommitteeMeetingCalendar) | **GET** /fda-advisory-committee-calendar | FDA Committee Meeting Calendar |
| [**filings**](DefaultApi.md#filings) | **GET** /stock/filings | SEC Filings |
| [**filingsSentiment**](DefaultApi.md#filingsSentiment) | **GET** /stock/filings-sentiment | SEC Sentiment Analysis |
| [**financials**](DefaultApi.md#financials) | **GET** /stock/financials | Financial Statements |
| [**financialsReported**](DefaultApi.md#financialsReported) | **GET** /stock/financials-reported | Financials As Reported |
| [**forexCandles**](DefaultApi.md#forexCandles) | **GET** /forex/candle | Forex Candles |
| [**forexExchanges**](DefaultApi.md#forexExchanges) | **GET** /forex/exchange | Forex Exchanges |
| [**forexRates**](DefaultApi.md#forexRates) | **GET** /forex/rates | Forex rates |
| [**forexSymbols**](DefaultApi.md#forexSymbols) | **GET** /forex/symbol | Forex Symbol |
| [**fundOwnership**](DefaultApi.md#fundOwnership) | **GET** /stock/fund-ownership | Fund Ownership |
| [**globalFilingsDownload**](DefaultApi.md#globalFilingsDownload) | **GET** /global-filings/download | Download Filings |
| [**globalFilingsSearch**](DefaultApi.md#globalFilingsSearch) | **POST** /global-filings/search | Global Filings Search |
| [**globalFilingsSearchFilter**](DefaultApi.md#globalFilingsSearchFilter) | **GET** /global-filings/filter | Search Filter |
| [**historicalEmployeeCount**](DefaultApi.md#historicalEmployeeCount) | **GET** /stock/historical-employee-count | Historical Employee Count |
| [**historicalMarketCap**](DefaultApi.md#historicalMarketCap) | **GET** /stock/historical-market-cap | Historical Market Cap |
| [**indicesConstituents**](DefaultApi.md#indicesConstituents) | **GET** /index/constituents | Indices Constituents |
| [**indicesHistoricalConstituents**](DefaultApi.md#indicesHistoricalConstituents) | **GET** /index/historical-constituents | Indices Historical Constituents |
| [**insiderSentiment**](DefaultApi.md#insiderSentiment) | **GET** /stock/insider-sentiment | Insider Sentiment |
| [**insiderTransactions**](DefaultApi.md#insiderTransactions) | **GET** /stock/insider-transactions | Insider Transactions |
| [**institutionalOwnership**](DefaultApi.md#institutionalOwnership) | **GET** /institutional/ownership | Institutional Ownership |
| [**institutionalPortfolio**](DefaultApi.md#institutionalPortfolio) | **GET** /institutional/portfolio | Institutional Portfolio |
| [**institutionalProfile**](DefaultApi.md#institutionalProfile) | **GET** /institutional/profile | Institutional Profile |
| [**internationalFilings**](DefaultApi.md#internationalFilings) | **GET** /stock/international-filings | International Filings |
| [**investmentThemes**](DefaultApi.md#investmentThemes) | **GET** /stock/investment-theme | Investment Themes (Thematic Investing) |
| [**ipoCalendar**](DefaultApi.md#ipoCalendar) | **GET** /calendar/ipo | IPO Calendar |
| [**isinChange**](DefaultApi.md#isinChange) | **GET** /ca/isin-change | ISIN Change |
| [**marketHoliday**](DefaultApi.md#marketHoliday) | **GET** /stock/market-holiday | Market Holiday |
| [**marketNews**](DefaultApi.md#marketNews) | **GET** /news | Market News |
| [**marketStatus**](DefaultApi.md#marketStatus) | **GET** /stock/market-status | Market Status |
| [**mutualFundCountryExposure**](DefaultApi.md#mutualFundCountryExposure) | **GET** /mutual-fund/country | Mutual Funds Country Exposure |
| [**mutualFundEet**](DefaultApi.md#mutualFundEet) | **GET** /mutual-fund/eet | Mutual Funds EET |
| [**mutualFundEetPai**](DefaultApi.md#mutualFundEetPai) | **GET** /mutual-fund/eet-pai | Mutual Funds EET PAI |
| [**mutualFundHoldings**](DefaultApi.md#mutualFundHoldings) | **GET** /mutual-fund/holdings | Mutual Funds Holdings |
| [**mutualFundProfile**](DefaultApi.md#mutualFundProfile) | **GET** /mutual-fund/profile | Mutual Funds Profile |
| [**mutualFundSectorExposure**](DefaultApi.md#mutualFundSectorExposure) | **GET** /mutual-fund/sector | Mutual Funds Sector Exposure |
| [**newsSentiment**](DefaultApi.md#newsSentiment) | **GET** /news-sentiment | News Sentiment |
| [**ownership**](DefaultApi.md#ownership) | **GET** /stock/ownership | Ownership |
| [**patternRecognition**](DefaultApi.md#patternRecognition) | **GET** /scan/pattern | Pattern Recognition |
| [**pressReleases**](DefaultApi.md#pressReleases) | **GET** /press-releases | Major Press Releases |
| [**priceMetrics**](DefaultApi.md#priceMetrics) | **GET** /stock/price-metric | Price Metrics |
| [**priceTarget**](DefaultApi.md#priceTarget) | **GET** /stock/price-target | Price Target |
| [**quote**](DefaultApi.md#quote) | **GET** /quote | Quote |
| [**recommendationTrends**](DefaultApi.md#recommendationTrends) | **GET** /stock/recommendation | Recommendation Trends |
| [**revenueBreakdown**](DefaultApi.md#revenueBreakdown) | **GET** /stock/revenue-breakdown | Revenue Breakdown |
| [**revenueBreakdown2**](DefaultApi.md#revenueBreakdown2) | **GET** /stock/revenue-breakdown2 | Revenue Breakdown &amp; KPI |
| [**searchInFiling**](DefaultApi.md#searchInFiling) | **POST** /global-filings/search-in-filing | Search In Filing |
| [**sectorMetric**](DefaultApi.md#sectorMetric) | **GET** /sector/metrics | Sector Metrics |
| [**similarityIndex**](DefaultApi.md#similarityIndex) | **GET** /stock/similarity-index | Similarity Index |
| [**socialSentiment**](DefaultApi.md#socialSentiment) | **GET** /stock/social-sentiment | Social Sentiment |
| [**stockBasicDividends**](DefaultApi.md#stockBasicDividends) | **GET** /stock/dividend2 | Dividends 2 (Basic) |
| [**stockBidask**](DefaultApi.md#stockBidask) | **GET** /stock/bidask | Last Bid-Ask |
| [**stockCandles**](DefaultApi.md#stockCandles) | **GET** /stock/candle | Stock Candles |
| [**stockDividends**](DefaultApi.md#stockDividends) | **GET** /stock/dividend | Dividends |
| [**stockLobbying**](DefaultApi.md#stockLobbying) | **GET** /stock/lobbying | Senate Lobbying |
| [**stockNbbo**](DefaultApi.md#stockNbbo) | **GET** /stock/bbo | Historical NBBO |
| [**stockPresentation**](DefaultApi.md#stockPresentation) | **GET** /stock/presentation | Company Presentation |
| [**stockSplits**](DefaultApi.md#stockSplits) | **GET** /stock/split | Splits |
| [**stockSymbols**](DefaultApi.md#stockSymbols) | **GET** /stock/symbol | Stock Symbol |
| [**stockTick**](DefaultApi.md#stockTick) | **GET** /stock/tick | Tick Data |
| [**stockUsaSpending**](DefaultApi.md#stockUsaSpending) | **GET** /stock/usa-spending | USA Spending |
| [**stockUsptoPatent**](DefaultApi.md#stockUsptoPatent) | **GET** /stock/uspto-patent | USPTO Patents |
| [**stockVisaApplication**](DefaultApi.md#stockVisaApplication) | **GET** /stock/visa-application | H1-B Visa Application |
| [**supplyChainRelationships**](DefaultApi.md#supplyChainRelationships) | **GET** /stock/supply-chain | Supply Chain Relationships |
| [**supportResistance**](DefaultApi.md#supportResistance) | **GET** /scan/support-resistance | Support/Resistance |
| [**symbolChange**](DefaultApi.md#symbolChange) | **GET** /ca/symbol-change | Symbol Change |
| [**symbolSearch**](DefaultApi.md#symbolSearch) | **GET** /search | Symbol Lookup |
| [**technicalIndicator**](DefaultApi.md#technicalIndicator) | **GET** /indicator | Technical Indicators |
| [**transcripts**](DefaultApi.md#transcripts) | **GET** /stock/transcripts | Earnings Call Transcripts |
| [**transcriptsList**](DefaultApi.md#transcriptsList) | **GET** /stock/transcripts/list | Earnings Call Transcripts List |
| [**upgradeDowngrade**](DefaultApi.md#upgradeDowngrade) | **GET** /stock/upgrade-downgrade | Stock Upgrade/Downgrade |



## aggregateIndicator

> AggregateIndicators aggregateIndicator(symbol, resolution)

Aggregate Indicators

Get aggregate signal of multiple technical indicators such as MACD, RSI, Moving Average v.v. A full list of indicators can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1MWuy0WuT2yVlxr1KbPdggVygMZtJfunDnhe-C0GEXYM/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | symbol
        String resolution = "resolution_example"; // String | Supported resolution includes <code>1, 5, 15, 30, 60, D, W, M </code>.Some timeframes might not be available depending on the exchange.
        try {
            AggregateIndicators result = apiInstance.aggregateIndicator(symbol, resolution);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#aggregateIndicator");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| symbol | |
| **resolution** | **String**| Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. | |

### Return type

[**AggregateIndicators**](AggregateIndicators.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## aiChat

> AIChatResponse aiChat(search)

AI Copilot

&lt;p&gt;Chat with our AI copilot powered by Neyman AI trained on the extensive Finnhub&#39;s global data. You can ask it any finance-related questions just like with other LLM models and receive results in texts and widgets.&lt;/p&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        AIChatBody search = new AIChatBody(); // AIChatBody | Search body
        try {
            AIChatResponse result = apiInstance.aiChat(search);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#aiChat");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **search** | [**AIChatBody**](AIChatBody.md)| Search body | [optional] |

### Return type

[**AIChatResponse**](AIChatResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## airlinePriceIndex

> AirlinePriceIndexData airlinePriceIndex(airline, from, to)

Airline Price Index

&lt;p&gt;The Flight Ticket Price Index API provides comprehensive data on airline ticket prices, including the average daily ticket price and its percentage change (price index). This data, collected weekly and projected two weeks ahead, aggregates daily prices and indexes from the 50 busiest and largest airports across the USA. The dataset includes detailed information on airlines, dates, and average ticket prices, offering valuable insights for market analysis and pricing strategies.&lt;/p&gt;&lt;p&gt;The price index is calculated as percentage change of average daily ticket price from the previous weekly reading. Raw ticket prices data is available for Enterprise users. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact us&lt;/a&gt; to inquire about the raw price data.&lt;/p&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String airline = "airline_example"; // String | Filter data by airline. Accepted values: <code>united</code>,<code>delta</code>,<code>american_airlines</code>,<code>southwest</code>,<code>southern_airways_express</code>,<code>alaska_airlines</code>,<code>frontier_airlines</code>,<code>jetblue_airways</code>,<code>spirit_airlines</code>,<code>sun_country_airlines</code>,<code>breeze_airways</code>,<code>hawaiian_airlines</code>
        LocalDate from = LocalDate.now(); // LocalDate | From date <code>YYYY-MM-DD</code>.
        LocalDate to = LocalDate.now(); // LocalDate | To date <code>YYYY-MM-DD</code>.
        try {
            AirlinePriceIndexData result = apiInstance.airlinePriceIndex(airline, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#airlinePriceIndex");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **airline** | **String**| Filter data by airline. Accepted values: &lt;code&gt;united&lt;/code&gt;,&lt;code&gt;delta&lt;/code&gt;,&lt;code&gt;american_airlines&lt;/code&gt;,&lt;code&gt;southwest&lt;/code&gt;,&lt;code&gt;southern_airways_express&lt;/code&gt;,&lt;code&gt;alaska_airlines&lt;/code&gt;,&lt;code&gt;frontier_airlines&lt;/code&gt;,&lt;code&gt;jetblue_airways&lt;/code&gt;,&lt;code&gt;spirit_airlines&lt;/code&gt;,&lt;code&gt;sun_country_airlines&lt;/code&gt;,&lt;code&gt;breeze_airways&lt;/code&gt;,&lt;code&gt;hawaiian_airlines&lt;/code&gt; | |
| **from** | **LocalDate**| From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | |
| **to** | **LocalDate**| To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | |

### Return type

[**AirlinePriceIndexData**](AirlinePriceIndexData.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## bankBranch

> BankBranchRes bankBranch(symbol)

Bank Branch List

Retrieve list of US bank branches information for a given symbol.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Object symbol = null; // Object | Symbol.
        try {
            BankBranchRes result = apiInstance.bankBranch(symbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#bankBranch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | [**Object**](.md)| Symbol. | |

### Return type

[**BankBranchRes**](BankBranchRes.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## bondPrice

> BondCandles bondPrice(isin, from, to)

Bond price data

&lt;p&gt;Get bond&#39;s price data. The following datasets are supported:&lt;/p&gt;&lt;table class&#x3D;\&quot;table table-hover\&quot;&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Exchange&lt;/th&gt;       &lt;th&gt;Segment&lt;/th&gt;       &lt;th&gt;Delay&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;   &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;US Government Bonds&lt;/th&gt;       &lt;td&gt;Government Bonds&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;BTDS: US Corporate Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;144A Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String isin = "isin_example"; // String | ISIN.
        Long from = 56L; // Long | UNIX timestamp. Interval initial value.
        Long to = 56L; // Long | UNIX timestamp. Interval end value.
        try {
            BondCandles result = apiInstance.bondPrice(isin, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#bondPrice");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isin** | **String**| ISIN. | |
| **from** | **Long**| UNIX timestamp. Interval initial value. | |
| **to** | **Long**| UNIX timestamp. Interval end value. | |

### Return type

[**BondCandles**](BondCandles.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## bondProfile

> BondProfile bondProfile(isin, cusip, figi)

Bond Profile

Get general information of a bond. You can query by FIGI, ISIN or CUSIP. A list of supported bonds can be found &lt;a href&#x3D;\&quot;/api/v1/bond/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String isin = "isin_example"; // String | ISIN
        String cusip = "cusip_example"; // String | CUSIP
        String figi = "figi_example"; // String | FIGI
        try {
            BondProfile result = apiInstance.bondProfile(isin, cusip, figi);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#bondProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isin** | **String**| ISIN | [optional] |
| **cusip** | **String**| CUSIP | [optional] |
| **figi** | **String**| FIGI | [optional] |

### Return type

[**BondProfile**](BondProfile.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## bondTick

> BondTickData bondTick(isin, date, limit, skip, exchange)

Bond Tick Data

&lt;p&gt;Get trade-level data for bonds. The following datasets are supported:&lt;/p&gt;&lt;table class&#x3D;\&quot;table table-hover\&quot;&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Exchange&lt;/th&gt;       &lt;th&gt;Segment&lt;/th&gt;       &lt;th&gt;Delay&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;BTDS: US Corporate Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;144A Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String isin = "isin_example"; // String | ISIN.
        LocalDate date = LocalDate.now(); // LocalDate | Date: 2020-04-02.
        Long limit = 56L; // Long | Limit number of ticks returned. Maximum value: <code>25000</code>
        Long skip = 56L; // Long | Number of ticks to skip. Use this parameter to loop through the entire data.
        String exchange = "exchange_example"; // String | Currently support the following values: <code>trace</code>.
        try {
            BondTickData result = apiInstance.bondTick(isin, date, limit, skip, exchange);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#bondTick");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isin** | **String**| ISIN. | |
| **date** | **LocalDate**| Date: 2020-04-02. | |
| **limit** | **Long**| Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; | |
| **skip** | **Long**| Number of ticks to skip. Use this parameter to loop through the entire data. | |
| **exchange** | **String**| Currently support the following values: &lt;code&gt;trace&lt;/code&gt;. | |

### Return type

[**BondTickData**](BondTickData.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## bondYieldCurve

> BondYieldCurve bondYieldCurve(code)

Bond Yield Curve

Get yield curve data for Treasury bonds.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String code = "code_example"; // String | Bond's code. You can find the list of supported code <a href=\"https://docs.google.com/spreadsheets/d/1iA-lM0Kht7lsQZ7Uu_s6r2i1BbQNUNO9eGkO5-zglHg/edit?usp=sharing\" target=\"_blank\" rel=\"noopener\">here</a>.
        try {
            BondYieldCurve result = apiInstance.bondYieldCurve(code);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#bondYieldCurve");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **code** | **String**| Bond&#39;s code. You can find the list of supported code &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1iA-lM0Kht7lsQZ7Uu_s6r2i1BbQNUNO9eGkO5-zglHg/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener\&quot;&gt;here&lt;/a&gt;. | |

### Return type

[**BondYieldCurve**](BondYieldCurve.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## companyBasicFinancials

> BasicFinancials companyBasicFinancials(symbol, metric)

Basic Financials

Get company basic financials such as margin, P/E ratio, 52-week high/low etc.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
        String metric = "metric_example"; // String | Metric type. Can be 1 of the following values <code>all</code>
        try {
            BasicFinancials result = apiInstance.companyBasicFinancials(symbol, metric);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#companyBasicFinancials");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol of the company: AAPL. | |
| **metric** | **String**| Metric type. Can be 1 of the following values &lt;code&gt;all&lt;/code&gt; | |

### Return type

[**BasicFinancials**](BasicFinancials.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## companyEarnings

> List&lt;EarningResult&gt; companyEarnings(symbol, limit)

Earnings Surprises

Get company historical quarterly earnings surprise going back to 2000.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
        Long limit = 56L; // Long | Limit number of period returned. Leave blank to get the full history.
        try {
            List<EarningResult> result = apiInstance.companyEarnings(symbol, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#companyEarnings");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol of the company: AAPL. | |
| **limit** | **Long**| Limit number of period returned. Leave blank to get the full history. | [optional] |

### Return type

[**List&lt;EarningResult&gt;**](EarningResult.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## companyEarningsQualityScore

> CompanyEarningsQualityScore companyEarningsQualityScore(symbol, freq)

Company Earnings Quality Score

&lt;p&gt;This endpoint provides Earnings Quality Score for global companies.&lt;/p&gt;&lt;p&gt; Earnings quality refers to the extent to which current earnings predict future earnings. \&quot;High-quality\&quot; earnings are expected to persist, while \&quot;low-quality\&quot; earnings do not. A higher score means a higher earnings quality&lt;/p&gt;&lt;p&gt;Finnhub uses a proprietary model which takes into consideration 4 criteria:&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: unset; margin-left: 30px;\&quot;&gt;&lt;li&gt;Profitability&lt;/li&gt;&lt;li&gt;Growth&lt;/li&gt;&lt;li&gt;Cash Generation &amp; Capital Allocation&lt;/li&gt;&lt;li&gt;Leverage&lt;/li&gt;&lt;/ul&gt;&lt;br/&gt;&lt;p&gt;We then compare the metrics of each company in each category against its peers in the same industry to gauge how quality its earnings is.&lt;/p&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol.
        String freq = "freq_example"; // String | Frequency. Currently support <code>annual</code> and <code>quarterly</code>
        try {
            CompanyEarningsQualityScore result = apiInstance.companyEarningsQualityScore(symbol, freq);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#companyEarningsQualityScore");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol. | |
| **freq** | **String**| Frequency. Currently support &lt;code&gt;annual&lt;/code&gt; and &lt;code&gt;quarterly&lt;/code&gt; | |

### Return type

[**CompanyEarningsQualityScore**](CompanyEarningsQualityScore.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## companyEbitEstimates

> EbitEstimates companyEbitEstimates(symbol, freq)

EBIT Estimates

Get company&#39;s ebit estimates.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
        String freq = "freq_example"; // String | Can take 1 of the following values: <code>annual, quarterly</code>. Default to <code>quarterly</code>
        try {
            EbitEstimates result = apiInstance.companyEbitEstimates(symbol, freq);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#companyEbitEstimates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol of the company: AAPL. | |
| **freq** | **String**| Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; | [optional] |

### Return type

[**EbitEstimates**](EbitEstimates.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## companyEbitdaEstimates

> EbitdaEstimates companyEbitdaEstimates(symbol, freq)

EBITDA Estimates

Get company&#39;s ebitda estimates.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
        String freq = "freq_example"; // String | Can take 1 of the following values: <code>annual, quarterly</code>. Default to <code>quarterly</code>
        try {
            EbitdaEstimates result = apiInstance.companyEbitdaEstimates(symbol, freq);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#companyEbitdaEstimates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol of the company: AAPL. | |
| **freq** | **String**| Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; | [optional] |

### Return type

[**EbitdaEstimates**](EbitdaEstimates.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## companyEpsEstimates

> EarningsEstimates companyEpsEstimates(symbol, freq)

Earnings Estimates

Get company&#39;s EPS estimates.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
        String freq = "freq_example"; // String | Can take 1 of the following values: <code>annual, quarterly</code>. Default to <code>quarterly</code>
        try {
            EarningsEstimates result = apiInstance.companyEpsEstimates(symbol, freq);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#companyEpsEstimates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol of the company: AAPL. | |
| **freq** | **String**| Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; | [optional] |

### Return type

[**EarningsEstimates**](EarningsEstimates.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## companyEsgScore

> CompanyESG companyEsgScore(symbol)

Company ESG Scores

&lt;p&gt;This endpoint provides the latest ESG scores and important indicators for 7000+ global companies. The data is collected through company&#39;s public ESG disclosure and public sources.&lt;/p&gt;&lt;p&gt;Our ESG scoring models takes into account more than 150 different inputs to calculate the level of ESG risks and how well a company is managing them. A higher score means lower ESG risk or better ESG management. ESG scores are in the the range of 0-100. Some key indicators might contain letter-grade score from C- to A+ with C- is the lowest score and A+ is the highest score.&lt;/p&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol.
        try {
            CompanyESG result = apiInstance.companyEsgScore(symbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#companyEsgScore");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol. | |

### Return type

[**CompanyESG**](CompanyESG.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## companyExecutive

> CompanyExecutive companyExecutive(symbol)

Company Executive

Get a list of company&#39;s executives and members of the Board.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
        try {
            CompanyExecutive result = apiInstance.companyExecutive(symbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#companyExecutive");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol of the company: AAPL. | |

### Return type

[**CompanyExecutive**](CompanyExecutive.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## companyHistoricalEsgScore

> HistoricalCompanyESG companyHistoricalEsgScore(symbol)

Historical ESG Scores

&lt;p&gt;This endpoint provides historical ESG scores and important indicators for 7000+ global companies. The data is collected through company&#39;s public ESG disclosure and public sources.&lt;/p&gt;&lt;p&gt;Our ESG scoring models takes into account more than 150 different inputs to calculate the level of ESG risks and how well a company is managing them. A higher score means lower ESG risk or better ESG management. ESG scores are in the the range of 0-100. Some key indicators might contain letter-grade score from C- to A+ with C- is the lowest score and A+ is the highest score.&lt;/p&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol.
        try {
            HistoricalCompanyESG result = apiInstance.companyHistoricalEsgScore(symbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#companyHistoricalEsgScore");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol. | |

### Return type

[**HistoricalCompanyESG**](HistoricalCompanyESG.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## companyNews

> List&lt;CompanyNews&gt; companyNews(symbol, from, to)

Company News

List latest company news by symbol. This endpoint is only available for North American companies.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Company symbol.
        LocalDate from = LocalDate.now(); // LocalDate | From date <code>YYYY-MM-DD</code>.
        LocalDate to = LocalDate.now(); // LocalDate | To date <code>YYYY-MM-DD</code>.
        try {
            List<CompanyNews> result = apiInstance.companyNews(symbol, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#companyNews");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Company symbol. | |
| **from** | **LocalDate**| From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | |
| **to** | **LocalDate**| To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | |

### Return type

[**List&lt;CompanyNews&gt;**](CompanyNews.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## companyPeers

> List&lt;String&gt; companyPeers(symbol, grouping)

Peers

Get company peers. Return a list of peers operating in the same country and sector/industry.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
        String grouping = "grouping_example"; // String | Specify the grouping criteria for choosing peers.Supporter values: <code>sector</code>, <code>industry</code>, <code>subIndustry</code>. Default to <code>subIndustry</code>.
        try {
            List<String> result = apiInstance.companyPeers(symbol, grouping);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#companyPeers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol of the company: AAPL. | |
| **grouping** | **String**| Specify the grouping criteria for choosing peers.Supporter values: &lt;code&gt;sector&lt;/code&gt;, &lt;code&gt;industry&lt;/code&gt;, &lt;code&gt;subIndustry&lt;/code&gt;. Default to &lt;code&gt;subIndustry&lt;/code&gt;. | [optional] |

### Return type

**List&lt;String&gt;**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## companyProfile

> CompanyProfile companyProfile(symbol, isin, cusip)

Company Profile

Get general information of a company. You can query by symbol, ISIN or CUSIP

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol of the company: AAPL e.g.
        String isin = "isin_example"; // String | ISIN
        String cusip = "cusip_example"; // String | CUSIP
        try {
            CompanyProfile result = apiInstance.companyProfile(symbol, isin, cusip);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#companyProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol of the company: AAPL e.g. | [optional] |
| **isin** | **String**| ISIN | [optional] |
| **cusip** | **String**| CUSIP | [optional] |

### Return type

[**CompanyProfile**](CompanyProfile.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## companyProfile2

> CompanyProfile2 companyProfile2(symbol, isin, cusip)

Company Profile 2

Get general information of a company. You can query by symbol, ISIN or CUSIP. This is the free version of &lt;a href&#x3D;\&quot;#company-profile\&quot;&gt;Company Profile&lt;/a&gt;.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol of the company: AAPL e.g.
        String isin = "isin_example"; // String | ISIN
        String cusip = "cusip_example"; // String | CUSIP
        try {
            CompanyProfile2 result = apiInstance.companyProfile2(symbol, isin, cusip);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#companyProfile2");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol of the company: AAPL e.g. | [optional] |
| **isin** | **String**| ISIN | [optional] |
| **cusip** | **String**| CUSIP | [optional] |

### Return type

[**CompanyProfile2**](CompanyProfile2.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## companyRevenueEstimates

> RevenueEstimates companyRevenueEstimates(symbol, freq)

Revenue Estimates

Get company&#39;s revenue estimates.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
        String freq = "freq_example"; // String | Can take 1 of the following values: <code>annual, quarterly</code>. Default to <code>quarterly</code>
        try {
            RevenueEstimates result = apiInstance.companyRevenueEstimates(symbol, freq);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#companyRevenueEstimates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol of the company: AAPL. | |
| **freq** | **String**| Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; | [optional] |

### Return type

[**RevenueEstimates**](RevenueEstimates.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## congressionalTrading

> CongressionalTrading congressionalTrading(symbol, from, to)

Congressional Trading

Get stock trades data disclosed by members of congress.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
        LocalDate from = LocalDate.now(); // LocalDate | From date <code>YYYY-MM-DD</code>.
        LocalDate to = LocalDate.now(); // LocalDate | To date <code>YYYY-MM-DD</code>.
        try {
            CongressionalTrading result = apiInstance.congressionalTrading(symbol, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#congressionalTrading");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol of the company: AAPL. | |
| **from** | **LocalDate**| From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | |
| **to** | **LocalDate**| To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | |

### Return type

[**CongressionalTrading**](CongressionalTrading.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## country

> List&lt;CountryMetadata&gt; country()

Country Metadata

List all countries and metadata.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            List<CountryMetadata> result = apiInstance.country();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#country");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;CountryMetadata&gt;**](CountryMetadata.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## covid19

> List&lt;CovidInfo&gt; covid19()

COVID-19

Get real-time updates on the number of COVID-19 (Corona virus) cases in the US with a state-by-state breakdown. Data is sourced from CDC and reputable sources. You can also access this API &lt;a href&#x3D;\&quot;https://rapidapi.com/Finnhub/api/finnhub-real-time-covid-19\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;nofollow\&quot;&gt;here&lt;/a&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            List<CovidInfo> result = apiInstance.covid19();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#covid19");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;CovidInfo&gt;**](CovidInfo.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## cryptoCandles

> CryptoCandles cryptoCandles(symbol, resolution, from, to)

Crypto Candles

Get candlestick data for crypto symbols.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Use symbol returned in <code>/crypto/symbol</code> endpoint for this field.
        String resolution = "resolution_example"; // String | Supported resolution includes <code>1, 5, 15, 30, 60, D, W, M </code>.Some timeframes might not be available depending on the exchange.
        Long from = 56L; // Long | UNIX timestamp. Interval initial value.
        Long to = 56L; // Long | UNIX timestamp. Interval end value.
        try {
            CryptoCandles result = apiInstance.cryptoCandles(symbol, resolution, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#cryptoCandles");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Use symbol returned in &lt;code&gt;/crypto/symbol&lt;/code&gt; endpoint for this field. | |
| **resolution** | **String**| Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. | |
| **from** | **Long**| UNIX timestamp. Interval initial value. | |
| **to** | **Long**| UNIX timestamp. Interval end value. | |

### Return type

[**CryptoCandles**](CryptoCandles.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## cryptoExchanges

> List&lt;String&gt; cryptoExchanges()

Crypto Exchanges

List supported crypto exchanges

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            List<String> result = apiInstance.cryptoExchanges();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#cryptoExchanges");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## cryptoProfile

> CryptoProfile cryptoProfile(symbol)

Crypto Profile

Get crypto&#39;s profile.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Crypto symbol such as BTC or ETH.
        try {
            CryptoProfile result = apiInstance.cryptoProfile(symbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#cryptoProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Crypto symbol such as BTC or ETH. | |

### Return type

[**CryptoProfile**](CryptoProfile.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## cryptoSymbols

> List&lt;CryptoSymbol&gt; cryptoSymbols(exchange)

Crypto Symbol

List supported crypto symbols by exchange

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String exchange = "exchange_example"; // String | Exchange you want to get the list of symbols from.
        try {
            List<CryptoSymbol> result = apiInstance.cryptoSymbols(exchange);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#cryptoSymbols");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **exchange** | **String**| Exchange you want to get the list of symbols from. | |

### Return type

[**List&lt;CryptoSymbol&gt;**](CryptoSymbol.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## earningsCalendar

> EarningsCalendar earningsCalendar(from, to, symbol, international)

Earnings Calendar

Get historical and coming earnings release. EPS and Revenue in this endpoint are non-GAAP, which means they are adjusted to exclude some one-time or unusual items. This is the same data investors usually react to and talked about on the media. Estimates are sourced from both sell-side and buy-side analysts.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        LocalDate from = LocalDate.now(); // LocalDate | From date: 2020-03-15.
        LocalDate to = LocalDate.now(); // LocalDate | To date: 2020-03-16.
        String symbol = "symbol_example"; // String | Filter by symbol: AAPL.
        Boolean international = true; // Boolean | Set to <code>true</code> to include international markets. Default value is <code>false</code>
        try {
            EarningsCalendar result = apiInstance.earningsCalendar(from, to, symbol, international);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#earningsCalendar");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **from** | **LocalDate**| From date: 2020-03-15. | [optional] |
| **to** | **LocalDate**| To date: 2020-03-16. | [optional] |
| **symbol** | **String**| Filter by symbol: AAPL. | [optional] |
| **international** | **Boolean**| Set to &lt;code&gt;true&lt;/code&gt; to include international markets. Default value is &lt;code&gt;false&lt;/code&gt; | [optional] |

### Return type

[**EarningsCalendar**](EarningsCalendar.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## earningsCallLive

> EarningsCallLive earningsCallLive(from, to, symbol)

Earnings Call Audio Live

&lt;p&gt;Stream live earnings calls with data provided in the calendar. The data will be available in m3u8 format. mp3 files will be available once the calls finish in the &lt;code&gt;recording&lt;/code&gt; field.&lt;/p&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        LocalDate from = LocalDate.now(); // LocalDate | From date <code>YYYY-MM-DD</code>.
        LocalDate to = LocalDate.now(); // LocalDate | To date <code>YYYY-MM-DD</code>.
        String symbol = "symbol_example"; // String | Filter by symbol: AAPL.
        try {
            EarningsCallLive result = apiInstance.earningsCallLive(from, to, symbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#earningsCallLive");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **from** | **LocalDate**| From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | [optional] |
| **to** | **LocalDate**| To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | [optional] |
| **symbol** | **String**| Filter by symbol: AAPL. | [optional] |

### Return type

[**EarningsCallLive**](EarningsCallLive.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## economicCalendar

> EconomicCalendar economicCalendar(from, to)

Economic Calendar

&lt;p&gt;Get recent and upcoming economic releases.&lt;/p&gt;&lt;p&gt;Historical events and surprises are available for Enterprise clients.&lt;/p&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        LocalDate from = LocalDate.now(); // LocalDate | From date <code>YYYY-MM-DD</code>.
        LocalDate to = LocalDate.now(); // LocalDate | To date <code>YYYY-MM-DD</code>.
        try {
            EconomicCalendar result = apiInstance.economicCalendar(from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#economicCalendar");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **from** | **LocalDate**| From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | [optional] |
| **to** | **LocalDate**| To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | [optional] |

### Return type

[**EconomicCalendar**](EconomicCalendar.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## economicCode

> List&lt;EconomicCode&gt; economicCode()

Economic Code

List codes of supported economic data.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            List<EconomicCode> result = apiInstance.economicCode();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#economicCode");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;EconomicCode&gt;**](EconomicCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## economicData

> EconomicData economicData(code)

Economic Data

Get economic data.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String code = "code_example"; // String | Economic code.
        try {
            EconomicData result = apiInstance.economicData(code);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#economicData");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **code** | **String**| Economic code. | |

### Return type

[**EconomicData**](EconomicData.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## etfsCountryExposure

> ETFsCountryExposure etfsCountryExposure(symbol, isin)

ETFs Country Exposure

Get ETF country exposure data.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | ETF symbol.
        String isin = "isin_example"; // String | ETF isin.
        try {
            ETFsCountryExposure result = apiInstance.etfsCountryExposure(symbol, isin);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#etfsCountryExposure");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| ETF symbol. | [optional] |
| **isin** | **String**| ETF isin. | [optional] |

### Return type

[**ETFsCountryExposure**](ETFsCountryExposure.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## etfsHoldings

> ETFsHoldings etfsHoldings(symbol, isin, skip, date)

ETFs Holdings

Get full ETF holdings/constituents. This endpoint has global coverage. Widget only shows top 10 holdings. A list of supported ETFs can be found &lt;a href&#x3D;\&quot;/api/v1/etf/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | ETF symbol.
        String isin = "isin_example"; // String | ETF isin.
        Long skip = 56L; // Long | Skip the first n results. You can use this parameter to query historical constituents data. The latest result is returned if skip=0 or not set.
        String date = "date_example"; // String | Query holdings by date. You can use either this param or <code>skip</code> param, not both.
        try {
            ETFsHoldings result = apiInstance.etfsHoldings(symbol, isin, skip, date);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#etfsHoldings");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| ETF symbol. | [optional] |
| **isin** | **String**| ETF isin. | [optional] |
| **skip** | **Long**| Skip the first n results. You can use this parameter to query historical constituents data. The latest result is returned if skip&#x3D;0 or not set. | [optional] |
| **date** | **String**| Query holdings by date. You can use either this param or &lt;code&gt;skip&lt;/code&gt; param, not both. | [optional] |

### Return type

[**ETFsHoldings**](ETFsHoldings.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## etfsProfile

> ETFsProfile etfsProfile(symbol, isin)

ETFs Profile

Get ETF profile information. This endpoint has global coverage. A list of supported ETFs can be found &lt;a href&#x3D;\&quot;/api/v1/etf/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | ETF symbol.
        String isin = "isin_example"; // String | ETF isin.
        try {
            ETFsProfile result = apiInstance.etfsProfile(symbol, isin);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#etfsProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| ETF symbol. | [optional] |
| **isin** | **String**| ETF isin. | [optional] |

### Return type

[**ETFsProfile**](ETFsProfile.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## etfsSectorExposure

> ETFsSectorExposure etfsSectorExposure(symbol, isin)

ETFs Sector Exposure

Get ETF sector exposure data.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | ETF symbol.
        String isin = "isin_example"; // String | ETF isin.
        try {
            ETFsSectorExposure result = apiInstance.etfsSectorExposure(symbol, isin);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#etfsSectorExposure");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| ETF symbol. | [optional] |
| **isin** | **String**| ETF isin. | [optional] |

### Return type

[**ETFsSectorExposure**](ETFsSectorExposure.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## fdaCommitteeMeetingCalendar

> List&lt;FDAComitteeMeeting&gt; fdaCommitteeMeetingCalendar()

FDA Committee Meeting Calendar

FDA&#39;s advisory committees are established to provide functions which support the agency&#39;s mission of protecting and promoting the public health, while meeting the requirements set forth in the Federal Advisory Committee Act. Committees are either mandated by statute or established at the discretion of the Department of Health and Human Services. Each committee is subject to renewal at two-year intervals unless the committee charter states otherwise.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            List<FDAComitteeMeeting> result = apiInstance.fdaCommitteeMeetingCalendar();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#fdaCommitteeMeetingCalendar");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;FDAComitteeMeeting&gt;**](FDAComitteeMeeting.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## filings

> List&lt;Filing&gt; filings(symbol, cik, accessNumber, form, from, to)

SEC Filings

List company&#39;s filing. Limit to 250 documents at a time. This data is available for bulk download on &lt;a href&#x3D;\&quot;https://www.kaggle.com/finnhub/sec-filings\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Kaggle SEC Filings database&lt;/a&gt;.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol. Leave <code>symbol</code>,<code>cik</code> and <code>accessNumber</code> empty to list latest filings.
        String cik = "cik_example"; // String | CIK.
        String accessNumber = "accessNumber_example"; // String | Access number of a specific report you want to retrieve data from.
        String form = "form_example"; // String | Filter by form. You can use this value <code>NT 10-K</code> to find non-timely filings for a company.
        LocalDate from = LocalDate.now(); // LocalDate | From date: 2023-03-15.
        LocalDate to = LocalDate.now(); // LocalDate | To date: 2023-03-16.
        try {
            List<Filing> result = apiInstance.filings(symbol, cik, accessNumber, form, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#filings");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol. Leave &lt;code&gt;symbol&lt;/code&gt;,&lt;code&gt;cik&lt;/code&gt; and &lt;code&gt;accessNumber&lt;/code&gt; empty to list latest filings. | [optional] |
| **cik** | **String**| CIK. | [optional] |
| **accessNumber** | **String**| Access number of a specific report you want to retrieve data from. | [optional] |
| **form** | **String**| Filter by form. You can use this value &lt;code&gt;NT 10-K&lt;/code&gt; to find non-timely filings for a company. | [optional] |
| **from** | **LocalDate**| From date: 2023-03-15. | [optional] |
| **to** | **LocalDate**| To date: 2023-03-16. | [optional] |

### Return type

[**List&lt;Filing&gt;**](Filing.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## filingsSentiment

> SECSentimentAnalysis filingsSentiment(accessNumber)

SEC Sentiment Analysis

Get sentiment analysis of 10-K and 10-Q filings from SEC. An abnormal increase in the number of positive/negative words in filings can signal a significant change in the company&#39;s stock price in the upcoming 4 quarters. We make use of &lt;a href&#x3D; \&quot;https://sraf.nd.edu/textual-analysis/resources/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Loughran and McDonald Sentiment Word Lists&lt;/a&gt; to calculate the sentiment for each filing.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String accessNumber = "accessNumber_example"; // String | Access number of a specific report you want to retrieve data from.
        try {
            SECSentimentAnalysis result = apiInstance.filingsSentiment(accessNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#filingsSentiment");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accessNumber** | **String**| Access number of a specific report you want to retrieve data from. | |

### Return type

[**SECSentimentAnalysis**](SECSentimentAnalysis.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## financials

> FinancialStatements financials(symbol, statement, freq)

Financial Statements

&lt;p&gt;Get standardized balance sheet, income statement and cash flow for global companies going back 30+ years. Data is sourced from original filings most of which made available through &lt;a href&#x3D;\&quot;#filings\&quot;&gt;SEC Filings&lt;/a&gt; and &lt;a href&#x3D;\&quot;#international-filings\&quot;&gt;International Filings&lt;/a&gt; endpoints.&lt;/p&gt;&lt;p&gt;&lt;i&gt;Wondering why our standardized data is different from Bloomberg, Reuters, Factset, S&amp;P or Yahoo Finance ? Check out our &lt;a href&#x3D;\&quot;/faq\&quot;&gt;FAQ page&lt;/a&gt; to learn more&lt;/i&gt;&lt;/p&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
        String statement = "statement_example"; // String | Statement can take 1 of these values <code>bs, ic, cf</code> for Balance Sheet, Income Statement, Cash Flow respectively.
        String freq = "freq_example"; // String | Frequency can take 1 of these values <code>annual, quarterly, ttm, ytd</code>.  TTM (Trailing Twelve Months) option is available for Income Statement and Cash Flow. YTD (Year To Date) option is only available for Cash Flow.
        try {
            FinancialStatements result = apiInstance.financials(symbol, statement, freq);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#financials");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol of the company: AAPL. | |
| **statement** | **String**| Statement can take 1 of these values &lt;code&gt;bs, ic, cf&lt;/code&gt; for Balance Sheet, Income Statement, Cash Flow respectively. | |
| **freq** | **String**| Frequency can take 1 of these values &lt;code&gt;annual, quarterly, ttm, ytd&lt;/code&gt;.  TTM (Trailing Twelve Months) option is available for Income Statement and Cash Flow. YTD (Year To Date) option is only available for Cash Flow. | |

### Return type

[**FinancialStatements**](FinancialStatements.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## financialsReported

> FinancialsAsReported financialsReported(symbol, cik, accessNumber, freq, from, to)

Financials As Reported

Get financials as reported. This data is available for bulk download on &lt;a href&#x3D;\&quot;https://www.kaggle.com/finnhub/reported-financials\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Kaggle SEC Financials database&lt;/a&gt;.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol.
        String cik = "cik_example"; // String | CIK.
        String accessNumber = "accessNumber_example"; // String | Access number of a specific report you want to retrieve financials from.
        String freq = "freq_example"; // String | Frequency. Can be either <code>annual</code> or <code>quarterly</code>. Default to <code>annual</code>.
        LocalDate from = LocalDate.now(); // LocalDate | From date <code>YYYY-MM-DD</code>. Filter for endDate.
        LocalDate to = LocalDate.now(); // LocalDate | To date <code>YYYY-MM-DD</code>. Filter for endDate.
        try {
            FinancialsAsReported result = apiInstance.financialsReported(symbol, cik, accessNumber, freq, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#financialsReported");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol. | [optional] |
| **cik** | **String**| CIK. | [optional] |
| **accessNumber** | **String**| Access number of a specific report you want to retrieve financials from. | [optional] |
| **freq** | **String**| Frequency. Can be either &lt;code&gt;annual&lt;/code&gt; or &lt;code&gt;quarterly&lt;/code&gt;. Default to &lt;code&gt;annual&lt;/code&gt;. | [optional] |
| **from** | **LocalDate**| From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for endDate. | [optional] |
| **to** | **LocalDate**| To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for endDate. | [optional] |

### Return type

[**FinancialsAsReported**](FinancialsAsReported.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## forexCandles

> ForexCandles forexCandles(symbol, resolution, from, to)

Forex Candles

Get candlestick data for forex symbols.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Use symbol returned in <code>/forex/symbol</code> endpoint for this field.
        String resolution = "resolution_example"; // String | Supported resolution includes <code>1, 5, 15, 30, 60, D, W, M </code>.Some timeframes might not be available depending on the exchange.
        Long from = 56L; // Long | UNIX timestamp. Interval initial value.
        Long to = 56L; // Long | UNIX timestamp. Interval end value.
        try {
            ForexCandles result = apiInstance.forexCandles(symbol, resolution, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#forexCandles");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Use symbol returned in &lt;code&gt;/forex/symbol&lt;/code&gt; endpoint for this field. | |
| **resolution** | **String**| Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. | |
| **from** | **Long**| UNIX timestamp. Interval initial value. | |
| **to** | **Long**| UNIX timestamp. Interval end value. | |

### Return type

[**ForexCandles**](ForexCandles.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## forexExchanges

> List&lt;String&gt; forexExchanges()

Forex Exchanges

List supported forex exchanges

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            List<String> result = apiInstance.forexExchanges();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#forexExchanges");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## forexRates

> Forexrates forexRates(base, date)

Forex rates

Get rates for all forex pairs. Ideal for currency conversion

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String base = "base_example"; // String | Base currency. Default to EUR.
        String date = "date_example"; // String | Date. Leave blank to get the latest data.
        try {
            Forexrates result = apiInstance.forexRates(base, date);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#forexRates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **base** | **String**| Base currency. Default to EUR. | [optional] |
| **date** | **String**| Date. Leave blank to get the latest data. | [optional] |

### Return type

[**Forexrates**](Forexrates.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## forexSymbols

> List&lt;ForexSymbol&gt; forexSymbols(exchange)

Forex Symbol

List supported forex symbols.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String exchange = "exchange_example"; // String | Exchange you want to get the list of symbols from.
        try {
            List<ForexSymbol> result = apiInstance.forexSymbols(exchange);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#forexSymbols");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **exchange** | **String**| Exchange you want to get the list of symbols from. | |

### Return type

[**List&lt;ForexSymbol&gt;**](ForexSymbol.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## fundOwnership

> FundOwnership fundOwnership(symbol, limit)

Fund Ownership

Get a full list fund and institutional investors of a company in descending order of the number of shares held. Data is sourced from &lt;code&gt;13F form&lt;/code&gt;, &lt;code&gt;Schedule 13D&lt;/code&gt; and &lt;code&gt;13G&lt;/code&gt; for US market, &lt;code&gt;UK Share Register&lt;/code&gt; for UK market, &lt;code&gt;SEDI&lt;/code&gt; for Canadian market and equivalent filings for other international markets.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
        Long limit = 56L; // Long | Limit number of results. Leave empty to get the full list.
        try {
            FundOwnership result = apiInstance.fundOwnership(symbol, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#fundOwnership");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol of the company: AAPL. | |
| **limit** | **Long**| Limit number of results. Leave empty to get the full list. | [optional] |

### Return type

[**FundOwnership**](FundOwnership.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## globalFilingsDownload

> globalFilingsDownload(documentId)

Download Filings

&lt;p&gt;Download filings using document ids.&lt;/p&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String documentId = "documentId_example"; // String | Document's id. Note that this is different from filingId as 1 filing can contain multiple documents.
        try {
            apiInstance.globalFilingsDownload(documentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#globalFilingsDownload");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentId** | **String**| Document&#39;s id. Note that this is different from filingId as 1 filing can contain multiple documents. | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined



## globalFilingsSearch

> SearchResponse globalFilingsSearch(search)

Global Filings Search

&lt;p&gt;Search for best-matched filings across global companies&#39; filings, transcripts and press releases. You can filter by anything from symbol, ISIN to form type, and document sources.&lt;/p&gt;&lt;p&gt;This endpoint will return a list of documents that match your search criteria. If you would like to get the excerpts as well, please set &lt;code&gt;highlighted&lt;/code&gt; to &lt;code&gt;true&lt;/code&gt;. Once you have the list of documents, you can get a list of excerpts and positions to highlight the document using the &lt;code&gt;/search-in-filing&lt;/code&gt; endpoint&lt;/p&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        SearchBody search = new SearchBody(); // SearchBody | Search body
        try {
            SearchResponse result = apiInstance.globalFilingsSearch(search);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#globalFilingsSearch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **search** | [**SearchBody**](SearchBody.md)| Search body | [optional] |

### Return type

[**SearchResponse**](SearchResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## globalFilingsSearchFilter

> SearchFilter globalFilingsSearchFilter(field, source)

Search Filter

&lt;p&gt;Get available values for each filter in search body.&lt;/p&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String field = "field_example"; // String | Field to get available filters. Available filters are \"countries\", \"exchanges\", \"exhibits\", \"forms\", \"gics\", \"naics\", \"caps\", \"acts\", and \"sort\".
        String source = "source_example"; // String | Get available forms for each source.
        try {
            SearchFilter result = apiInstance.globalFilingsSearchFilter(field, source);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#globalFilingsSearchFilter");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **field** | **String**| Field to get available filters. Available filters are \&quot;countries\&quot;, \&quot;exchanges\&quot;, \&quot;exhibits\&quot;, \&quot;forms\&quot;, \&quot;gics\&quot;, \&quot;naics\&quot;, \&quot;caps\&quot;, \&quot;acts\&quot;, and \&quot;sort\&quot;. | |
| **source** | **String**| Get available forms for each source. | [optional] |

### Return type

[**SearchFilter**](SearchFilter.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## historicalEmployeeCount

> HistoricalEmployeeCount historicalEmployeeCount(symbol, from, to)

Historical Employee Count

Get historical employee count for global companies.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Company symbol.
        LocalDate from = LocalDate.now(); // LocalDate | From date <code>YYYY-MM-DD</code>.
        LocalDate to = LocalDate.now(); // LocalDate | To date <code>YYYY-MM-DD</code>.
        try {
            HistoricalEmployeeCount result = apiInstance.historicalEmployeeCount(symbol, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#historicalEmployeeCount");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Company symbol. | |
| **from** | **LocalDate**| From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | |
| **to** | **LocalDate**| To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | |

### Return type

[**HistoricalEmployeeCount**](HistoricalEmployeeCount.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## historicalMarketCap

> HistoricalMarketCapData historicalMarketCap(symbol, from, to)

Historical Market Cap

Get historical market cap data for global companies.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Company symbol.
        LocalDate from = LocalDate.now(); // LocalDate | From date <code>YYYY-MM-DD</code>.
        LocalDate to = LocalDate.now(); // LocalDate | To date <code>YYYY-MM-DD</code>.
        try {
            HistoricalMarketCapData result = apiInstance.historicalMarketCap(symbol, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#historicalMarketCap");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Company symbol. | |
| **from** | **LocalDate**| From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | |
| **to** | **LocalDate**| To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | |

### Return type

[**HistoricalMarketCapData**](HistoricalMarketCapData.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## indicesConstituents

> IndicesConstituents indicesConstituents(symbol)

Indices Constituents

Get a list of index&#39;s constituents. A list of supported indices for this endpoint can be found &lt;a href&#x3D;\&quot;/api/v1/index/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | symbol
        try {
            IndicesConstituents result = apiInstance.indicesConstituents(symbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#indicesConstituents");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| symbol | |

### Return type

[**IndicesConstituents**](IndicesConstituents.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## indicesHistoricalConstituents

> IndicesHistoricalConstituents indicesHistoricalConstituents(symbol)

Indices Historical Constituents

Get full history of index&#39;s constituents including symbols and dates of joining and leaving the Index. Currently support &lt;code&gt;^GSPC&lt;/code&gt;, &lt;code&gt;^NDX&lt;/code&gt;, &lt;code&gt;^DJI&lt;/code&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | symbol
        try {
            IndicesHistoricalConstituents result = apiInstance.indicesHistoricalConstituents(symbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#indicesHistoricalConstituents");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| symbol | |

### Return type

[**IndicesHistoricalConstituents**](IndicesHistoricalConstituents.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## insiderSentiment

> InsiderSentiments insiderSentiment(symbol, from, to)

Insider Sentiment

Get insider sentiment data for US companies calculated using method discussed &lt;a href&#x3D;\&quot;https://medium.com/@stock-api/finnhub-insiders-sentiment-analysis-cc43f9f64b3a\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. The MSPR ranges from -100 for the most negative to 100 for the most positive which can signal price changes in the coming 30-90 days.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
        LocalDate from = LocalDate.now(); // LocalDate | From date: 2020-03-15.
        LocalDate to = LocalDate.now(); // LocalDate | To date: 2020-03-16.
        try {
            InsiderSentiments result = apiInstance.insiderSentiment(symbol, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#insiderSentiment");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol of the company: AAPL. | |
| **from** | **LocalDate**| From date: 2020-03-15. | |
| **to** | **LocalDate**| To date: 2020-03-16. | |

### Return type

[**InsiderSentiments**](InsiderSentiments.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## insiderTransactions

> InsiderTransactions insiderTransactions(symbol, from, to)

Insider Transactions

Company insider transactions data sourced from &lt;code&gt;Form 3,4,5&lt;/code&gt;, SEDI and relevant companies&#39; filings. This endpoint covers US, UK, Canada, Australia, India, and all major EU markets. Limit to 100 transactions per API call.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol of the company: AAPL. Leave this param blank to get the latest transactions.
        LocalDate from = LocalDate.now(); // LocalDate | From date: 2020-03-15.
        LocalDate to = LocalDate.now(); // LocalDate | To date: 2020-03-16.
        try {
            InsiderTransactions result = apiInstance.insiderTransactions(symbol, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#insiderTransactions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol of the company: AAPL. Leave this param blank to get the latest transactions. | |
| **from** | **LocalDate**| From date: 2020-03-15. | [optional] |
| **to** | **LocalDate**| To date: 2020-03-16. | [optional] |

### Return type

[**InsiderTransactions**](InsiderTransactions.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## institutionalOwnership

> InstitutionalOwnership institutionalOwnership(symbol, cusip, from, to)

Institutional Ownership

Get a list institutional investors&#39; positions for a particular stock overtime. Data from 13-F filings. Limit to 1 year of data at a time.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Filter by symbol.
        String cusip = "cusip_example"; // String | Filter by CUSIP.
        String from = "from_example"; // String | From date <code>YYYY-MM-DD</code>.
        String to = "to_example"; // String | To date <code>YYYY-MM-DD</code>.
        try {
            InstitutionalOwnership result = apiInstance.institutionalOwnership(symbol, cusip, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#institutionalOwnership");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Filter by symbol. | |
| **cusip** | **String**| Filter by CUSIP. | |
| **from** | **String**| From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | |
| **to** | **String**| To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | |

### Return type

[**InstitutionalOwnership**](InstitutionalOwnership.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## institutionalPortfolio

> InstitutionalPortfolio institutionalPortfolio(cik, from, to)

Institutional Portfolio

Get the holdings/portfolio data of institutional investors from 13-F filings. Limit to 1 year of data at a time. You can get a list of supported CIK &lt;a href&#x3D;\&quot;/api/v1/institutional/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String cik = "cik_example"; // String | Fund's CIK.
        String from = "from_example"; // String | From date <code>YYYY-MM-DD</code>.
        String to = "to_example"; // String | To date <code>YYYY-MM-DD</code>.
        try {
            InstitutionalPortfolio result = apiInstance.institutionalPortfolio(cik, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#institutionalPortfolio");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cik** | **String**| Fund&#39;s CIK. | |
| **from** | **String**| From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | |
| **to** | **String**| To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | |

### Return type

[**InstitutionalPortfolio**](InstitutionalPortfolio.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## institutionalProfile

> InstitutionalProfile institutionalProfile(cik)

Institutional Profile

Get a list of well-known institutional investors. Currently support 60+ profiles.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String cik = "cik_example"; // String | Filter by CIK. Leave blank to get the full list.
        try {
            InstitutionalProfile result = apiInstance.institutionalProfile(cik);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#institutionalProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cik** | **String**| Filter by CIK. Leave blank to get the full list. | [optional] |

### Return type

[**InstitutionalProfile**](InstitutionalProfile.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## internationalFilings

> List&lt;InternationalFiling&gt; internationalFilings(symbol, country, from, to)

International Filings

List filings for international companies. Limit to 500 documents at a time. These are the documents we use to source our fundamental data. Enterprise clients who need access to the full filings for global markets should contact us for the access.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol. Leave empty to list latest filings.
        String country = "country_example"; // String | Filter by country using country's 2-letter code.
        LocalDate from = LocalDate.now(); // LocalDate | From date: 2023-01-15.
        LocalDate to = LocalDate.now(); // LocalDate | To date: 2023-12-16.
        try {
            List<InternationalFiling> result = apiInstance.internationalFilings(symbol, country, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#internationalFilings");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol. Leave empty to list latest filings. | [optional] |
| **country** | **String**| Filter by country using country&#39;s 2-letter code. | [optional] |
| **from** | **LocalDate**| From date: 2023-01-15. | [optional] |
| **to** | **LocalDate**| To date: 2023-12-16. | [optional] |

### Return type

[**List&lt;InternationalFiling&gt;**](InternationalFiling.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## investmentThemes

> InvestmentThemes investmentThemes(theme)

Investment Themes (Thematic Investing)

&lt;p&gt;Thematic investing involves creating a portfolio (or portion of a portfolio) by gathering together a collection of companies involved in certain areas that you predict will generate above-market returns over the long term. Themes can be based on a concept such as ageing populations or a sub-sector such as robotics, and drones. Thematic investing focuses on predicted long-term trends rather than specific companies or sectors, enabling investors to access structural, one-off shifts that can change an entire industry.&lt;/p&gt;&lt;p&gt;This endpoint will help you get portfolios of different investment themes that are changing our life and are the way of the future.&lt;/p&gt;&lt;p&gt;A full list of themes supported can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ULj9xDh4iPoQj279M084adZ2_S852ttRthKKJ7madYc/edit?usp&#x3D;sharing\&quot;&gt;here&lt;/a&gt;. The theme coverage and portfolios are updated bi-weekly by our analysts. Our approach excludes penny, super-small cap and illiquid stocks.&lt;/p&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String theme = "theme_example"; // String | Investment theme. A full list of themes supported can be found <a target=\"_blank\" href=\"https://docs.google.com/spreadsheets/d/1ULj9xDh4iPoQj279M084adZ2_S852ttRthKKJ7madYc/edit?usp=sharing\">here</a>.
        try {
            InvestmentThemes result = apiInstance.investmentThemes(theme);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#investmentThemes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **theme** | **String**| Investment theme. A full list of themes supported can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ULj9xDh4iPoQj279M084adZ2_S852ttRthKKJ7madYc/edit?usp&#x3D;sharing\&quot;&gt;here&lt;/a&gt;. | |

### Return type

[**InvestmentThemes**](InvestmentThemes.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## ipoCalendar

> IPOCalendar ipoCalendar(from, to)

IPO Calendar

Get recent and upcoming IPO.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        LocalDate from = LocalDate.now(); // LocalDate | From date: 2020-03-15.
        LocalDate to = LocalDate.now(); // LocalDate | To date: 2020-03-16.
        try {
            IPOCalendar result = apiInstance.ipoCalendar(from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#ipoCalendar");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **from** | **LocalDate**| From date: 2020-03-15. | |
| **to** | **LocalDate**| To date: 2020-03-16. | |

### Return type

[**IPOCalendar**](IPOCalendar.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## isinChange

> IsinChange isinChange(from, to)

ISIN Change

Get a list of ISIN changes for EU-listed securities. Limit to 2000 events at a time.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String from = "from_example"; // String | From date <code>YYYY-MM-DD</code>.
        String to = "to_example"; // String | To date <code>YYYY-MM-DD</code>.
        try {
            IsinChange result = apiInstance.isinChange(from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#isinChange");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **from** | **String**| From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | |
| **to** | **String**| To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | |

### Return type

[**IsinChange**](IsinChange.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## marketHoliday

> MarketHoliday marketHoliday(exchange)

Market Holiday

Get a list of holidays for global exchanges.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String exchange = "exchange_example"; // String | Exchange code.
        try {
            MarketHoliday result = apiInstance.marketHoliday(exchange);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#marketHoliday");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **exchange** | **String**| Exchange code. | |

### Return type

[**MarketHoliday**](MarketHoliday.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## marketNews

> List&lt;MarketNews&gt; marketNews(category, minId)

Market News

Get latest market news.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String category = "category_example"; // String | This parameter can be 1 of the following values <code>general, forex, crypto, merger</code>.
        Long minId = 56L; // Long | Use this field to get only news after this ID. Default to 0
        try {
            List<MarketNews> result = apiInstance.marketNews(category, minId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#marketNews");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **category** | **String**| This parameter can be 1 of the following values &lt;code&gt;general, forex, crypto, merger&lt;/code&gt;. | |
| **minId** | **Long**| Use this field to get only news after this ID. Default to 0 | [optional] |

### Return type

[**List&lt;MarketNews&gt;**](MarketNews.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## marketStatus

> MarketStatus marketStatus(exchange)

Market Status

Get current market status for global exchanges (whether exchanges are open or close).

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String exchange = "exchange_example"; // String | Exchange code.
        try {
            MarketStatus result = apiInstance.marketStatus(exchange);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#marketStatus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **exchange** | **String**| Exchange code. | |

### Return type

[**MarketStatus**](MarketStatus.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## mutualFundCountryExposure

> MutualFundCountryExposure mutualFundCountryExposure(symbol, isin)

Mutual Funds Country Exposure

Get Mutual Funds country exposure data.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol.
        String isin = "isin_example"; // String | Fund's isin.
        try {
            MutualFundCountryExposure result = apiInstance.mutualFundCountryExposure(symbol, isin);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#mutualFundCountryExposure");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol. | [optional] |
| **isin** | **String**| Fund&#39;s isin. | [optional] |

### Return type

[**MutualFundCountryExposure**](MutualFundCountryExposure.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## mutualFundEet

> MutualFundEet mutualFundEet(isin)

Mutual Funds EET

Get EET data for EU funds. For PAIs data, please see the EET PAI endpoint.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String isin = "isin_example"; // String | ISIN.
        try {
            MutualFundEet result = apiInstance.mutualFundEet(isin);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#mutualFundEet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isin** | **String**| ISIN. | |

### Return type

[**MutualFundEet**](MutualFundEet.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## mutualFundEetPai

> MutualFundEetPai mutualFundEetPai(isin)

Mutual Funds EET PAI

Get EET PAI data for EU funds.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String isin = "isin_example"; // String | ISIN.
        try {
            MutualFundEetPai result = apiInstance.mutualFundEetPai(isin);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#mutualFundEetPai");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isin** | **String**| ISIN. | |

### Return type

[**MutualFundEetPai**](MutualFundEetPai.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## mutualFundHoldings

> MutualFundHoldings mutualFundHoldings(symbol, isin, skip)

Mutual Funds Holdings

Get full Mutual Funds holdings/constituents. This endpoint covers both US and global mutual funds. For international funds, you must query the data using ISIN. A list of supported funds can be found &lt;a href&#x3D;\&quot;/api/v1/mutual-fund/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Fund's symbol.
        String isin = "isin_example"; // String | Fund's isin.
        Long skip = 56L; // Long | Skip the first n results. You can use this parameter to query historical constituents data. The latest result is returned if skip=0 or not set.
        try {
            MutualFundHoldings result = apiInstance.mutualFundHoldings(symbol, isin, skip);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#mutualFundHoldings");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Fund&#39;s symbol. | [optional] |
| **isin** | **String**| Fund&#39;s isin. | [optional] |
| **skip** | **Long**| Skip the first n results. You can use this parameter to query historical constituents data. The latest result is returned if skip&#x3D;0 or not set. | [optional] |

### Return type

[**MutualFundHoldings**](MutualFundHoldings.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## mutualFundProfile

> MutualFundProfile mutualFundProfile(symbol, isin)

Mutual Funds Profile

Get mutual funds profile information. This endpoint covers both US and global mutual funds. For international funds, you must query the data using ISIN. A list of supported funds can be found &lt;a href&#x3D;\&quot;/api/v1/mutual-fund/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Fund's symbol.
        String isin = "isin_example"; // String | Fund's isin.
        try {
            MutualFundProfile result = apiInstance.mutualFundProfile(symbol, isin);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#mutualFundProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Fund&#39;s symbol. | [optional] |
| **isin** | **String**| Fund&#39;s isin. | [optional] |

### Return type

[**MutualFundProfile**](MutualFundProfile.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## mutualFundSectorExposure

> MutualFundSectorExposure mutualFundSectorExposure(symbol, isin)

Mutual Funds Sector Exposure

Get Mutual Funds sector exposure data.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Mutual Fund symbol.
        String isin = "isin_example"; // String | Fund's isin.
        try {
            MutualFundSectorExposure result = apiInstance.mutualFundSectorExposure(symbol, isin);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#mutualFundSectorExposure");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Mutual Fund symbol. | [optional] |
| **isin** | **String**| Fund&#39;s isin. | [optional] |

### Return type

[**MutualFundSectorExposure**](MutualFundSectorExposure.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## newsSentiment

> NewsSentiment newsSentiment(symbol)

News Sentiment

Get company&#39;s news sentiment and statistics. This endpoint is only available for US companies.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Company symbol.
        try {
            NewsSentiment result = apiInstance.newsSentiment(symbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#newsSentiment");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Company symbol. | |

### Return type

[**NewsSentiment**](NewsSentiment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## ownership

> Ownership ownership(symbol, limit)

Ownership

Get a full list of shareholders of a company in descending order of the number of shares held. Data is sourced from &lt;code&gt;13F form&lt;/code&gt;, &lt;code&gt;Schedule 13D&lt;/code&gt; and &lt;code&gt;13G&lt;/code&gt; for US market, &lt;code&gt;UK Share Register&lt;/code&gt; for UK market, &lt;code&gt;SEDI&lt;/code&gt; for Canadian market and equivalent filings for other international markets.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
        Long limit = 56L; // Long | Limit number of results. Leave empty to get the full list.
        try {
            Ownership result = apiInstance.ownership(symbol, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#ownership");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol of the company: AAPL. | |
| **limit** | **Long**| Limit number of results. Leave empty to get the full list. | [optional] |

### Return type

[**Ownership**](Ownership.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## patternRecognition

> PatternRecognition patternRecognition(symbol, resolution)

Pattern Recognition

Run pattern recognition algorithm on a symbol. Support double top/bottom, triple top/bottom, head and shoulders, triangle, wedge, channel, flag, and candlestick patterns.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol
        String resolution = "resolution_example"; // String | Supported resolution includes <code>1, 5, 15, 30, 60, D, W, M </code>.Some timeframes might not be available depending on the exchange.
        try {
            PatternRecognition result = apiInstance.patternRecognition(symbol, resolution);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#patternRecognition");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol | |
| **resolution** | **String**| Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. | |

### Return type

[**PatternRecognition**](PatternRecognition.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## pressReleases

> PressRelease pressReleases(symbol, from, to)

Major Press Releases

&lt;p&gt;Get latest major press releases of a company. This data can be used to highlight the most significant events comprised of mostly press releases sourced from the exchanges, BusinessWire, AccessWire, GlobeNewswire, Newsfile, and PRNewswire.&lt;/p&gt;&lt;p&gt;Full-text press releases data is available for Enterprise clients. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact Us&lt;/a&gt; to learn more.&lt;/p&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Company symbol.
        LocalDate from = LocalDate.now(); // LocalDate | From time: 2020-01-01.
        LocalDate to = LocalDate.now(); // LocalDate | To time: 2020-01-05.
        try {
            PressRelease result = apiInstance.pressReleases(symbol, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#pressReleases");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Company symbol. | |
| **from** | **LocalDate**| From time: 2020-01-01. | [optional] |
| **to** | **LocalDate**| To time: 2020-01-05. | [optional] |

### Return type

[**PressRelease**](PressRelease.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## priceMetrics

> PriceMetrics priceMetrics(symbol, date)

Price Metrics

Get company price performance statistics such as 52-week high/low, YTD return and much more.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
        String date = "date_example"; // String | Get data on a specific date in the past. The data is available weekly so your date will be automatically adjusted to the last day of that week.
        try {
            PriceMetrics result = apiInstance.priceMetrics(symbol, date);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#priceMetrics");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol of the company: AAPL. | |
| **date** | **String**| Get data on a specific date in the past. The data is available weekly so your date will be automatically adjusted to the last day of that week. | [optional] |

### Return type

[**PriceMetrics**](PriceMetrics.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## priceTarget

> PriceTarget priceTarget(symbol)

Price Target

Get latest price target consensus.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
        try {
            PriceTarget result = apiInstance.priceTarget(symbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#priceTarget");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol of the company: AAPL. | |

### Return type

[**PriceTarget**](PriceTarget.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## quote

> Quote quote(symbol)

Quote

&lt;p&gt;Get real-time quote data for US stocks. Constant polling is not recommended. Use websocket if you need real-time updates.&lt;/p&gt;&lt;p&gt;Real-time stock prices for international markets are supported for Enterprise clients via our partner&#39;s feed. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact Us&lt;/a&gt; to learn more.&lt;/p&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol
        try {
            Quote result = apiInstance.quote(symbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#quote");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol | |

### Return type

[**Quote**](Quote.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## recommendationTrends

> List&lt;RecommendationTrend&gt; recommendationTrends(symbol)

Recommendation Trends

Get latest analyst recommendation trends for a company.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
        try {
            List<RecommendationTrend> result = apiInstance.recommendationTrends(symbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#recommendationTrends");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol of the company: AAPL. | |

### Return type

[**List&lt;RecommendationTrend&gt;**](RecommendationTrend.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## revenueBreakdown

> RevenueBreakdown revenueBreakdown(symbol, cik)

Revenue Breakdown

&lt;p&gt;Get revenue breakdown as-reporetd by product and geography. Users on personal plans can access data for US companies which disclose their revenue breakdown in the annual or quarterly reports.&lt;/p&gt;&lt;p&gt;Global standardized revenue breakdown/segments data is available for Enterprise users. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact us&lt;/a&gt; to inquire about the access for Global standardized data.&lt;/p&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol.
        String cik = "cik_example"; // String | CIK.
        try {
            RevenueBreakdown result = apiInstance.revenueBreakdown(symbol, cik);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#revenueBreakdown");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol. | [optional] |
| **cik** | **String**| CIK. | [optional] |

### Return type

[**RevenueBreakdown**](RevenueBreakdown.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## revenueBreakdown2

> RevenueBreakdown2 revenueBreakdown2(symbol)

Revenue Breakdown &amp; KPI

&lt;p&gt;Get standardized revenue breakdown and KPIs data for 30,000+ global companies.&lt;/p&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol.
        try {
            RevenueBreakdown2 result = apiInstance.revenueBreakdown2(symbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#revenueBreakdown2");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol. | |

### Return type

[**RevenueBreakdown2**](RevenueBreakdown2.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## searchInFiling

> InFilingResponse searchInFiling(search)

Search In Filing

&lt;p&gt;Get a list of excerpts and highlight positions within a document using your query.&lt;/p&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        InFilingSearchBody search = new InFilingSearchBody(); // InFilingSearchBody | Search body
        try {
            InFilingResponse result = apiInstance.searchInFiling(search);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#searchInFiling");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **search** | [**InFilingSearchBody**](InFilingSearchBody.md)| Search body | [optional] |

### Return type

[**InFilingResponse**](InFilingResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## sectorMetric

> SectorMetric sectorMetric(region)

Sector Metrics

Get ratios for different sectors and regions/indices.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String region = "region_example"; // String | Region. A list of supported values for this field can be found <a href=\"https://docs.google.com/spreadsheets/d/1afedyv7yWJ-z7pMjaAZK-f6ENY3mI3EBCk95QffpoHw/edit?usp=sharing\" target=\"_blank\">here</a>.
        try {
            SectorMetric result = apiInstance.sectorMetric(region);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#sectorMetric");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **region** | **String**| Region. A list of supported values for this field can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1afedyv7yWJ-z7pMjaAZK-f6ENY3mI3EBCk95QffpoHw/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. | |

### Return type

[**SectorMetric**](SectorMetric.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## similarityIndex

> SimilarityIndex similarityIndex(symbol, cik, freq)

Similarity Index

&lt;p&gt;Calculate the textual difference between a company&#39;s 10-K / 10-Q reports and the same type of report in the previous year using Cosine Similarity. For example, this endpoint compares 2019&#39;s 10-K with 2018&#39;s 10-K. Companies breaking from its routines in disclosure of financial condition and risk analysis section can signal a significant change in the company&#39;s stock price in the upcoming 4 quarters.&lt;/p&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol. Required if cik is empty
        String cik = "cik_example"; // String | CIK. Required if symbol is empty
        String freq = "freq_example"; // String | <code>annual</code> or <code>quarterly</code>. Default to <code>annual</code>
        try {
            SimilarityIndex result = apiInstance.similarityIndex(symbol, cik, freq);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#similarityIndex");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol. Required if cik is empty | [optional] |
| **cik** | **String**| CIK. Required if symbol is empty | [optional] |
| **freq** | **String**| &lt;code&gt;annual&lt;/code&gt; or &lt;code&gt;quarterly&lt;/code&gt;. Default to &lt;code&gt;annual&lt;/code&gt; | [optional] |

### Return type

[**SimilarityIndex**](SimilarityIndex.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## socialSentiment

> SocialSentiment socialSentiment(symbol, from, to)

Social Sentiment

&lt;p&gt;Get social sentiment for stocks on Reddit and Twitter.&lt;/p&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Company symbol.
        LocalDate from = LocalDate.now(); // LocalDate | From date <code>YYYY-MM-DD</code>.
        LocalDate to = LocalDate.now(); // LocalDate | To date <code>YYYY-MM-DD</code>.
        try {
            SocialSentiment result = apiInstance.socialSentiment(symbol, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#socialSentiment");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Company symbol. | |
| **from** | **LocalDate**| From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | [optional] |
| **to** | **LocalDate**| To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | [optional] |

### Return type

[**SocialSentiment**](SocialSentiment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## stockBasicDividends

> Dividends2 stockBasicDividends(symbol)

Dividends 2 (Basic)

Get global dividends data.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol.
        try {
            Dividends2 result = apiInstance.stockBasicDividends(symbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#stockBasicDividends");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol. | |

### Return type

[**Dividends2**](Dividends2.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## stockBidask

> LastBidAsk stockBidask(symbol)

Last Bid-Ask

Get last bid/ask data for US stocks.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol.
        try {
            LastBidAsk result = apiInstance.stockBidask(symbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#stockBidask");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol. | |

### Return type

[**LastBidAsk**](LastBidAsk.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## stockCandles

> StockCandles stockCandles(symbol, resolution, from, to)

Stock Candles

&lt;p&gt;Get candlestick data (OHLCV) for stocks.&lt;/p&gt;&lt;p&gt;Daily data will be adjusted for Splits. Intraday data will remain unadjusted. Only 1 month of intraday will be returned at a time. If you need more historical intraday data, please use the from and to params iteratively to request more data.&lt;/p&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol.
        String resolution = "resolution_example"; // String | Supported resolution includes <code>1, 5, 15, 30, 60, D, W, M </code>.Some timeframes might not be available depending on the exchange.
        Long from = 56L; // Long | UNIX timestamp. Interval initial value.
        Long to = 56L; // Long | UNIX timestamp. Interval end value.
        try {
            StockCandles result = apiInstance.stockCandles(symbol, resolution, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#stockCandles");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol. | |
| **resolution** | **String**| Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. | |
| **from** | **Long**| UNIX timestamp. Interval initial value. | |
| **to** | **Long**| UNIX timestamp. Interval end value. | |

### Return type

[**StockCandles**](StockCandles.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## stockDividends

> List&lt;Dividends&gt; stockDividends(symbol, from, to)

Dividends

Get dividends data for common stocks going back 30 years.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol.
        LocalDate from = LocalDate.now(); // LocalDate | YYYY-MM-DD.
        LocalDate to = LocalDate.now(); // LocalDate | YYYY-MM-DD.
        try {
            List<Dividends> result = apiInstance.stockDividends(symbol, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#stockDividends");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol. | |
| **from** | **LocalDate**| YYYY-MM-DD. | |
| **to** | **LocalDate**| YYYY-MM-DD. | |

### Return type

[**List&lt;Dividends&gt;**](Dividends.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## stockLobbying

> LobbyingResult stockLobbying(symbol, from, to)

Senate Lobbying

Get a list of reported lobbying activities in the Senate and the House.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol.
        LocalDate from = LocalDate.now(); // LocalDate | From date <code>YYYY-MM-DD</code>.
        LocalDate to = LocalDate.now(); // LocalDate | To date <code>YYYY-MM-DD</code>.
        try {
            LobbyingResult result = apiInstance.stockLobbying(symbol, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#stockLobbying");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol. | |
| **from** | **LocalDate**| From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | |
| **to** | **LocalDate**| To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | |

### Return type

[**LobbyingResult**](LobbyingResult.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## stockNbbo

> HistoricalNBBO stockNbbo(symbol, date, limit, skip)

Historical NBBO

&lt;p&gt;Get historical best bid and offer for US stocks, LSE, TSX, Euronext and Deutsche Borse.&lt;/p&gt;&lt;p&gt;For US market, this endpoint only serves historical NBBO from the beginning of 2020. To download more historical data, please visit our bulk download page in the Dashboard &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/dashboard/download\&quot;,&gt;here&lt;/a&gt;.&lt;/p&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol.
        LocalDate date = LocalDate.now(); // LocalDate | Date: 2020-04-02.
        Long limit = 56L; // Long | Limit number of ticks returned. Maximum value: <code>25000</code>
        Long skip = 56L; // Long | Number of ticks to skip. Use this parameter to loop through the entire data.
        try {
            HistoricalNBBO result = apiInstance.stockNbbo(symbol, date, limit, skip);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#stockNbbo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol. | |
| **date** | **LocalDate**| Date: 2020-04-02. | |
| **limit** | **Long**| Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; | |
| **skip** | **Long**| Number of ticks to skip. Use this parameter to loop through the entire data. | |

### Return type

[**HistoricalNBBO**](HistoricalNBBO.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## stockPresentation

> StockPresentation stockPresentation(symbol)

Company Presentation

&lt;p&gt;Get presentations/slides data in PDF format that are usually used during earnings calls.&lt;/p&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Company symbol.
        try {
            StockPresentation result = apiInstance.stockPresentation(symbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#stockPresentation");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Company symbol. | |

### Return type

[**StockPresentation**](StockPresentation.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## stockSplits

> List&lt;Split&gt; stockSplits(symbol, from, to)

Splits

Get splits data for stocks.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol.
        LocalDate from = LocalDate.now(); // LocalDate | YYYY-MM-DD.
        LocalDate to = LocalDate.now(); // LocalDate | YYYY-MM-DD.
        try {
            List<Split> result = apiInstance.stockSplits(symbol, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#stockSplits");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol. | |
| **from** | **LocalDate**| YYYY-MM-DD. | |
| **to** | **LocalDate**| YYYY-MM-DD. | |

### Return type

[**List&lt;Split&gt;**](Split.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## stockSymbols

> List&lt;StockSymbol&gt; stockSymbols(exchange, mic, securityType, currency)

Stock Symbol

List supported stocks. We use the following symbology to identify stocks on Finnhub &lt;code&gt;Exchange_Ticker.Exchange_Code&lt;/code&gt;. A list of supported exchange codes can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1I3pBxjfXB056-g_JYf_6o3Rns3BV2kMGG1nCatb91ls/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String exchange = "exchange_example"; // String | Exchange you want to get the list of symbols from. List of exchange codes can be found <a href=\"https://docs.google.com/spreadsheets/d/1I3pBxjfXB056-g_JYf_6o3Rns3BV2kMGG1nCatb91ls/edit?usp=sharing\" target=\"_blank\">here</a>.
        String mic = "mic_example"; // String | Filter by MIC code.
        String securityType = "securityType_example"; // String | Filter by security type used by OpenFigi standard.
        String currency = "currency_example"; // String | Filter by currency.
        try {
            List<StockSymbol> result = apiInstance.stockSymbols(exchange, mic, securityType, currency);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#stockSymbols");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **exchange** | **String**| Exchange you want to get the list of symbols from. List of exchange codes can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1I3pBxjfXB056-g_JYf_6o3Rns3BV2kMGG1nCatb91ls/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. | |
| **mic** | **String**| Filter by MIC code. | [optional] |
| **securityType** | **String**| Filter by security type used by OpenFigi standard. | [optional] |
| **currency** | **String**| Filter by currency. | [optional] |

### Return type

[**List&lt;StockSymbol&gt;**](StockSymbol.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## stockTick

> TickData stockTick(symbol, date, limit, skip)

Tick Data

&lt;p&gt;Get historical tick data for global exchanges.&lt;/p&gt;&lt;p&gt;For more historical tick data, you can visit our bulk download page in the Dashboard &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/dashboard/download\&quot;,&gt;here&lt;/a&gt; to speed up the download process.&lt;/p&gt;&lt;table class&#x3D;\&quot;table table-hover\&quot;&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Exchange&lt;/th&gt;       &lt;th&gt;Segment&lt;/th&gt;       &lt;th&gt;Delay&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;US CTA/UTP&lt;/th&gt;       &lt;td&gt;Full SIP&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;TSX&lt;/th&gt;       &lt;td&gt;&lt;ul&gt;&lt;li&gt;TSX&lt;/li&gt;&lt;li&gt;TSX Venture&lt;/li&gt;&lt;li&gt;Index&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;LSE&lt;/th&gt;       &lt;td&gt;&lt;ul&gt;&lt;li&gt;London Stock Exchange (L)&lt;/li&gt;&lt;li&gt;LSE International (L)&lt;/li&gt;&lt;li&gt;LSE European (L)&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;15 minute&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;Euronext&lt;/th&gt;       &lt;td&gt;&lt;ul&gt; &lt;li&gt;Euronext Paris (PA)&lt;/li&gt; &lt;li&gt;Euronext Amsterdam (AS)&lt;/li&gt; &lt;li&gt;Euronext Lisbon (LS)&lt;/li&gt; &lt;li&gt;Euronext Brussels (BR)&lt;/li&gt; &lt;li&gt;Euronext Oslo (OL)&lt;/li&gt; &lt;li&gt;Euronext London (LN)&lt;/li&gt; &lt;li&gt;Euronext Dublin (IR)&lt;/li&gt; &lt;li&gt;Index&lt;/li&gt; &lt;li&gt;Warrant&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;Deutsche Börse&lt;/th&gt;       &lt;td&gt;&lt;ul&gt; &lt;li&gt;Frankfurt (F)&lt;/li&gt; &lt;li&gt;Xetra (DE)&lt;/li&gt; &lt;li&gt;Duesseldorf (DU)&lt;/li&gt; &lt;li&gt;Hamburg (HM)&lt;/li&gt; &lt;li&gt;Berlin (BE)&lt;/li&gt; &lt;li&gt;Hanover (HA)&lt;/li&gt; &lt;li&gt;Stoxx (SX)&lt;/li&gt; &lt;li&gt;TradeGate (TG)&lt;/li&gt; &lt;li&gt;Zertifikate (SC)&lt;/li&gt; &lt;li&gt;Index&lt;/li&gt; &lt;li&gt;Warrant&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol.
        LocalDate date = LocalDate.now(); // LocalDate | Date: 2020-04-02.
        Long limit = 56L; // Long | Limit number of ticks returned. Maximum value: <code>25000</code>
        Long skip = 56L; // Long | Number of ticks to skip. Use this parameter to loop through the entire data.
        try {
            TickData result = apiInstance.stockTick(symbol, date, limit, skip);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#stockTick");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol. | |
| **date** | **LocalDate**| Date: 2020-04-02. | |
| **limit** | **Long**| Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; | |
| **skip** | **Long**| Number of ticks to skip. Use this parameter to loop through the entire data. | |

### Return type

[**TickData**](TickData.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## stockUsaSpending

> UsaSpendingResult stockUsaSpending(symbol, from, to)

USA Spending

Get a list of government&#39;s spending activities from USASpending dataset for public companies. This dataset can help you identify companies that win big government contracts which is extremely important for industries such as Defense, Aerospace, and Education.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol.
        LocalDate from = LocalDate.now(); // LocalDate | From date <code>YYYY-MM-DD</code>. Filter for <code>actionDate</code>
        LocalDate to = LocalDate.now(); // LocalDate | To date <code>YYYY-MM-DD</code>. Filter for <code>actionDate</code>
        try {
            UsaSpendingResult result = apiInstance.stockUsaSpending(symbol, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#stockUsaSpending");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol. | |
| **from** | **LocalDate**| From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for &lt;code&gt;actionDate&lt;/code&gt; | |
| **to** | **LocalDate**| To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for &lt;code&gt;actionDate&lt;/code&gt; | |

### Return type

[**UsaSpendingResult**](UsaSpendingResult.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## stockUsptoPatent

> UsptoPatentResult stockUsptoPatent(symbol, from, to)

USPTO Patents

List USPTO patents for companies. Limit to 250 records per API call.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol.
        LocalDate from = LocalDate.now(); // LocalDate | From date <code>YYYY-MM-DD</code>.
        LocalDate to = LocalDate.now(); // LocalDate | To date <code>YYYY-MM-DD</code>.
        try {
            UsptoPatentResult result = apiInstance.stockUsptoPatent(symbol, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#stockUsptoPatent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol. | |
| **from** | **LocalDate**| From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | |
| **to** | **LocalDate**| To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | |

### Return type

[**UsptoPatentResult**](UsptoPatentResult.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## stockVisaApplication

> VisaApplicationResult stockVisaApplication(symbol, from, to)

H1-B Visa Application

Get a list of H1-B and Permanent visa applications for companies from the DOL. The data is updated quarterly.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol.
        LocalDate from = LocalDate.now(); // LocalDate | From date <code>YYYY-MM-DD</code>. Filter on the <code>beginDate</code> column.
        LocalDate to = LocalDate.now(); // LocalDate | To date <code>YYYY-MM-DD</code>. Filter on the <code>beginDate</code> column.
        try {
            VisaApplicationResult result = apiInstance.stockVisaApplication(symbol, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#stockVisaApplication");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol. | |
| **from** | **LocalDate**| From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter on the &lt;code&gt;beginDate&lt;/code&gt; column. | |
| **to** | **LocalDate**| To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter on the &lt;code&gt;beginDate&lt;/code&gt; column. | |

### Return type

[**VisaApplicationResult**](VisaApplicationResult.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## supplyChainRelationships

> SupplyChainRelationships supplyChainRelationships(symbol)

Supply Chain Relationships

&lt;p&gt;This endpoint provides an overall map of public companies&#39; key customers and suppliers. The data offers a deeper look into a company&#39;s supply chain and how products are created. The data will help investors manage risk, limit exposure or generate alpha-generating ideas and trading insights.&lt;/p&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol.
        try {
            SupplyChainRelationships result = apiInstance.supplyChainRelationships(symbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#supplyChainRelationships");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol. | |

### Return type

[**SupplyChainRelationships**](SupplyChainRelationships.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## supportResistance

> SupportResistance supportResistance(symbol, resolution)

Support/Resistance

Get support and resistance levels for a symbol.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol
        String resolution = "resolution_example"; // String | Supported resolution includes <code>1, 5, 15, 30, 60, D, W, M </code>.Some timeframes might not be available depending on the exchange.
        try {
            SupportResistance result = apiInstance.supportResistance(symbol, resolution);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#supportResistance");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol | |
| **resolution** | **String**| Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. | |

### Return type

[**SupportResistance**](SupportResistance.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## symbolChange

> SymbolChange symbolChange(from, to)

Symbol Change

Get a list of symbol changes for US-listed, EU-listed, NSE and ASX securities. Limit to 2000 events at a time.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String from = "from_example"; // String | From date <code>YYYY-MM-DD</code>.
        String to = "to_example"; // String | To date <code>YYYY-MM-DD</code>.
        try {
            SymbolChange result = apiInstance.symbolChange(from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#symbolChange");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **from** | **String**| From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | |
| **to** | **String**| To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | |

### Return type

[**SymbolChange**](SymbolChange.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## symbolSearch

> SymbolLookup symbolSearch(q, exchange)

Symbol Lookup

Search for best-matching symbols based on your query. You can input anything from symbol, security&#39;s name to ISIN and Cusip.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String q = "q_example"; // String | Query text can be symbol, name, isin, or cusip.
        String exchange = "exchange_example"; // String | Exchange limit.
        try {
            SymbolLookup result = apiInstance.symbolSearch(q, exchange);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#symbolSearch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **q** | **String**| Query text can be symbol, name, isin, or cusip. | |
| **exchange** | **String**| Exchange limit. | [optional] |

### Return type

[**SymbolLookup**](SymbolLookup.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## technicalIndicator

> Object technicalIndicator(symbol, resolution, from, to, indicator, indicatorFields)

Technical Indicators

Return technical indicator with price data. List of supported indicators can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | symbol
        String resolution = "resolution_example"; // String | Supported resolution includes <code>1, 5, 15, 30, 60, D, W, M </code>.Some timeframes might not be available depending on the exchange.
        Long from = 56L; // Long | UNIX timestamp. Interval initial value.
        Long to = 56L; // Long | UNIX timestamp. Interval end value.
        String indicator = "indicator_example"; // String | Indicator name. Full list can be found <a href=\"https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp=sharing\" target=\"_blank\">here</a>.
        Object indicatorFields = null; // Object | Check out <a href=\"https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp=sharing\" target=\"_blank\">this page</a> to see which indicators and params are supported.
        try {
            Object result = apiInstance.technicalIndicator(symbol, resolution, from, to, indicator, indicatorFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#technicalIndicator");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| symbol | |
| **resolution** | **String**| Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. | |
| **from** | **Long**| UNIX timestamp. Interval initial value. | |
| **to** | **Long**| UNIX timestamp. Interval end value. | |
| **indicator** | **String**| Indicator name. Full list can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. | |
| **indicatorFields** | **Object**| Check out &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;this page&lt;/a&gt; to see which indicators and params are supported. | [optional] |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## transcripts

> EarningsCallTranscripts transcripts(id)

Earnings Call Transcripts

&lt;p&gt;Get earnings call transcripts, audio and participants&#39; list. Data is available for US, UK, European, Australian and Canadian companies.&lt;p&gt;15+ years of data is available with 220,000+ audio which add up to 7TB in size.&lt;/p&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String id = "id_example"; // String | Transcript's id obtained with <a href=\"#transcripts-list\">Transcripts List endpoint</a>.
        try {
            EarningsCallTranscripts result = apiInstance.transcripts(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#transcripts");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Transcript&#39;s id obtained with &lt;a href&#x3D;\&quot;#transcripts-list\&quot;&gt;Transcripts List endpoint&lt;/a&gt;. | |

### Return type

[**EarningsCallTranscripts**](EarningsCallTranscripts.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## transcriptsList

> EarningsCallTranscriptsList transcriptsList(symbol)

Earnings Call Transcripts List

List earnings call transcripts&#39; metadata. This endpoint is available for US, UK, European, Australian and Canadian companies.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Company symbol: AAPL. Leave empty to list the latest transcripts
        try {
            EarningsCallTranscriptsList result = apiInstance.transcriptsList(symbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#transcriptsList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Company symbol: AAPL. Leave empty to list the latest transcripts | |

### Return type

[**EarningsCallTranscriptsList**](EarningsCallTranscriptsList.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## upgradeDowngrade

> List&lt;UpgradeDowngrade&gt; upgradeDowngrade(symbol, from, to)

Stock Upgrade/Downgrade

Get latest stock upgrade and downgrade.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://finnhub.io/api/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String symbol = "symbol_example"; // String | Symbol of the company: AAPL. If left blank, the API will return latest stock upgrades/downgrades.
        LocalDate from = LocalDate.now(); // LocalDate | From date: 2000-03-15.
        LocalDate to = LocalDate.now(); // LocalDate | To date: 2020-03-16.
        try {
            List<UpgradeDowngrade> result = apiInstance.upgradeDowngrade(symbol, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#upgradeDowngrade");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| Symbol of the company: AAPL. If left blank, the API will return latest stock upgrades/downgrades. | [optional] |
| **from** | **LocalDate**| From date: 2000-03-15. | [optional] |
| **to** | **LocalDate**| To date: 2020-03-16. | [optional] |

### Return type

[**List&lt;UpgradeDowngrade&gt;**](UpgradeDowngrade.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

