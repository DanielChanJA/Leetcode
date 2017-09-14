def get_max_profit(stock_prices_list):

    if len(stock_prices_list) < 2:
        return "ERR"

    minimum = stock_prices_list[0]
    max_profit = stock_prices_list[1] - minimum

    for i in range(1, len(stock_prices_list)):

        current_profit = stock_prices_list[i] - minimum

        max_profit = max(max_profit, current_profit)

        minimum = min(minimum, stock_prices_list[i])

    return max_profit

yesterdays_prices = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

if __name__ == "__main__":

    print("Max Profit: {}".format(get_max_profit(yesterdays_prices)))
