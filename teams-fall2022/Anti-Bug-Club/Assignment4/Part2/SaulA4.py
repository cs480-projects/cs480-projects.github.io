import io
from flask import Response
from matplotlib.backends.backend_agg import FigureCanvasAgg as FigureCanvas
from matplotlib.figure import Figure
import matplotlib as plt
from flask import Flask
import pandas as pd
import numpy as np
plt.rcParams["figure.figsize"] = [7.50, 3.50]
plt.rcParams["figure.autolayout"] = True
applePrice = {
    'Month':['Jan','Feb','Mar','Apr','May','July','June','Aug','Sept','Oct','Nov','Dec'],
    'Price Average' : [1.43,1.32,1.31,1.28,1.28,1.29,1.34,1.35,1.37,1.37,1.39,1.45]
}
df = pd.DataFrame(applePrice)

app = Flask(__name__)


@app.route('/')
def plot_png():
   fig = Figure()
   axis = fig.add_subplot(1, 1, 1)
   axis.plot(df['Month'],df['Price Average'])
   axis.set_title('Average Monthly Apple Prices in 2021')
   output = io.BytesIO()
   FigureCanvas(fig).print_png(output)
   return Response(output.getvalue(), mimetype='image/png')

app.run(debug=True)