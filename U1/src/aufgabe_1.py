def weekdays(day,month,year):
    r"""

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
    if not (month >0 and month <12):
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

    w = (day + int(2.6 * transformed_month - 0.2) + decade + (decade//4) + (century//4) - 2 * century) % 7

    return weekday[w]

print('scipt gives you the weekday of the entered date')
date = input('Enter date in form day,month,year :')
date = date.split(',')
day, month, year = int(date[0]), int(date[1]), int(date[2])

weekday = weekdays(day, month, year)
print(day,'.',month,'.',year,'is a', weekday)
