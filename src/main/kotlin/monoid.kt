

interface Semigroup<A> {
    /**
     * Combine two [A] values.
     */
    fun A.combine(b: A): A

    operator fun A.plus(b: A): A =
            this.combine(b)

   // fun A.maybeCombine(b: A?): A = Option.fromNullable(b).fold({ this }, { combine(it) })
}



interface Monoid<A> : Semigroup<A> {
    /**
     * A zero value for this A
     */
    fun empty(): A

    /**
     * Combine an [Collection] of [A] values.
     */
    fun Collection<A>.combineAll(): A =
            if (isEmpty()) empty() else reduce { a, b -> a.combine(b) }

    /**
     * Combine an array of [A] values.
     */
    fun combineAll(elems: List<A>): A = elems.combineAll()

    companion object
}