class Context:
	def __init__(self, strategy):
		self.strategy = strategy

class Strategy:
	def algorithmen(self, name):
		pass

class StrategyA(Strategy):
	def algorithmen(self, name):
		print("Strategy A")
		return f"{name}: Loser"

class StrategyB(Strategy):
	def algorithmen(self, name):
		print("Strategy B")
		return f"{name}: Winner"

if __name__ == '__main__':
	context = Context(StrategyA())
	print(context.strategy.algorithmen("Fremder"))


	context = Context(StrategyB())
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
