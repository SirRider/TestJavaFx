class Context:
    def __init__(self, strategy):
        self.strategy = strategy

    def execute(self, a, b):
        return self.strategy(a, b)

class AddStrategy:
    def __call__(self, a, b):
        return a + b

class SubStrategy:
    def __call__(self, a, b):
        return a - b

class MultStrategy:
	def __call__(self, a, b):
		return a * b

class DivisionStrategy:
	def __call__(self, a, b):
		return a / b



class ContextB:
	def __init__(self, strategy):
		self.strategy = strategy


class Strategy:
	def algorithmen(self, name):
		pass

class StrategyA(Strategy):
	def algorithmen(self, name):
		return f"{name} Loser"

class StrategyB(Strategy):
	def algorithmen(self, name):
		return f"{name} Winner"



if __name__ == '__main__':
	context = ContextB(StrategyA())
	print(context.strategy.algorithmen("Wolki"))


	context = ContextB(StrategyB())
	print(context.strategy.algorithmen("Emmanuel"))
	"""
	context = Context(AddStrategy())
	print('10 + 6 =', context.execute(10, 6))
	# 10 + 6 = 16

	context.strategy = SubStrategy()
	print('10 - 6 =', context.execute(10, 6))
	# 10 - 6 = 4

	context.strategy = MultStrategy()
	print('10 * 6 =', context.execute(10, 6))

	context.strategy = DivisionStrategy()
	print('10 / 6 =', context.execute(10, 6))
"""
