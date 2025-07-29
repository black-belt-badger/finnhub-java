package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
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
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface DefaultApi {

    void aggregateIndicator(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull String resolution, Handler<AsyncResult<AggregateIndicators>> handler);

    void aggregateIndicator(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull String resolution, ApiClient.AuthInfo authInfo, Handler<AsyncResult<AggregateIndicators>> handler);

    void aiChat(@javax.annotation.Nullable AIChatBody search, Handler<AsyncResult<AIChatResponse>> handler);

    void aiChat(@javax.annotation.Nullable AIChatBody search, ApiClient.AuthInfo authInfo, Handler<AsyncResult<AIChatResponse>> handler);

    void airlinePriceIndex(@javax.annotation.Nonnull String airline, @javax.annotation.Nonnull LocalDate from, @javax.annotation.Nonnull LocalDate to, Handler<AsyncResult<AirlinePriceIndexData>> handler);

    void airlinePriceIndex(@javax.annotation.Nonnull String airline, @javax.annotation.Nonnull LocalDate from, @javax.annotation.Nonnull LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<AirlinePriceIndexData>> handler);

    void bankBranch(@javax.annotation.Nonnull Object symbol, Handler<AsyncResult<BankBranchRes>> handler);

    void bankBranch(@javax.annotation.Nonnull Object symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<BankBranchRes>> handler);

    void bondPrice(@javax.annotation.Nonnull String isin, @javax.annotation.Nonnull Long from, @javax.annotation.Nonnull Long to, Handler<AsyncResult<BondCandles>> handler);

    void bondPrice(@javax.annotation.Nonnull String isin, @javax.annotation.Nonnull Long from, @javax.annotation.Nonnull Long to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<BondCandles>> handler);

    void bondProfile(@javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String figi, Handler<AsyncResult<BondProfile>> handler);

    void bondProfile(@javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String figi, ApiClient.AuthInfo authInfo, Handler<AsyncResult<BondProfile>> handler);

    void bondTick(@javax.annotation.Nonnull String isin, @javax.annotation.Nonnull LocalDate date, @javax.annotation.Nonnull Long limit, @javax.annotation.Nonnull Long skip, @javax.annotation.Nonnull String exchange, Handler<AsyncResult<BondTickData>> handler);

    void bondTick(@javax.annotation.Nonnull String isin, @javax.annotation.Nonnull LocalDate date, @javax.annotation.Nonnull Long limit, @javax.annotation.Nonnull Long skip, @javax.annotation.Nonnull String exchange, ApiClient.AuthInfo authInfo, Handler<AsyncResult<BondTickData>> handler);

    void bondYieldCurve(@javax.annotation.Nonnull String code, Handler<AsyncResult<BondYieldCurve>> handler);

    void bondYieldCurve(@javax.annotation.Nonnull String code, ApiClient.AuthInfo authInfo, Handler<AsyncResult<BondYieldCurve>> handler);

    void companyBasicFinancials(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull String metric, Handler<AsyncResult<BasicFinancials>> handler);

    void companyBasicFinancials(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull String metric, ApiClient.AuthInfo authInfo, Handler<AsyncResult<BasicFinancials>> handler);

    void companyEarnings(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable Long limit, Handler<AsyncResult<List<EarningResult>>> handler);

    void companyEarnings(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable Long limit, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<EarningResult>>> handler);

    void companyEarningsQualityScore(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull String freq, Handler<AsyncResult<CompanyEarningsQualityScore>> handler);

    void companyEarningsQualityScore(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull String freq, ApiClient.AuthInfo authInfo, Handler<AsyncResult<CompanyEarningsQualityScore>> handler);

    void companyEbitEstimates(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String freq, Handler<AsyncResult<EbitEstimates>> handler);

    void companyEbitEstimates(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String freq, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EbitEstimates>> handler);

    void companyEbitdaEstimates(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String freq, Handler<AsyncResult<EbitdaEstimates>> handler);

    void companyEbitdaEstimates(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String freq, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EbitdaEstimates>> handler);

    void companyEpsEstimates(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String freq, Handler<AsyncResult<EarningsEstimates>> handler);

    void companyEpsEstimates(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String freq, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EarningsEstimates>> handler);

    void companyEsgScore(@javax.annotation.Nonnull String symbol, Handler<AsyncResult<CompanyESG>> handler);

    void companyEsgScore(@javax.annotation.Nonnull String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<CompanyESG>> handler);

    void companyExecutive(@javax.annotation.Nonnull String symbol, Handler<AsyncResult<CompanyExecutive>> handler);

    void companyExecutive(@javax.annotation.Nonnull String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<CompanyExecutive>> handler);

    void companyHistoricalEsgScore(@javax.annotation.Nonnull String symbol, Handler<AsyncResult<HistoricalCompanyESG>> handler);

    void companyHistoricalEsgScore(@javax.annotation.Nonnull String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<HistoricalCompanyESG>> handler);

    void companyNews(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull LocalDate from, @javax.annotation.Nonnull LocalDate to, Handler<AsyncResult<List<CompanyNews>>> handler);

    void companyNews(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull LocalDate from, @javax.annotation.Nonnull LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<CompanyNews>>> handler);

    void companyPeers(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String grouping, Handler<AsyncResult<List<String>>> handler);

    void companyPeers(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String grouping, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<String>>> handler);

    void companyProfile(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, Handler<AsyncResult<CompanyProfile>> handler);

    void companyProfile(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, ApiClient.AuthInfo authInfo, Handler<AsyncResult<CompanyProfile>> handler);

    void companyProfile2(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, Handler<AsyncResult<CompanyProfile2>> handler);

    void companyProfile2(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, ApiClient.AuthInfo authInfo, Handler<AsyncResult<CompanyProfile2>> handler);

    void companyRevenueEstimates(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String freq, Handler<AsyncResult<RevenueEstimates>> handler);

    void companyRevenueEstimates(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String freq, ApiClient.AuthInfo authInfo, Handler<AsyncResult<RevenueEstimates>> handler);

    void congressionalTrading(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull LocalDate from, @javax.annotation.Nonnull LocalDate to, Handler<AsyncResult<CongressionalTrading>> handler);

    void congressionalTrading(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull LocalDate from, @javax.annotation.Nonnull LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<CongressionalTrading>> handler);

    void country(Handler<AsyncResult<List<CountryMetadata>>> handler);

    void country(ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<CountryMetadata>>> handler);

    void covid19(Handler<AsyncResult<List<CovidInfo>>> handler);

    void covid19(ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<CovidInfo>>> handler);

    void cryptoCandles(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull String resolution, @javax.annotation.Nonnull Long from, @javax.annotation.Nonnull Long to, Handler<AsyncResult<CryptoCandles>> handler);

    void cryptoCandles(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull String resolution, @javax.annotation.Nonnull Long from, @javax.annotation.Nonnull Long to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<CryptoCandles>> handler);

    void cryptoExchanges(Handler<AsyncResult<List<String>>> handler);

    void cryptoExchanges(ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<String>>> handler);

    void cryptoProfile(@javax.annotation.Nonnull String symbol, Handler<AsyncResult<CryptoProfile>> handler);

    void cryptoProfile(@javax.annotation.Nonnull String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<CryptoProfile>> handler);

    void cryptoSymbols(@javax.annotation.Nonnull String exchange, Handler<AsyncResult<List<CryptoSymbol>>> handler);

    void cryptoSymbols(@javax.annotation.Nonnull String exchange, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<CryptoSymbol>>> handler);

    void earningsCalendar(@javax.annotation.Nullable LocalDate from, @javax.annotation.Nullable LocalDate to, @javax.annotation.Nullable String symbol, @javax.annotation.Nullable Boolean international, Handler<AsyncResult<EarningsCalendar>> handler);

    void earningsCalendar(@javax.annotation.Nullable LocalDate from, @javax.annotation.Nullable LocalDate to, @javax.annotation.Nullable String symbol, @javax.annotation.Nullable Boolean international, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EarningsCalendar>> handler);

    void earningsCallLive(@javax.annotation.Nullable LocalDate from, @javax.annotation.Nullable LocalDate to, @javax.annotation.Nullable String symbol, Handler<AsyncResult<EarningsCallLive>> handler);

    void earningsCallLive(@javax.annotation.Nullable LocalDate from, @javax.annotation.Nullable LocalDate to, @javax.annotation.Nullable String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EarningsCallLive>> handler);

    void economicCalendar(@javax.annotation.Nullable LocalDate from, @javax.annotation.Nullable LocalDate to, Handler<AsyncResult<EconomicCalendar>> handler);

    void economicCalendar(@javax.annotation.Nullable LocalDate from, @javax.annotation.Nullable LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EconomicCalendar>> handler);

    void economicCode(Handler<AsyncResult<List<EconomicCode>>> handler);

    void economicCode(ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<EconomicCode>>> handler);

    void economicData(@javax.annotation.Nonnull String code, Handler<AsyncResult<EconomicData>> handler);

    void economicData(@javax.annotation.Nonnull String code, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EconomicData>> handler);

    void etfsCountryExposure(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, Handler<AsyncResult<ETFsCountryExposure>> handler);

    void etfsCountryExposure(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, ApiClient.AuthInfo authInfo, Handler<AsyncResult<ETFsCountryExposure>> handler);

    void etfsHoldings(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, @javax.annotation.Nullable Long skip, @javax.annotation.Nullable String date, Handler<AsyncResult<ETFsHoldings>> handler);

    void etfsHoldings(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, @javax.annotation.Nullable Long skip, @javax.annotation.Nullable String date, ApiClient.AuthInfo authInfo, Handler<AsyncResult<ETFsHoldings>> handler);

    void etfsProfile(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, Handler<AsyncResult<ETFsProfile>> handler);

    void etfsProfile(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, ApiClient.AuthInfo authInfo, Handler<AsyncResult<ETFsProfile>> handler);

    void etfsSectorExposure(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, Handler<AsyncResult<ETFsSectorExposure>> handler);

    void etfsSectorExposure(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, ApiClient.AuthInfo authInfo, Handler<AsyncResult<ETFsSectorExposure>> handler);

    void fdaCommitteeMeetingCalendar(Handler<AsyncResult<List<FDAComitteeMeeting>>> handler);

    void fdaCommitteeMeetingCalendar(ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<FDAComitteeMeeting>>> handler);

    void filings(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String accessNumber, @javax.annotation.Nullable String form, @javax.annotation.Nullable LocalDate from, @javax.annotation.Nullable LocalDate to, Handler<AsyncResult<List<Filing>>> handler);

    void filings(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String accessNumber, @javax.annotation.Nullable String form, @javax.annotation.Nullable LocalDate from, @javax.annotation.Nullable LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<Filing>>> handler);

    void filingsSentiment(@javax.annotation.Nonnull String accessNumber, Handler<AsyncResult<SECSentimentAnalysis>> handler);

    void filingsSentiment(@javax.annotation.Nonnull String accessNumber, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SECSentimentAnalysis>> handler);

    void financials(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull String statement, @javax.annotation.Nonnull String freq, Handler<AsyncResult<FinancialStatements>> handler);

    void financials(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull String statement, @javax.annotation.Nonnull String freq, ApiClient.AuthInfo authInfo, Handler<AsyncResult<FinancialStatements>> handler);

    void financialsReported(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String accessNumber, @javax.annotation.Nullable String freq, @javax.annotation.Nullable LocalDate from, @javax.annotation.Nullable LocalDate to, Handler<AsyncResult<FinancialsAsReported>> handler);

    void financialsReported(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String accessNumber, @javax.annotation.Nullable String freq, @javax.annotation.Nullable LocalDate from, @javax.annotation.Nullable LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<FinancialsAsReported>> handler);

    void forexCandles(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull String resolution, @javax.annotation.Nonnull Long from, @javax.annotation.Nonnull Long to, Handler<AsyncResult<ForexCandles>> handler);

    void forexCandles(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull String resolution, @javax.annotation.Nonnull Long from, @javax.annotation.Nonnull Long to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<ForexCandles>> handler);

    void forexExchanges(Handler<AsyncResult<List<String>>> handler);

    void forexExchanges(ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<String>>> handler);

    void forexRates(@javax.annotation.Nullable String base, @javax.annotation.Nullable String date, Handler<AsyncResult<Forexrates>> handler);

    void forexRates(@javax.annotation.Nullable String base, @javax.annotation.Nullable String date, ApiClient.AuthInfo authInfo, Handler<AsyncResult<Forexrates>> handler);

    void forexSymbols(@javax.annotation.Nonnull String exchange, Handler<AsyncResult<List<ForexSymbol>>> handler);

    void forexSymbols(@javax.annotation.Nonnull String exchange, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<ForexSymbol>>> handler);

    void fundOwnership(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable Long limit, Handler<AsyncResult<FundOwnership>> handler);

    void fundOwnership(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable Long limit, ApiClient.AuthInfo authInfo, Handler<AsyncResult<FundOwnership>> handler);

    void globalFilingsDownload(@javax.annotation.Nonnull String documentId, Handler<AsyncResult<Void>> handler);

    void globalFilingsDownload(@javax.annotation.Nonnull String documentId, ApiClient.AuthInfo authInfo, Handler<AsyncResult<Void>> handler);

    void globalFilingsSearch(@javax.annotation.Nullable SearchBody search, Handler<AsyncResult<SearchResponse>> handler);

    void globalFilingsSearch(@javax.annotation.Nullable SearchBody search, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SearchResponse>> handler);

    void globalFilingsSearchFilter(@javax.annotation.Nonnull String field, @javax.annotation.Nullable String source, Handler<AsyncResult<SearchFilter>> handler);

    void globalFilingsSearchFilter(@javax.annotation.Nonnull String field, @javax.annotation.Nullable String source, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SearchFilter>> handler);

    void historicalEmployeeCount(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull LocalDate from, @javax.annotation.Nonnull LocalDate to, Handler<AsyncResult<HistoricalEmployeeCount>> handler);

    void historicalEmployeeCount(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull LocalDate from, @javax.annotation.Nonnull LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<HistoricalEmployeeCount>> handler);

    void historicalMarketCap(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull LocalDate from, @javax.annotation.Nonnull LocalDate to, Handler<AsyncResult<HistoricalMarketCapData>> handler);

    void historicalMarketCap(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull LocalDate from, @javax.annotation.Nonnull LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<HistoricalMarketCapData>> handler);

    void indicesConstituents(@javax.annotation.Nonnull String symbol, Handler<AsyncResult<IndicesConstituents>> handler);

    void indicesConstituents(@javax.annotation.Nonnull String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<IndicesConstituents>> handler);

    void indicesHistoricalConstituents(@javax.annotation.Nonnull String symbol, Handler<AsyncResult<IndicesHistoricalConstituents>> handler);

    void indicesHistoricalConstituents(@javax.annotation.Nonnull String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<IndicesHistoricalConstituents>> handler);

    void insiderSentiment(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull LocalDate from, @javax.annotation.Nonnull LocalDate to, Handler<AsyncResult<InsiderSentiments>> handler);

    void insiderSentiment(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull LocalDate from, @javax.annotation.Nonnull LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<InsiderSentiments>> handler);

    void insiderTransactions(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable LocalDate from, @javax.annotation.Nullable LocalDate to, Handler<AsyncResult<InsiderTransactions>> handler);

    void insiderTransactions(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable LocalDate from, @javax.annotation.Nullable LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<InsiderTransactions>> handler);

    void institutionalOwnership(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull String cusip, @javax.annotation.Nonnull String from, @javax.annotation.Nonnull String to, Handler<AsyncResult<InstitutionalOwnership>> handler);

    void institutionalOwnership(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull String cusip, @javax.annotation.Nonnull String from, @javax.annotation.Nonnull String to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<InstitutionalOwnership>> handler);

    void institutionalPortfolio(@javax.annotation.Nonnull String cik, @javax.annotation.Nonnull String from, @javax.annotation.Nonnull String to, Handler<AsyncResult<InstitutionalPortfolio>> handler);

    void institutionalPortfolio(@javax.annotation.Nonnull String cik, @javax.annotation.Nonnull String from, @javax.annotation.Nonnull String to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<InstitutionalPortfolio>> handler);

    void institutionalProfile(@javax.annotation.Nullable String cik, Handler<AsyncResult<InstitutionalProfile>> handler);

    void institutionalProfile(@javax.annotation.Nullable String cik, ApiClient.AuthInfo authInfo, Handler<AsyncResult<InstitutionalProfile>> handler);

    void internationalFilings(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String country, @javax.annotation.Nullable LocalDate from, @javax.annotation.Nullable LocalDate to, Handler<AsyncResult<List<InternationalFiling>>> handler);

    void internationalFilings(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String country, @javax.annotation.Nullable LocalDate from, @javax.annotation.Nullable LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<InternationalFiling>>> handler);

    void investmentThemes(@javax.annotation.Nonnull String theme, Handler<AsyncResult<InvestmentThemes>> handler);

    void investmentThemes(@javax.annotation.Nonnull String theme, ApiClient.AuthInfo authInfo, Handler<AsyncResult<InvestmentThemes>> handler);

    void ipoCalendar(@javax.annotation.Nonnull LocalDate from, @javax.annotation.Nonnull LocalDate to, Handler<AsyncResult<IPOCalendar>> handler);

    void ipoCalendar(@javax.annotation.Nonnull LocalDate from, @javax.annotation.Nonnull LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<IPOCalendar>> handler);

    void isinChange(@javax.annotation.Nonnull String from, @javax.annotation.Nonnull String to, Handler<AsyncResult<IsinChange>> handler);

    void isinChange(@javax.annotation.Nonnull String from, @javax.annotation.Nonnull String to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<IsinChange>> handler);

    void marketHoliday(@javax.annotation.Nonnull String exchange, Handler<AsyncResult<MarketHoliday>> handler);

    void marketHoliday(@javax.annotation.Nonnull String exchange, ApiClient.AuthInfo authInfo, Handler<AsyncResult<MarketHoliday>> handler);

    void marketNews(@javax.annotation.Nonnull String category, @javax.annotation.Nullable Long minId, Handler<AsyncResult<List<MarketNews>>> handler);

    void marketNews(@javax.annotation.Nonnull String category, @javax.annotation.Nullable Long minId, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<MarketNews>>> handler);

    void marketStatus(@javax.annotation.Nonnull String exchange, Handler<AsyncResult<MarketStatus>> handler);

    void marketStatus(@javax.annotation.Nonnull String exchange, ApiClient.AuthInfo authInfo, Handler<AsyncResult<MarketStatus>> handler);

    void mutualFundCountryExposure(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, Handler<AsyncResult<MutualFundCountryExposure>> handler);

    void mutualFundCountryExposure(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, ApiClient.AuthInfo authInfo, Handler<AsyncResult<MutualFundCountryExposure>> handler);

    void mutualFundEet(@javax.annotation.Nonnull String isin, Handler<AsyncResult<MutualFundEet>> handler);

    void mutualFundEet(@javax.annotation.Nonnull String isin, ApiClient.AuthInfo authInfo, Handler<AsyncResult<MutualFundEet>> handler);

    void mutualFundEetPai(@javax.annotation.Nonnull String isin, Handler<AsyncResult<MutualFundEetPai>> handler);

    void mutualFundEetPai(@javax.annotation.Nonnull String isin, ApiClient.AuthInfo authInfo, Handler<AsyncResult<MutualFundEetPai>> handler);

    void mutualFundHoldings(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, @javax.annotation.Nullable Long skip, Handler<AsyncResult<MutualFundHoldings>> handler);

    void mutualFundHoldings(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, @javax.annotation.Nullable Long skip, ApiClient.AuthInfo authInfo, Handler<AsyncResult<MutualFundHoldings>> handler);

    void mutualFundProfile(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, Handler<AsyncResult<MutualFundProfile>> handler);

    void mutualFundProfile(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, ApiClient.AuthInfo authInfo, Handler<AsyncResult<MutualFundProfile>> handler);

    void mutualFundSectorExposure(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, Handler<AsyncResult<MutualFundSectorExposure>> handler);

    void mutualFundSectorExposure(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, ApiClient.AuthInfo authInfo, Handler<AsyncResult<MutualFundSectorExposure>> handler);

    void newsSentiment(@javax.annotation.Nonnull String symbol, Handler<AsyncResult<NewsSentiment>> handler);

    void newsSentiment(@javax.annotation.Nonnull String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<NewsSentiment>> handler);

    void ownership(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable Long limit, Handler<AsyncResult<Ownership>> handler);

    void ownership(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable Long limit, ApiClient.AuthInfo authInfo, Handler<AsyncResult<Ownership>> handler);

    void patternRecognition(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull String resolution, Handler<AsyncResult<PatternRecognition>> handler);

    void patternRecognition(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull String resolution, ApiClient.AuthInfo authInfo, Handler<AsyncResult<PatternRecognition>> handler);

    void pressReleases(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable LocalDate from, @javax.annotation.Nullable LocalDate to, Handler<AsyncResult<PressRelease>> handler);

    void pressReleases(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable LocalDate from, @javax.annotation.Nullable LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<PressRelease>> handler);

    void priceMetrics(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String date, Handler<AsyncResult<PriceMetrics>> handler);

    void priceMetrics(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String date, ApiClient.AuthInfo authInfo, Handler<AsyncResult<PriceMetrics>> handler);

    void priceTarget(@javax.annotation.Nonnull String symbol, Handler<AsyncResult<PriceTarget>> handler);

    void priceTarget(@javax.annotation.Nonnull String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<PriceTarget>> handler);

    void quote(@javax.annotation.Nonnull String symbol, Handler<AsyncResult<Quote>> handler);

    void quote(@javax.annotation.Nonnull String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<Quote>> handler);

    void recommendationTrends(@javax.annotation.Nonnull String symbol, Handler<AsyncResult<List<RecommendationTrend>>> handler);

    void recommendationTrends(@javax.annotation.Nonnull String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<RecommendationTrend>>> handler);

    void revenueBreakdown(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String cik, Handler<AsyncResult<RevenueBreakdown>> handler);

    void revenueBreakdown(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String cik, ApiClient.AuthInfo authInfo, Handler<AsyncResult<RevenueBreakdown>> handler);

    void revenueBreakdown2(@javax.annotation.Nonnull String symbol, Handler<AsyncResult<RevenueBreakdown2>> handler);

    void revenueBreakdown2(@javax.annotation.Nonnull String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<RevenueBreakdown2>> handler);

    void searchInFiling(@javax.annotation.Nullable InFilingSearchBody search, Handler<AsyncResult<InFilingResponse>> handler);

    void searchInFiling(@javax.annotation.Nullable InFilingSearchBody search, ApiClient.AuthInfo authInfo, Handler<AsyncResult<InFilingResponse>> handler);

    void sectorMetric(@javax.annotation.Nonnull String region, Handler<AsyncResult<SectorMetric>> handler);

    void sectorMetric(@javax.annotation.Nonnull String region, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SectorMetric>> handler);

    void similarityIndex(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String freq, Handler<AsyncResult<SimilarityIndex>> handler);

    void similarityIndex(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String freq, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SimilarityIndex>> handler);

    void socialSentiment(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable LocalDate from, @javax.annotation.Nullable LocalDate to, Handler<AsyncResult<SocialSentiment>> handler);

    void socialSentiment(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable LocalDate from, @javax.annotation.Nullable LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SocialSentiment>> handler);

    void stockBasicDividends(@javax.annotation.Nonnull String symbol, Handler<AsyncResult<Dividends2>> handler);

    void stockBasicDividends(@javax.annotation.Nonnull String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<Dividends2>> handler);

    void stockBidask(@javax.annotation.Nonnull String symbol, Handler<AsyncResult<LastBidAsk>> handler);

    void stockBidask(@javax.annotation.Nonnull String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<LastBidAsk>> handler);

    void stockCandles(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull String resolution, @javax.annotation.Nonnull Long from, @javax.annotation.Nonnull Long to, Handler<AsyncResult<StockCandles>> handler);

    void stockCandles(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull String resolution, @javax.annotation.Nonnull Long from, @javax.annotation.Nonnull Long to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<StockCandles>> handler);

    void stockDividends(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull LocalDate from, @javax.annotation.Nonnull LocalDate to, Handler<AsyncResult<List<Dividends>>> handler);

    void stockDividends(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull LocalDate from, @javax.annotation.Nonnull LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<Dividends>>> handler);

    void stockLobbying(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull LocalDate from, @javax.annotation.Nonnull LocalDate to, Handler<AsyncResult<LobbyingResult>> handler);

    void stockLobbying(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull LocalDate from, @javax.annotation.Nonnull LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<LobbyingResult>> handler);

    void stockNbbo(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull LocalDate date, @javax.annotation.Nonnull Long limit, @javax.annotation.Nonnull Long skip, Handler<AsyncResult<HistoricalNBBO>> handler);

    void stockNbbo(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull LocalDate date, @javax.annotation.Nonnull Long limit, @javax.annotation.Nonnull Long skip, ApiClient.AuthInfo authInfo, Handler<AsyncResult<HistoricalNBBO>> handler);

    void stockPresentation(@javax.annotation.Nonnull String symbol, Handler<AsyncResult<StockPresentation>> handler);

    void stockPresentation(@javax.annotation.Nonnull String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<StockPresentation>> handler);

    void stockSplits(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull LocalDate from, @javax.annotation.Nonnull LocalDate to, Handler<AsyncResult<List<Split>>> handler);

    void stockSplits(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull LocalDate from, @javax.annotation.Nonnull LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<Split>>> handler);

    void stockSymbols(@javax.annotation.Nonnull String exchange, @javax.annotation.Nullable String mic, @javax.annotation.Nullable String securityType, @javax.annotation.Nullable String currency, Handler<AsyncResult<List<StockSymbol>>> handler);

    void stockSymbols(@javax.annotation.Nonnull String exchange, @javax.annotation.Nullable String mic, @javax.annotation.Nullable String securityType, @javax.annotation.Nullable String currency, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<StockSymbol>>> handler);

    void stockTick(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull LocalDate date, @javax.annotation.Nonnull Long limit, @javax.annotation.Nonnull Long skip, Handler<AsyncResult<TickData>> handler);

    void stockTick(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull LocalDate date, @javax.annotation.Nonnull Long limit, @javax.annotation.Nonnull Long skip, ApiClient.AuthInfo authInfo, Handler<AsyncResult<TickData>> handler);

    void stockUsaSpending(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull LocalDate from, @javax.annotation.Nonnull LocalDate to, Handler<AsyncResult<UsaSpendingResult>> handler);

    void stockUsaSpending(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull LocalDate from, @javax.annotation.Nonnull LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<UsaSpendingResult>> handler);

    void stockUsptoPatent(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull LocalDate from, @javax.annotation.Nonnull LocalDate to, Handler<AsyncResult<UsptoPatentResult>> handler);

    void stockUsptoPatent(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull LocalDate from, @javax.annotation.Nonnull LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<UsptoPatentResult>> handler);

    void stockVisaApplication(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull LocalDate from, @javax.annotation.Nonnull LocalDate to, Handler<AsyncResult<VisaApplicationResult>> handler);

    void stockVisaApplication(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull LocalDate from, @javax.annotation.Nonnull LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<VisaApplicationResult>> handler);

    void supplyChainRelationships(@javax.annotation.Nonnull String symbol, Handler<AsyncResult<SupplyChainRelationships>> handler);

    void supplyChainRelationships(@javax.annotation.Nonnull String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SupplyChainRelationships>> handler);

    void supportResistance(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull String resolution, Handler<AsyncResult<SupportResistance>> handler);

    void supportResistance(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull String resolution, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SupportResistance>> handler);

    void symbolChange(@javax.annotation.Nonnull String from, @javax.annotation.Nonnull String to, Handler<AsyncResult<SymbolChange>> handler);

    void symbolChange(@javax.annotation.Nonnull String from, @javax.annotation.Nonnull String to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SymbolChange>> handler);

    void symbolSearch(@javax.annotation.Nonnull String q, @javax.annotation.Nullable String exchange, Handler<AsyncResult<SymbolLookup>> handler);

    void symbolSearch(@javax.annotation.Nonnull String q, @javax.annotation.Nullable String exchange, ApiClient.AuthInfo authInfo, Handler<AsyncResult<SymbolLookup>> handler);

    void technicalIndicator(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull String resolution, @javax.annotation.Nonnull Long from, @javax.annotation.Nonnull Long to, @javax.annotation.Nonnull String indicator, @javax.annotation.Nullable Object indicatorFields, Handler<AsyncResult<Object>> handler);

    void technicalIndicator(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull String resolution, @javax.annotation.Nonnull Long from, @javax.annotation.Nonnull Long to, @javax.annotation.Nonnull String indicator, @javax.annotation.Nullable Object indicatorFields, ApiClient.AuthInfo authInfo, Handler<AsyncResult<Object>> handler);

    void transcripts(@javax.annotation.Nonnull String id, Handler<AsyncResult<EarningsCallTranscripts>> handler);

    void transcripts(@javax.annotation.Nonnull String id, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EarningsCallTranscripts>> handler);

    void transcriptsList(@javax.annotation.Nonnull String symbol, Handler<AsyncResult<EarningsCallTranscriptsList>> handler);

    void transcriptsList(@javax.annotation.Nonnull String symbol, ApiClient.AuthInfo authInfo, Handler<AsyncResult<EarningsCallTranscriptsList>> handler);

    void upgradeDowngrade(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable LocalDate from, @javax.annotation.Nullable LocalDate to, Handler<AsyncResult<List<UpgradeDowngrade>>> handler);

    void upgradeDowngrade(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable LocalDate from, @javax.annotation.Nullable LocalDate to, ApiClient.AuthInfo authInfo, Handler<AsyncResult<List<UpgradeDowngrade>>> handler);

}
