def modulo(x, y):
    """
    A1:
    compute x modulo y

    Parameters
    ----------
    x : int or float
    y : int

    Returns
    -------
    int or float
        x modulo y
    """
    while x - y >= 0:
        x -= y
    return x


"""
Aufgabe 2:
"""


def colatz(n):
    """
    A2:
    compute the colatz-sequence starting with n

    Parameters
    ----------
    n : int
        colatz-sequence

    Returns
    -------
    list of int
        colatz-sequence
    int
        length of the colatz-sequence
    """
    colatz_sequence = [n]
    while n != 1:
        if n % 2 == 0:
            n = int(n / 2)
        else:
            n = 3 * n + 1
        colatz_sequence.append(n)
        print(n)
    return "Colatz-Folge: {}; Länge der Colatz-Folge: {}".format(colatz_sequence, len(colatz_sequence))



"""
AUFGABE 3:
"""
    
def weekday_counter(start_date, end_date):
    """
    Count the number of times that 13.xx.xxxx was on a Monday, Tuesday, ...
    
    Parameters
    ----------
    start_date : str
        first day as dd.mm.yyyy
    end_date : str
        last day as dd.mm.yyyy
    
    Returns
    -------
    wd_counter : dict
        number of weekdays on 13.xx.xxxx between start_date and end_date
    
    """
    wd_counter = {'Monday': 0, 'Tuesday' : 0, 'Wednesday' : 0, 'Thursday' : 0,
                'Friday' : 0, 'Saturday' : 0, 'Sunday' : 0} # empty dict
    break_condition = False # break condition
    # compute first 13.xx.xxxx since start_date
    start_date = list(map(int, start_date.split('.')))
    if start_date[0] <= 13:
        start_date[0] = 13
    else:
        start_date[0] = 13
        if start_date[1] != 12:
            start_date[1] += 1
        else:
            start_date[1] = 1
            start_date[2] += 1       
    # compute last 13.xx.xxxx before end_date 
    end_date = list(map(int, end_date.split('.')))
    if end_date[0] >= 13:
        end_date[0] = 13
    else:
        end_date[0] = 13
        if end_date[1] != 1:
            end_date[1] -= 1
        else:
            end_date[1] = 12
            end_date[2] -= 1
            
    date = start_date
    while not break_condition:
        if date == end_date:
            break_condition = True
        # use function from excercise 1.1    
        weekday = weekdays(date[0], date[1], date[2])
        wd_counter[weekday] += 1
        if date[1] != 12:
            date[1] += 1
        else:
            date[1] = 1
            date[2] += 1
    
    return wd_counter
    
def weekdays(day,month,year):
    r"""
    Aufgabe 1 aus Übung 1
    
    Parameters
    ----------
    day: integer value,
        day of the month, has to be be between 1 and 31
    month: integer value,
        month as in the gregorian calender, has to  be between 1 and 12
    year: integer value,
        year

    Returns
    -------
    weekday: string

    """

    # check input data
    if not (day > 0 and day <= 31):
        raise ValueError('please, choose a day between 1 and 31.')
    if not (month >0 and month <= 12):
        raise ValueError('please, choose a month between 1 and 12.')
    if (month == 2 and day > 29):
        raise ValueError('The Month February as maximal 29 days')
    if (month in [4,6,9,11] and day> 30):
        raise ValueError('April, June, September and November have just 30 days')

    # initialize weekday list
    weekday = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']

    #Calculate Weekdays by Georg Glaeser
    #https://de.wikipedia.org/wiki/Wochentagsberechnung
    transformed_month = ((month - 3) % 12) +1
    century = int(year/100)
    decade = year - century*100

    #adapted decade and century

    if (month == 1) | (month == 2):
        decade = (decade - 1) % 100
        if decade == 99:
            century -= 1

    w = int((day + (2.6 * transformed_month - 0.2) + decade + (decade/4) + (century/4) - 2 * century) % 7)

    return weekday[w]


"""
Aufgabe 4
"""



if __name__ == '__main__':
"""    print("Enter start-date as dd.mm.yyyy:")
    start_date = input()
    print("Enter end-date as dd.mm.yyyy:")
    end_date = input()
    print("Weekdays for 13.xx.xxxx:")
    print(weekday_counter(start_date, end_date))"""
    